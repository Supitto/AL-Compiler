import org.antlr.v4.runtime.misc.ParseCancellationException;
import tabelas.TabelaTipos;
import tabelas.TabelaVariaveis;
import tabelas.Tipo;
import tabelas.TipoBasico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

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
        this.visitCorpo(ctx.corpo());

        // Caso erros tenham sido encontrados durante a analise, encerra a compilacao
        if (!erro.isEmpty()) { throw new ParseCancellationException(erro); }
        return null;
    }

    // TODO: adicionar verificacao para constantes
    @Override
    public Map<String, String> visitDecl_local(LinguagemAlgoritimicaParser.Decl_localContext ctx) {
        if (ctx.DECLARE() != null) {
            ArrayList<String> nomes = new ArrayList<>();
            Tipo tipo = new Tipo();
            TabelaVariaveis tabelaVariaveis = main.tabelas.getTabelaVariaveis();
            TabelaTipos tabelaTipos = main.tabelas.getTabelaTipos();

            Map<String, String> variaveis = visitVariavel(ctx.variavel());

            for (int i = 1; i < variaveis.size(); i++) { nomes.add(variaveis.get("Nome" + i)); }

            tipo.setTipo(variaveis.get("Tipo"));

            if (!TipoBasico.isTipoBasico(tipo.getNome()) && !tabelaTipos.tipoDeclarado(tipo.getNome())) {
                adicionarErro("tipo " + tipo.getNome() + " nao declarado", ctx.start.getLine());
            }
            else {
                for (String nome : nomes) {
                    if (!tabelaVariaveis.entradaDeclarada(nome)) {
                        tabelaVariaveis.inserirEntrada(nome, tipo);
                    }
                    else {
                        adicionarErro("variavel " + nome + " ja declarada", ctx.start.getLine());
                    }
                }
            }
        }
        else if (ctx.tipo() != null) {
            TabelaTipos tabelaTipos = main.tabelas.getTabelaTipos();
            Map<String, String> entradas = visitTipo(ctx.tipo());
            String nome = ctx.ID().getText();
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
                    adicionarErro("tipo " + tipo + " nao primitivo", ctx.start.getLine());
                    tiposBasicos = false;
                }
            }

            // Escrita do tipo e seus campos na tabela de tipos
            if (tiposBasicos) {
                tabelaTipos.inserirTipo(nome);

                for (int i = 0; i < nomes.size(); i++) {
                    String nomeCampo = nomes.get(i);
                    if (tabelaTipos.getEntrada(nome).campoDeclarado(nomeCampo)) {
                        adicionarErro("campo " + nomeCampo + " ja declarado em " + nome, ctx.start.getLine());
                    }
                    else {
                        int indice = Integer.parseInt(aux.get(i)) - 1;
                        TipoBasico tipoBasico = TipoBasico.valueOf(tipos.get(indice));
                        tabelaTipos.getEntrada(nome).inserirCampo(nomeCampo, tipoBasico);
                    }
                }
            }
        }
        return null;
    }

    // TODO: adicionar avaliacao para resto da chamada
    @Override
    public Map<String, String> visitAtribuicao(LinguagemAlgoritimicaParser.AtribuicaoContext ctx) {
        TabelaVariaveis tabelaVariaveis = main.tabelas.getTabelaVariaveis();
        String nome = ctx.ID().getText();

        /* if (tabelaVariaveis.entradaDeclarada(nome)) {
            return null;
        } */
        if (!tabelaVariaveis.entradaDeclarada(nome)) {
            adicionarErro("variavel " + nome + " nao declarada", ctx.start.getLine());
        }

        System.out.println(i++);

        visitChamada_atribuicao(ctx.chamada_atribuicao());
        return null;
    }

    @Override
    public Map<String, String> visitChamada_atribuicao(LinguagemAlgoritimicaParser.Chamada_atribuicaoContext ctx) {
        if (ctx.expressao() != null) { visitExpressao(ctx.expressao()); }
        return null;
    }

    @Override
    public Map<String, String> visitLeia(LinguagemAlgoritimicaParser.LeiaContext ctx) {
        Map<String, String> id;
        Map<String, String> maisId;
        ArrayList<String> nomesId = new ArrayList<>();

        id = visitIdentificador(ctx.identificador());
        maisId = visitMais_ident(ctx.mais_ident());

        for (Map.Entry<String, String> entrada : maisId.entrySet()) {
            nomesId.add(entrada.getValue());
        }
        nomesId.add(id.get("Identificador"));

        TabelaVariaveis tabelaVariaveis = main.tabelas.getTabelaVariaveis();
        for (String nomeId : nomesId) {
            if (!tabelaVariaveis.entradaDeclarada(nomeId)) {
                this.adicionarErro("variavel " + nomeId + " nao declarada", ctx.start.getLine());
            }
        }

        return null;
    }

    @Override
    public Map<String, String> visitIdentificador(LinguagemAlgoritimicaParser.IdentificadorContext ctx) {
        String nomeIdentificador = ctx.ID().getText();
        Map<String, String> saida = new HashMap<>();
        saida.put("Identificador", nomeIdentificador);

        return saida;
    }

    @Override
    public Map<String, String> visitMais_ident(LinguagemAlgoritimicaParser.Mais_identContext ctx) {
        HashMap<String, String> identificadores = new HashMap<>();
        int size;

        if (ctx.mais_ident() != null) {
            identificadores.putAll(visitMais_ident(ctx.mais_ident()));
        }

        size = identificadores.size();
        if (ctx.identificador() != null) {
            String nomeIdent = visitIdentificador(ctx.identificador()).get("Identificador");
            identificadores.put("Identificador" + (size + 1), nomeIdent);
        }

        return identificadores;
    }

    // TODO: adicionar verificacao para tipos registro
    @Override
    public Map<String, String> visitVariavel(LinguagemAlgoritimicaParser.VariavelContext ctx) {
        String nome, tipo;
        Map<String, String> saida = new HashMap<>();

        nome = ctx.ID().getText();
        tipo = this.visitTipo(ctx.tipo()).get("Tipo");

        saida.put("Nome1", nome);

        for (int i = 0; i < ctx.mais_var().size(); i++) {
            nome = visitMais_var(ctx.mais_var(i)).get("Nome");
            saida.put("Nome" + (i + 2), nome);
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

    // TODO: adicionar verificacao para funcoes
    @Override
    public Map<String, String> visitParcela_unario(LinguagemAlgoritimicaParser.Parcela_unarioContext ctx) {
        HashMap<String, String> saida = new HashMap<>();
        TabelaVariaveis tabelaVariaveis = main.tabelas.getTabelaVariaveis();

        if (ctx.NUM_INT() != null) { saida.put("Tipo", "inteiro"); }
        else if (ctx.NUM_REAL() != null) { saida.put("Tipo", "real"); }
        else if (ctx.ID() != null) {
            String nomeId = ctx.ID().getText();
            if (ctx.chamada_partes().ABRE_PARENTESES() == null) {
                if (!tabelaVariaveis.entradaDeclarada(nomeId)) {
                    adicionarErro("variavel " + nomeId + " nao declarada", ctx.start.getLine());
                }
                else {
                    String tipo = tabelaVariaveis.getTipo(nomeId).toString();
                    saida.put("Tipo", tipo);
                }
            }
        }

        return saida;
    }

    // TODO: adicionar verificacao para funcoes
    @Override
    public Map<String, String> visitParcela_nao_unario(LinguagemAlgoritimicaParser.Parcela_nao_unarioContext ctx) {
        HashMap<String, String> saida = new HashMap<>();
        TabelaVariaveis tabelaVariaveis = main.tabelas.getTabelaVariaveis();

        if (ctx.CADEIA() != null) { saida.put("Tipo", "literal"); }
        else if (ctx.ID() != null) {
            String nomeId = ctx.ID().getText();
            if (!tabelaVariaveis.entradaDeclarada(nomeId)) {
                adicionarErro("variavel " + nomeId + " nao declarada", ctx.start.getLine());
            }
        }

        return saida;
    }

    @Override
    public Map<String,String> visitParametros_opcional(LinguagemAlgoritimicaParser.Parametro_opcionalContext ctx)
    {
        HashMap<String,String> temp = new HashMap<String,String>();
        temp.putall(visitParamtro(ctx.parametro());
        temp.put(temp.size,new FunctionArgs());
        return temp;
    }

}