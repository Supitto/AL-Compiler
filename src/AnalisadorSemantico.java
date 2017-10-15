import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import tabelas.TabelaTipos;
import tabelas.TabelaVariaveis;
import tabelas.Tipo;
import tabelas.TipoBasico;

import java.util.*;

public class AnalisadorSemantico extends LinguagemAlgoritimicaBaseVisitor<Map<String, String>>{

    // Erros semanticos armazenados
    private String erro;
    int i =1;
    public AnalisadorSemantico() {
        super();
        erro = "";
    }

    // Escrita de erros semanticos encontrados
    public void adicionarErro(String erro, int numLinha) {
        this.erro += "Linha " + numLinha + ": " + erro + "\n";
    }

    @Override
    public Map<String, String> visitPrograma(LinguagemAlgoritimicaParser.ProgramaContext ctx) {
        this.visitDeclaracoes(ctx.declaracoes());
        this.visitCorpo(ctx.corpo());

        // Caso erros tenham sido encontrados durante a analise, encerra a compilacao
        if (!erro.isEmpty()) { throw new ParseCancellationException(erro); }

        return null;
    }

    // TODO: adicionar verificacao para constantes
    @Override
    public Map<String, String> visitDecl_local(LinguagemAlgoritimicaParser.Decl_localContext ctx) {
        if (ctx.CONSTANTE() != null) {
            TabelaVariaveis tabelaVariaveis = main.tabelas.getTabelaVariaveis();
            Tipo tipo = new Tipo();
            tipo.setTipo(ctx.tipo_basico().getText());
            tabelaVariaveis.inserirEntrada(ctx.ID().getText(), tipo);
        }
        if (ctx.DECLARE() != null) {
            ArrayList<String> nomes = new ArrayList<>();
            Tipo tipo = new Tipo();
            TabelaVariaveis tabelaVariaveis = main.tabelas.getTabelaVariaveis();
            TabelaTipos tabelaTipos = main.tabelas.getTabelaTipos();

            Map<String, String> variaveis = visitVariavel(ctx.variavel());

            for (int i = 1; i < variaveis.size(); i++) { nomes.add(variaveis.get("Nome" + i)); }

            tipo.setTipo(variaveis.get("Tipo"));

            if (!TipoBasico.isTipoBasico(tipo.getNome()) && !tabelaTipos.tipoDeclarado(tipo.getNome())) {
                adicionarErro("tipo " + tipo.getNome() + " nao declarado", ctx.variavel().start.getLine());
                tipo.setTipo("nulo");
            }
            for (int i = 0; i < nomes.size(); i++) {
                String nome = nomes.get(i);
                if (!main.tabelas.entradaDeclarada(nome)) {
                    tabelaVariaveis.inserirEntrada(nome, tipo);
                }
                else {
                    if (i > 0) {
                        adicionarErro("identificador " + nome + " ja declarado anteriormente", ctx.variavel().mais_var(i - 1).start.getLine());
                    }
                    else {
                        adicionarErro("identificador " + nome + " ja declarado anteriormente", ctx.variavel().start.getLine());
                    }
                }
            }
        }
        else if (ctx.tipo() != null) {
            Map<String, String> entradas = visitTipo(ctx.tipo());
            String nome = ctx.ID().getText();

            adicionarRegistro(nome, entradas, ctx.start.getLine());
        }
        return null;
    }

    // ====================================================================================
    public String adicionarRegistro(String nome, Map<String, String> entradas, int numLinha) {
        TabelaTipos tabelaTipos = main.tabelas.getTabelaTipos();
        boolean tiposBasicos = true;

        ArrayList<String> tipos = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> aux = new ArrayList<>();

        // Listagem dos tipos em ordem de indice
        for (Map.Entry<String, String> entrada : entradas.entrySet()) {
            if (entrada.getKey().contains("Tipo")) {
                aux.add(entrada.getKey().charAt(3) + entrada.getValue());
            }
        }
        // Ordenacao do array por indice
        Collections.sort(aux);
        // Remocao dos indices das strings
        for (String tipo : aux) { tipos.add(tipo.substring(1)); }

        aux = new ArrayList<>();
        // Listagem dos nomes, acompanhados dos indices
        for (Map.Entry<String, String> entrada : entradas.entrySet()) {
            if (entrada.getKey().contains("Nome")) {
                nomes.add(entrada.getValue());
                aux.add(((Character) entrada.getKey().charAt(3)).toString());
            }
        }

        // Verificação de tipos basicos
        for (String tipo : tipos) {
            if (!TipoBasico.isTipoBasico(tipo)) {
                adicionarErro("tipo " + tipo + " nao primitivo", numLinha);
                nome = null;
                tiposBasicos = false;
            }
        }

        // Escrita do tipo e seus campos na tabela de tipos
        if (tiposBasicos) {
            if (nome.equals("_struct")) {
                nome = tabelaTipos.getNumStructs().toString();
                tabelaTipos.inserirStruct();
            }
            else { tabelaTipos.inserirTipo(nome); }

            for (int i = 0; i < nomes.size(); i++) {
                String nomeCampo = nomes.get(i);
                if (tabelaTipos.getEntrada(nome).campoDeclarado(nomeCampo)) {
                    adicionarErro("campo " + nomeCampo + " ja declarado em " + nome, numLinha);
                }
                else {
                    int indice = Integer.parseInt(aux.get(i)) - 1;
                    TipoBasico tipoBasico = TipoBasico.valueOf(tipos.get(indice));
                    tabelaTipos.getEntrada(nome).inserirCampo(nomeCampo, tipoBasico);
                }
            }
        }
        return nome;
    }

    public boolean escopoSubrotina (ParserRuleContext ctx) {
        if (ctx instanceof LinguagemAlgoritimicaParser.Decl_globalContext) {
            return true;
        }
        else if (ctx.getParent() == null) {
            return false;
        }
        else {
            return escopoSubrotina(ctx.getParent());
        }
    }

    // ====================================================================================

    @Override
    public Map<String, String> visitCmd(LinguagemAlgoritimicaParser.CmdContext ctx) {
        if (ctx.retorne() != null) {
            if (!escopoSubrotina(ctx)) {
                adicionarErro("comando retorne nao permitido nesse escopo", ctx.start.getLine());
            }
        }

        return super.visitCmd(ctx);
    }

    @Override
    public Map<String, String> visitAtribuicao(LinguagemAlgoritimicaParser.AtribuicaoContext ctx) {
        String nomeIdent = visitIdentificador(ctx.identificador()).get("Nome");
        String tipoIdent = visitIdentificador(ctx.identificador()).get("Tipo");
        String tipoExp = visitExpressao(ctx.expressao()).get("Tipo");

        if (tipoIdent != null) {
            if (tipoIdent.equals("real") && tipoExp != null && tipoExp.equals("inteiro")) {
                tipoExp = "real";
            }

            if (tipoExp == null || !tipoIdent.equals(tipoExp)){
                adicionarErro("atribuicao nao compativel para " + nomeIdent, ctx.start.getLine());
            }
        }

        return null;
    }

    @Override
    public Map<String, String> visitIdentificador(LinguagemAlgoritimicaParser.IdentificadorContext ctx) {
        Map<String, String> saida = new HashMap<>();
        TabelaVariaveis tabelaVariaveis = main.tabelas.getTabelaVariaveis();
        TabelaTipos tabelaTipos = main.tabelas.getTabelaTipos();

        String nomeIdentificador = ctx.ID().getText();
        String tipoIdentificador = null;
        String ponteiro;

        if (tabelaVariaveis.entradaDeclarada(nomeIdentificador)) {
            tipoIdentificador = tabelaVariaveis.getTipo(nomeIdentificador).toString();
            ponteiro = visitPonteiros_opcionais(ctx.ponteiros_opcionais()).get("Ponteiro");
            nomeIdentificador = ponteiro + nomeIdentificador;

            if(!ponteiro.equals("")) {
                if (tipoIdentificador.charAt(0) != '^') {
                    adicionarErro("desreferenciacao inadequada de " + nomeIdentificador, ctx.start.getLine());
                    tipoIdentificador = null;
                }
                else {
                    tipoIdentificador = tipoIdentificador.substring(1);
                }
            }
        }

        if (ctx.dimensao() != null) {
            String dimensao = ctx.dimensao().getText();
            nomeIdentificador += dimensao;
        }

        if (ctx.outros_ident().ID() != null) {
            String nomeCampo = visitOutros_ident(ctx.outros_ident()).get("Nome");
            nomeIdentificador += "." + nomeCampo;

            if (tipoIdentificador != null) {
                if (tipoIdentificador.charAt(0) == '^') {
                    adicionarErro("acesso a campo de ponteiro " + tipoIdentificador, ctx.start.getLine());
                } else {
                    TabelaTipos.EntradaTabelaTipos tipo = tabelaTipos.getEntrada(tipoIdentificador);

                    if (tipo.campoDeclarado(nomeCampo)) {
                        tipoIdentificador = tipo.getTipo(nomeCampo).toString();
                    } else {
                        tipoIdentificador = null;
                    }
                }
            }
        }

        if (tipoIdentificador == null) {
            adicionarErro("identificador " + nomeIdentificador + " nao declarado", ctx.start.getLine());
            tipoIdentificador = null;
        }

        saida.put("Nome", nomeIdentificador);
        saida.put("Tipo", tipoIdentificador);
        return saida;
    }

    @Override
    public Map<String, String> visitOutros_ident(LinguagemAlgoritimicaParser.Outros_identContext ctx) {
        Map<String, String> saida = new HashMap<>();
        String nomeIdentificador = ctx.ID().getText();

        saida.put("Nome", nomeIdentificador);
        return saida;
    }

    @Override
    public Map<String, String> visitMais_ident(LinguagemAlgoritimicaParser.Mais_identContext ctx) {
        HashMap<String, String> saida = new HashMap<>();
        int size;

        if (ctx.mais_ident() != null) {
            saida.putAll(visitMais_ident(ctx.mais_ident()));
        }

        size = saida.size();
        if (ctx.identificador() != null) {
            String tipoIdent = visitIdentificador(ctx.identificador()).get("Tipo");
            saida.put("Tipo" + (size + 1), tipoIdent);
        }

        return saida;
    }

    // TODO: adicionar verificacao para tipos registro
    @Override
    public Map<String, String> visitVariavel(LinguagemAlgoritimicaParser.VariavelContext ctx) {
        String nome, tipo;
        Map<String, String> saida = new HashMap<>();

        nome = ctx.ID().getText();

        saida.put("Nome1", nome);

        for (int i = 0; i < ctx.mais_var().size(); i++) {
            nome = visitMais_var(ctx.mais_var(i)).get("Nome");
            saida.put("Nome" + (i + 2), nome);
        }

        if (ctx.tipo().tipo_estendido() != null) {
            tipo = this.visitTipo(ctx.tipo()).get("Tipo");
        }

        else {
            Map<String, String> entradas = visitTipo(ctx.tipo());
            tipo = adicionarRegistro("_struct", entradas, ctx.start.getLine());
            if (tipo == null) { tipo = "nulo"; }
        }
        saida.put("Tipo", tipo);

        return saida;
    }

    @Override
    public Map<String, String> visitMais_var(LinguagemAlgoritimicaParser.Mais_varContext ctx) {
        Map<String, String> nomes = new HashMap<>();

        nomes.put("Nome", ctx.ID().getText());

        return nomes;
    }

    @Override
    public Map<String, String> visitRegistro(LinguagemAlgoritimicaParser.RegistroContext ctx) {
        Map<String, String> saida = new HashMap<>();

        if (ctx.variavel() != null) {
            for (int i = 0; i < ctx.variavel().size(); i++) {
                Map<String, String> variaveis = visitVariavel(ctx.variavel(i));
                for (Map.Entry<String, String> entrada : variaveis.entrySet()) {
                    saida.put("Var" + (i + 1) + entrada.getKey(), entrada.getValue());
                }
            }
        }

        return saida;
    }


    @Override
    public Map<String, String> visitTipo_estendido(LinguagemAlgoritimicaParser.Tipo_estendidoContext ctx) {
        Map<String, String> saida = new HashMap<>();
        String tipo = "";

        tipo += visitPonteiros_opcionais(ctx.ponteiros_opcionais()).get("Ponteiro");
        if (ctx.tipo_basico_ident() != null) {
            tipo += visitTipo_basico_ident(ctx.tipo_basico_ident()).get("Tipo");
        }

        saida.put("Tipo", tipo);
        return saida;
    }

    @Override
    public Map<String, String> visitPonteiros_opcionais(LinguagemAlgoritimicaParser.Ponteiros_opcionaisContext ctx) {
        Map<String, String> saida = new HashMap<>();
        String ponteiro = "";

        if (ctx.CIRCUNFLEXO() != null) { ponteiro += "^"; }

        saida.put("Ponteiro", ponteiro);
        return saida;
    }

    @Override
    public Map<String, String> visitTipo_basico_ident(LinguagemAlgoritimicaParser.Tipo_basico_identContext ctx) {
        Map<String, String> tipo = new HashMap<>();

        if (ctx.tipo_basico() == null) { tipo.put("Tipo", ctx.ID().getText()); }
        else { tipo.put("Tipo", ctx.tipo_basico().getText()); }

        return tipo;
    }

    @Override
    public Map<String, String> visitTipo_basico(LinguagemAlgoritimicaParser.Tipo_basicoContext ctx) {
        Map<String, String> tipo = new HashMap<>();
        tipo.put("Tipo", ctx.getText());
        return tipo;
    }

    // =====================================================================================

    public String verificarTiposExpLogica(String tipo, ArrayList<String> tipos, int numLinha) {
        tipo = verificarTipos(tipo,tipos,numLinha);

        if (tipos.size() > 0 && tipo != null && !tipo.equals("logico")) {
            // adicionarErro("operador logico aplicado sobre" + tipo, numLinha);
            return null;
        }

        return tipo;
    }

    // Funcao para verificacao de compatibilidade de tipos em uma operacao
    public String verificarTipos(String tipo, ArrayList<String> tipos, int numLinha) {

        if (tipo == null || tipos.contains(null)) {
            return null;
        }

        ArrayList<String> tiposCompativeis = new ArrayList<>();
        tiposCompativeis.add(tipo);
        ArrayList<String> listaTiposIncompativeis = new ArrayList<>(tipos);

        if (tipo.equals("inteiro")) {
            tiposCompativeis.add("real");

            if (tipos.contains("real")) {
                tipo = "real";
            }
        }

        else if (tipo.equals("real")) {
            tiposCompativeis.add("inteiro");
        }

        listaTiposIncompativeis.removeAll(tiposCompativeis);
        if (!listaTiposIncompativeis.isEmpty()) {
            String tipoIncompativel = listaTiposIncompativeis.get(0);
            // adicionarErro("operacao invalida entre " + tipo + " e " + tipoIncompativel, numLinha);
            return null;
        }

        return tipo;
    }

    // ====================================================================================


    @Override
    public Map<String, String> visitExpressao(LinguagemAlgoritimicaParser.ExpressaoContext ctx) {
        Map<String, String> saida = new HashMap<>();
        String tipo = visitTermo_logico(ctx.termo_logico()).get("Tipo");
        ArrayList<String> tipos = new ArrayList<>();

        for (LinguagemAlgoritimicaParser.Outros_termos_logicosContext contexto : ctx.outros_termos_logicos()) {
            tipos.add(visitOutros_termos_logicos(contexto).get("Tipo"));
        }

        tipo = verificarTiposExpLogica(tipo, tipos, ctx.start.getLine());

        System.out.println(tipo);

        saida.put("Tipo", tipo);
        return saida;
    }

    @Override
    public Map<String, String> visitTermo_logico(LinguagemAlgoritimicaParser.Termo_logicoContext ctx) {
        Map<String, String> saida = new HashMap<>();
        String tipo = visitFator_logico(ctx.fator_logico()).get("Tipo");
        ArrayList<String> tipos = new ArrayList<>();

        for (LinguagemAlgoritimicaParser.Outros_fatores_logicosContext contexto : ctx.outros_fatores_logicos()) {
            tipos.add(visitOutros_fatores_logicos(contexto).get("Tipo"));
        }

        tipo = verificarTiposExpLogica(tipo, tipos, ctx.start.getLine());

        saida.put("Tipo", tipo);
        return saida;
    }

    @Override
    public Map<String, String> visitOutros_termos_logicos(LinguagemAlgoritimicaParser.Outros_termos_logicosContext ctx) {
        Map<String, String> saida = new HashMap<>();

        saida.put("Tipo", visitTermo_logico(ctx.termo_logico()).get("Tipo"));
        return saida;
    }

    @Override
    public Map<String, String> visitFator_logico(LinguagemAlgoritimicaParser.Fator_logicoContext ctx) {
        Map<String, String> saida = new HashMap<>();
        String tipo = visitParcela_logica(ctx.parcela_logica()).get("Tipo");

        if (ctx.op_nao().children != null && !tipo.equals("logico")) {
            // adicionarErro("operador logico aplicado sobre " + tipo, ctx.start.getLine());
            saida.put("Tipo",null);
            return saida;
        }

        saida.put("Tipo", tipo);
        return saida;
    }

    @Override
    public Map<String, String> visitOutros_fatores_logicos(LinguagemAlgoritimicaParser.Outros_fatores_logicosContext ctx) {
        Map<String, String> saida = new HashMap<>();

        saida.put("Tipo", visitFator_logico(ctx.fator_logico()).get("Tipo"));
        return saida;
    }

    @Override
    public Map<String, String> visitParcela_logica(LinguagemAlgoritimicaParser.Parcela_logicaContext ctx) {
        Map<String, String> saida = new HashMap<>();

        if (ctx.BOOLEANO() != null) { saida.put("Tipo", "logico"); }
        if (ctx.exp_relacional() != null) {
            String tipo = visitExp_relacional(ctx.exp_relacional()).get("Tipo");
            saida.put("Tipo", tipo);
        }

        return saida;
    }

    @Override
    public Map<String, String> visitExp_relacional(LinguagemAlgoritimicaParser.Exp_relacionalContext ctx) {
        Map<String, String> saida = new HashMap<>();
        String tipo = visitExp_aritimetica(ctx.exp_aritimetica()).get("Tipo");
        ArrayList<String> tipos = new ArrayList<>();

        for (LinguagemAlgoritimicaParser.Op_opcionalContext contexto : ctx.op_opcional()) {
            tipos.add(visitOp_opcional(contexto).get("Tipo"));
        }

        if (!tipos.isEmpty()) {
            verificarTipos(tipo, tipos, ctx.start.getLine());
            if (tipo != null) { tipo = "logico"; }
        }

        saida.put("Tipo", tipo);
        return saida;
    }

    @Override
    public Map<String, String> visitExp_aritimetica(LinguagemAlgoritimicaParser.Exp_aritimeticaContext ctx) {
        Map<String, String> saida = new HashMap<>();
        String tipo = visitTermo(ctx.termo()).get("Tipo");
        ArrayList<String> tipos = new ArrayList<>();

        for (LinguagemAlgoritimicaParser.Outros_termosContext contexto : ctx.outros_termos()) {
            tipos.add(visitOutros_termos(contexto).get("Tipo"));
        }

        tipo = verificarTipos(tipo, tipos, ctx.start.getLine());

        saida.put("Tipo", tipo);
        return saida;
    }

    @Override
    public Map<String, String> visitOp_opcional(LinguagemAlgoritimicaParser.Op_opcionalContext ctx) {
        Map<String, String> saida = new HashMap<>();

        saida.put("Tipo", visitExp_aritimetica(ctx.exp_aritimetica()).get("Tipo"));
        return saida;
    }

    @Override
    public Map<String, String> visitTermo(LinguagemAlgoritimicaParser.TermoContext ctx) {
        Map<String, String> saida = new HashMap<>();
        String tipo = visitFator(ctx.fator()).get("Tipo");
        ArrayList<String> tipos = new ArrayList<>();

        for (LinguagemAlgoritimicaParser.Outros_fatoresContext contexto : ctx.outros_fatores()) {
            tipos.add(visitOutros_fatores(contexto).get("Tipo"));
        }

        tipo = verificarTipos(tipo, tipos, ctx.start.getLine());

        saida.put("Tipo", tipo);
        return saida;
    }

    @Override
    public Map<String, String> visitOutros_termos(LinguagemAlgoritimicaParser.Outros_termosContext ctx) {
        Map<String, String> saida = new HashMap<>();

        saida.put("Tipo", visitTermo(ctx.termo()).get("Tipo"));
        return saida;
    }

    @Override
    public Map<String, String> visitFator(LinguagemAlgoritimicaParser.FatorContext ctx) {
        Map<String, String> saida = new HashMap<>();
        String tipo = visitParcela(ctx.parcela()).get("Tipo");
        ArrayList<String> tipos = new ArrayList<>();

        for (LinguagemAlgoritimicaParser.Outras_parcelasContext contexto : ctx.outras_parcelas()) {
            tipos.add(visitOutras_parcelas(contexto).get("Tipo"));
        }

        tipo = verificarTipos(tipo, tipos, ctx.start.getLine());

        saida.put("Tipo", tipo);
        return saida;
    }

    @Override
    public Map<String, String> visitParcela(LinguagemAlgoritimicaParser.ParcelaContext ctx) {
        String tipo;
        Map<String, String> saida = new HashMap<>();

        if (ctx.parcela_unario() != null) {
            tipo = visitParcela_unario(ctx.parcela_unario()).get("Tipo");
            saida.put("Tipo", tipo);
        }
        else {
            tipo = visitParcela_nao_unario(ctx.parcela_nao_unario()).get("Tipo");
            if (tipo == null) {
                saida.put("Tipo",null);
                return saida;
            }
            saida.put("Tipo", tipo);
        }

        return saida;
    }

    @Override
    public Map<String, String> visitOutras_parcelas(LinguagemAlgoritimicaParser.Outras_parcelasContext ctx) {
        Map<String, String> saida = new HashMap<>();

        saida.put("Tipo", visitParcela(ctx.parcela()).get("Tipo"));
        return saida;
    }

    // =====================================================================================

    // TODO: adicionar verificacao para funcoes
    @Override
    public Map<String, String> visitParcela_unario(LinguagemAlgoritimicaParser.Parcela_unarioContext ctx) {
        HashMap<String, String> saida = new HashMap<>();

        if (ctx.NUM_INT() != null) { saida.put("Tipo", "inteiro"); }
        else if (ctx.NUM_REAL() != null) { saida.put("Tipo", "real"); }

        else if (ctx.identificador() != null) {
            String tipo = visitIdentificador(ctx.identificador()).get("Tipo");
            saida.put("Tipo", tipo);
        }

        else if (ctx.expressao() != null) {
            String tipo = visitExpressao(ctx.expressao()).get("Tipo");
            saida.put("Tipo", tipo);
        }

        return saida;
    }

    // TODO: adicionar verificacao para funcoes
    @Override
    public Map<String, String> visitParcela_nao_unario(LinguagemAlgoritimicaParser.Parcela_nao_unarioContext ctx) {
        HashMap<String, String> saida = new HashMap<>();

        if (ctx.CADEIA() != null) { saida.put("Tipo", "literal"); }
        else if (ctx.identificador() != null) {
            String tipo = visitIdentificador(ctx.identificador()).get("Tipo");

            if (tipo == null) {
                saida.put("Tipo",null);
                return saida;
            }
            else if (tipo.charAt(0) == '^') {
                //adicionarErro("referenciacao inadequada de " + tipo, ctx.start.getLine());
                saida.put("Tipo",null);
                return saida;
            }

            tipo = "^" + tipo;
            saida.put("Tipo", tipo);
        }

        return saida;
    }

}