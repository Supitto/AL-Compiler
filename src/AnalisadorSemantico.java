import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import tabelas.TabelaTipos;
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

    @Override
    public Map<String, String> visitDecl_local(LinguagemAlgoritimicaParser.Decl_localContext ctx) {
        // Verificacao de declaracao de constantes
        if (ctx.CONSTANTE() != null) {
            // TabelaVariaveis tabelaVariaveis = main.tabelas.getTabelaVariaveisGlobais();
            Tipo tipo = new Tipo();
            tipo.setTipo(ctx.tipo_basico().getText());
            main.tabelas.inserirVariavel(ctx.ID().getText(), tipo);
        }

        // Verificacao de declaracao de variaveis
        if (ctx.DECLARE() != null) {
            ArrayList<String> nomes = new ArrayList<>();
            Tipo tipo = new Tipo();

            Map<String, String> variaveis = visitVariavel(ctx.variavel());

            for (int i = 1; i < variaveis.size(); i++) { nomes.add(variaveis.get("Nome" + i)); }

            tipo.setTipo(variaveis.get("Tipo"));

            // Verificacao de existencia do tipo da variavel declarada
            if (!TipoBasico.isTipoBasico(tipo.getNome()) && !main.tabelas.tipoDeclarado(tipo.getNome())) {
                adicionarErro("tipo " + tipo.getNome() + " nao declarado", ctx.variavel().start.getLine());
                tipo.setTipo("nulo");
            }

            // Insercao das variaveis na tabela e verificacao de variaveis duplicadas
            for (int i = 0; i < nomes.size(); i++) {
                String nome = nomes.get(i);
                if (!main.tabelas.entradaDeclarada(nome)) {
                    main.tabelas.inserirVariavel(nome, tipo);
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

        // Verificacao para declaracao de tipos
        else if (ctx.tipo() != null) {
            Map<String, String> entradas = visitTipo(ctx.tipo());
            String nome = ctx.ID().getText();

            adicionarRegistro(nome, entradas, ctx.start.getLine());
        }
        return null;
    }

    // ====================================================================================
    // Funcao auxiliar para a adicao de tipos registro
    public String adicionarRegistro(String nome, Map<String, String> entradas, int numLinha) {
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
                nome = main.tabelas.getNumStructs().toString();
                main.tabelas.inserirStruct();
            }
            else {
                if (main.tabelas.entradaDeclarada(nome)) {
                    adicionarErro("identificador " + nome + " ja declarado anteriormente", numLinha);
                    return null;
                }
                else { main.tabelas.inserirTipo(nome); }
            }

            for (int i = 0; i < nomes.size(); i++) {
                String nomeCampo = nomes.get(i);
                if (main.tabelas.getTipo(nome).campoDeclarado(nomeCampo)) {
                    adicionarErro("campo " + nomeCampo + " ja declarado em " + nome, numLinha);
                }
                else {
                    int indice = Integer.parseInt(aux.get(i)) - 1;
                    TipoBasico tipoBasico = TipoBasico.valueOf(tipos.get(indice));
                    main.tabelas.getTipo(nome).inserirCampo(nomeCampo, tipoBasico);
                }
            }
        }
        return nome;
    }

    // Verificacao do escopo corrente - utilizada para determinar validade do comando retorne
    public boolean escopoFuncao(ParserRuleContext ctx) {
        if (ctx instanceof LinguagemAlgoritimicaParser.Decl_globalContext) {
            return (((LinguagemAlgoritimicaParser.Decl_globalContext) ctx).FUNCAO() != null);
        }
        else if (ctx.getParent() == null) {
            return false;
        }
        else {
            return escopoFuncao(ctx.getParent());
        }
    }

    // ====================================================================================


    // Visitor para declaracao de funcoes e procedimentos
    @Override
    public Map<String, String> visitDecl_global(LinguagemAlgoritimicaParser.Decl_globalContext ctx) {
        String nome = ctx.ID().getText();

        // Verificacao de colisao nas tabelas
        if (main.tabelas.entradaDeclarada(nome)) {
            adicionarErro("identificador " + nome + " ja declarado anteriormente", ctx.start.getLine());
        }

        // Insercao de procedimento ou funcao
        if (ctx.PROCEDIMENTO() != null) {
            main.tabelas.inserirProcedimento(nome);
        }
        else {
            String tipoRetorno = visitTipo_estendido(ctx.tipo_estendido()).get("Tipo");
            main.tabelas.inserirFuncao(nome);
            main.tabelas.getFuncao(nome).setTipoRetorno(new Tipo(tipoRetorno));
        }

        // Configuracao do escopo como local e criacao de listas de tipos
        main.tabelas.entrarEscopoLocal();
        Map<String, String> parametros = visitParametros_opcional(ctx.parametros_opcional());
        ArrayList<String> nomes = listarNomes(parametros);
        ArrayList<String> tipos = listarTipos(parametros);

        // Insercao de parametros no procedimento
        if (ctx.PROCEDIMENTO() != null) {
            for (i = 0; i < nomes.size(); i++) {
                main.tabelas.getProcedimento(nome).inserirParametro(nomes.get(i), new Tipo(tipos.get(i)));
            }
        }

        // Insercao de parametros e tipo de retorno da funcao
        else {
            for (i = 0; i < nomes.size(); i++) {
                main.tabelas.getFuncao(nome).inserirParametro(nomes.get(i), new Tipo(tipos.get(i)));
            }
        }

        // Verificacao das declaracoes e dos comandos da funcao e saida do escopo local
        visitDeclaracoes_locais(ctx.declaracoes_locais());
        visitComandos(ctx.comandos());
        main.tabelas.sairEscopoLocal();

        return null;
    }

    @Override
    public Map<String, String> visitParametros_opcional(LinguagemAlgoritimicaParser.Parametros_opcionalContext ctx) {
        Map<String, String> saida = visitParametro(ctx.parametro());

        // Deslocamento dos parametros adicionais na tabela
        for (LinguagemAlgoritimicaParser.Mais_parametrosContext contexto : ctx.mais_parametros()) {
            saida.putAll(deslocarParametros(visitMais_parametros(contexto), saida.size()/2));
        }

        return saida;
    }

    // ================================================================================
    // Funcao auxiliar para deslocamento dos indices dos parametros
    // Utilizada para adicao de parametros adicionais a tabela
    private Map<String, String> deslocarParametros(Map<String, String> entradas, int d) {
        Map<String, String> saida = new HashMap<>();
        boolean fimParametros = false;
        i = 1;

        // Cada parametro e deslocado de um valor d
        while (!fimParametros) {
            String nome = entradas.get("Nome" + i);
            String tipo = entradas.get("Tipo" + i);

            if (nome == null || tipo == null) { fimParametros = true; }
            else {
                saida.put("Nome" + (i + d), nome);
                saida.put("Tipo" + (i + d), tipo);
            }

            i++;
        }

        return saida;
    }

    // Funcao auxiliar para listagem de nomes
    public ArrayList<String> listarNomes(Map<String, String> entradas) {
        ArrayList<String> nomes = new ArrayList<>();
        boolean fimLista = false;
        int i = 1;

        while (!fimLista) {
            String nome = entradas.get("Nome" + i);
            if (nome == null) { fimLista = true; }
            else { nomes.add(nome); }

            i++;
        }

        return nomes;
    }

    // Funcao auxiliar para listagem de tipos
    public ArrayList<String> listarTipos(Map<String, String> entradas) {
        ArrayList<String> tipos = new ArrayList<>();
        boolean fimLista = false;
        int i = 1;

        while (!fimLista) {
            String tipo = entradas.get("Tipo" + i);
            if (tipo == null) { fimLista = true; }
            else { tipos.add(tipo); }

            i++;
        }

        return tipos;
    }
    // ================================================================================

    @Override
    public Map<String, String> visitParametro(LinguagemAlgoritimicaParser.ParametroContext ctx) {
        Map<String, String> saida = new HashMap<>();
        Map<String, String> variaveis = visitVariavel(ctx.variavel());
        boolean fimVariaveis = false;
        int i = 1;

        Tipo tipo = new Tipo();
        tipo.setTipo(variaveis.get("Tipo"));

        // Listagem dos nomes e dos tipos dos parametros
        while (!fimVariaveis) {
            String nome = variaveis.get("Nome" + i);
            if (nome == null) { fimVariaveis = true; }
            else {
                // Verificacao se tipo do parametro foi declarado
                if (!TipoBasico.isTipoBasico(tipo.getNome()) && !(main.tabelas.tipoDeclarado(tipo.toString()))) {
                    adicionarErro("tipo " + tipo.getNome() + " nao declarado", ctx.variavel().start.getLine());
                    tipo.setTipo("nulo");
                }

                saida.put("Nome" + i, nome);
                saida.put("Tipo" + i, tipo.toString());
                // Insercao dos parametros na tabela de variaveis locais
                main.tabelas.inserirVariavel(nome, tipo);
            }

            i++;
        }

        return saida;
    }

    @Override
    public Map<String, String> visitMais_parametros(LinguagemAlgoritimicaParser.Mais_parametrosContext ctx) {
        return this.visitParametro(ctx.parametro());
    }

    @Override
    public Map<String, String> visitCmd(LinguagemAlgoritimicaParser.CmdContext ctx) {
        // Verificacao de escopo para o comando 'retorne' - permitido apenas em funcoes
        if (ctx.retorne() != null) {
            if (!escopoFuncao(ctx)) {
                adicionarErro("comando retorne nao permitido nesse escopo", ctx.start.getLine());
            }
        }

        return super.visitCmd(ctx);
    }

    @Override
    public Map<String, String> visitAtribuicao(LinguagemAlgoritimicaParser.AtribuicaoContext ctx) {
        Map<String, String> ident = visitIdentificador(ctx.identificador());
        String nomeIdent = ident.get("Nome");
        String tipoIdent = ident.get("Tipo");
        String tipoExp = visitExpressao(ctx.expressao()).get("Tipo");

        if (tipoIdent != null) {
            // Casting para atribuicao entre real e inteiro
            if (tipoIdent.equals("real") && tipoExp != null && tipoExp.equals("inteiro")) {
                tipoExp = "real";
            }

            // Verificacao de atribuicao de tipos incompativeis
            if (tipoExp == null || !tipoIdent.equals(tipoExp)){
                adicionarErro("atribuicao nao compativel para " + nomeIdent, ctx.start.getLine());
            }
        }

        return null;
    }

    @Override
    public Map<String, String> visitChamada(LinguagemAlgoritimicaParser.ChamadaContext ctx) {
        Map<String, String> saida = new HashMap<>();
        String nome = ctx.ID().getText();

        // Verificacao de existencia da funcao ou procedimento
        if (!main.tabelas.funcaoDeclarada(nome) && ! main.tabelas.procedimentoDeclarado(nome)) {
            adicionarErro("funcao ou procedimento nao declarado", ctx.start.getLine());
        }

        // Listagem dos tipos dos argumentos passados
        ArrayList<String> tiposArgumentos = listarTipos(visitArgumentos_opcional(ctx.argumentos_opcional()));
        if (main.tabelas.funcaoDeclarada(nome)) {
            // Listagem dos tipos dos parametros da funcao e obtencao do tipo de retorno
            ArrayList<String> tiposParametros = main.tabelas.getTabelaFuncoes().getEntrada(nome).listaTipos();
            String tipoRetorno = main.tabelas.getTabelaFuncoes().getEntrada(nome).getTipoRetorno().toString();

            // Verificacao de incompatibilidade no numero de argumentos
            if (tiposParametros.size() != tiposArgumentos.size()) {
                adicionarErro("incompatibilidade de parametros na chamada de " + nome, ctx.start.getLine());
                saida.put("Tipo", null);
                return saida;
            }

            // Verificacao de incompatibilidade entre os argumentos e os parametros
            for (int i = 0; i < tiposArgumentos.size(); i++) {
                if (!tiposArgumentos.get(i).equals(tiposParametros.get(i))) {
                    adicionarErro("incompatibilidade de parametros na chamada de " + nome, ctx.start.getLine());
                    saida.put("Tipo", null);
                    return saida;
                }
            }
            saida.put("Tipo", tipoRetorno);
            return saida;
        }

        else {
            // Listagem dos tipos dos parametros do procedimento
            ArrayList<String> tiposParametros = main.tabelas.getTabelaProcedimentos().getEntrada(nome).listaTipos();

            // Verificacao de incompatibilidade no numero de argumentos
            if (tiposParametros.size() != tiposArgumentos.size()) {
                adicionarErro("incompatibilidade de parametros na chamada de " + nome, ctx.start.getLine());
            }

            // Verificacao de incompatibilidade entre os argumentos e os parametros
            else {
                for (int i = 0; i < tiposArgumentos.size(); i++) {
                    if (!tiposArgumentos.get(i).equals(tiposParametros.get(i))) {
                        adicionarErro("incompatibilidade de parametros na chamada de " + nome, ctx.start.getLine());
                    }
                }
            }

            saida.put("Tipo", null);
            return saida;
        }
    }

    @Override
    public Map<String, String> visitArgumentos_opcional(LinguagemAlgoritimicaParser.Argumentos_opcionalContext ctx) {
        Map<String, String> saida = new HashMap<>();

        // Escrita dos tipos de cada argumento no hash map
        if (ctx.expressao() != null) {
            String tipo = visitExpressao(ctx.expressao()).get("Tipo");
            saida.put("Tipo1", tipo);

            for (i = 0; i < ctx.mais_expressao().size(); i++) {
                tipo = visitMais_expressao(ctx.mais_expressao(i)).get("Tipo");
                saida.put("Tipo" + (i + 2), tipo);
            }
        }

        return saida;
    }

    @Override
    public Map<String, String> visitIdentificador(LinguagemAlgoritimicaParser.IdentificadorContext ctx) {
        Map<String, String> saida = new HashMap<>();

        String nomeIdentificador = ctx.ID().getText();
        String tipoIdentificador = null;
        String ponteiro;

        if (main.tabelas.variavelDeclarada(nomeIdentificador)) {
            tipoIdentificador = main.tabelas.getTipoVariavel(nomeIdentificador).toString();
            ponteiro = visitPonteiros_opcionais(ctx.ponteiros_opcionais()).get("Ponteiro");
            nomeIdentificador = ponteiro + nomeIdentificador;

            // Verificacao de desreferenciacao
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

        // Verificacao de dimensao da variavel
        if (ctx.dimensao() != null) {
            String dimensao = ctx.dimensao().getText();
            nomeIdentificador += dimensao;
        }

        // Verificacao dos campos de um identificador
        if (ctx.outros_ident().ID() != null) {
            String nomeCampo = visitOutros_ident(ctx.outros_ident()).get("Nome");
            nomeIdentificador += "." + nomeCampo;

            if (tipoIdentificador != null) {
                if (tipoIdentificador.charAt(0) == '^') {
                    adicionarErro("acesso a campo de ponteiro " + tipoIdentificador, ctx.start.getLine());
                } else {
                    TabelaTipos.EntradaTabelaTipos tipo = main.tabelas.getTipo(tipoIdentificador);

                    // Verificacao de existencia do campo do identificador na tabela de tipos
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
        // Listagem dos tipos de identificadores adicionais
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

    @Override
    public Map<String, String> visitVariavel(LinguagemAlgoritimicaParser.VariavelContext ctx) {
        String nome, tipo;
        Map<String, String> saida = new HashMap<>();

        nome = ctx.ID().getText();

        // Adicao do nome da primeira variavel
        saida.put("Nome1", nome);

        // Adicao dos nomes das variaveis restantes
        for (int i = 0; i < ctx.mais_var().size(); i++) {
            nome = visitMais_var(ctx.mais_var(i)).get("Nome");
            saida.put("Nome" + (i + 2), nome);
        }

        // Verificacao de tipo estendido
        if (ctx.tipo().tipo_estendido() != null) {
            tipo = this.visitTipo(ctx.tipo()).get("Tipo");
        }

        // Adicao de tipo registro (struct)
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

        // Adicao dos nomes e dos tipos dos campos do registro
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

        // Adicao de indicador de ponteiro no tipo, caso necessario
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

        // Expressoes logicas somente retornam valores logicos, a nao ser que haja apenas um argumento
        if (tipos.size() > 0 && tipo != null && !tipo.equals("logico")) {
            // adicionarErro("operador logico aplicado sobre" + tipo, numLinha);
            return null;
        }

        return tipo;
    }

    // Funcao para verificacao de compatibilidade de tipos em uma operacao
    public String verificarTipos(String tipo, ArrayList<String> tipos, int numLinha) {

        // Se algum dos operadores for de tipo null, a expressao sera de tipo null
        if (tipo == null || tipos.contains(null)) {
            return null;
        }

        // Listagem dos tipos compativeis
        ArrayList<String> tiposCompativeis = new ArrayList<>();
        tiposCompativeis.add(tipo);
        ArrayList<String> listaTiposIncompativeis = new ArrayList<>(tipos);

        // Verificacao de compatibilidade entre inteiro e real
        if (tipo.equals("inteiro")) {
            tiposCompativeis.add("real");

            if (tipos.contains("real")) {
                tipo = "real";
            }
        }

        else if (tipo.equals("real")) {
            tiposCompativeis.add("inteiro");
        }

        // Verificacao da existencia de tipos incompativeis entre os operadores
        listaTiposIncompativeis.removeAll(tiposCompativeis);
        if (!listaTiposIncompativeis.isEmpty()) {
            // String tipoIncompativel = listaTiposIncompativeis.get(0);
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

        // Obtencao dos tipos dos termos logicos adicionais
        for (LinguagemAlgoritimicaParser.Outros_termos_logicosContext contexto : ctx.outros_termos_logicos()) {
            tipos.add(visitOutros_termos_logicos(contexto).get("Tipo"));
        }

        // Verificacao de tipos
        tipo = verificarTiposExpLogica(tipo, tipos, ctx.start.getLine());

        System.out.println(tipo);

        saida.put("Tipo", tipo);
        return saida;
    }

    @Override
    public Map<String, String> visitMais_expressao(LinguagemAlgoritimicaParser.Mais_expressaoContext ctx) {
        Map<String, String> saida = new HashMap<>();
        String tipo = visitExpressao(ctx.expressao()).get("Tipo");

        saida.put("Tipo", tipo);
        return saida;
    }

    @Override
    public Map<String, String> visitTermo_logico(LinguagemAlgoritimicaParser.Termo_logicoContext ctx) {
        Map<String, String> saida = new HashMap<>();
        String tipo = visitFator_logico(ctx.fator_logico()).get("Tipo");
        ArrayList<String> tipos = new ArrayList<>();

        // Obtencao dos tipos dos termos logicos adicionais
        for (LinguagemAlgoritimicaParser.Outros_fatores_logicosContext contexto : ctx.outros_fatores_logicos()) {
            tipos.add(visitOutros_fatores_logicos(contexto).get("Tipo"));
        }

        // Verificacao de tipos
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

        // Verificacao de operadores adicionais
        for (LinguagemAlgoritimicaParser.Op_opcionalContext contexto : ctx.op_opcional()) {
            tipos.add(visitOp_opcional(contexto).get("Tipo"));
        }

        // Operacoes relacionais retornam valores logicos
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

        // Obtencao dos tipos dos termos adicionais
        for (LinguagemAlgoritimicaParser.Outros_termosContext contexto : ctx.outros_termos()) {
            tipos.add(visitOutros_termos(contexto).get("Tipo"));
        }

        // Verificacao de tipos
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

        // Obtencao dos tipos dos fatores adicionais
        for (LinguagemAlgoritimicaParser.Outros_fatoresContext contexto : ctx.outros_fatores()) {
            tipos.add(visitOutros_fatores(contexto).get("Tipo"));
        }

        // Verificacao de tipos
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

        // Obtencao dos tipos das parcelas adicionais
        for (LinguagemAlgoritimicaParser.Outras_parcelasContext contexto : ctx.outras_parcelas()) {
            tipos.add(visitOutras_parcelas(contexto).get("Tipo"));
        }

        // Verificacao de tipos
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

        else if (ctx.chamada() != null) {
            String tipo = visitChamada(ctx.chamada()).get("Tipo");
            saida.put("Tipo", tipo);
        }

        return saida;
    }

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