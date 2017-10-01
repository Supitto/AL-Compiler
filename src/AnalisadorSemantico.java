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

    public AnalisadorSemantico() {
        super();
        erro = "";
    }

    // Escrita de erros semanticos encontrados
    public void adicionarErro(String erro) { this.erro += erro + "\n"; }

    @Override
    public Map<String, String> visitPrograma(LinguagemAlgoritimicaParser.ProgramaContext ctx) {
        this.visitCorpo(ctx.corpo());

        // Caso erros tenham sido encontrados durante a analise, encerra a compilacao
        if (!erro.isEmpty()) { throw new ParseCancellationException(erro); }

        return null;
    }

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
                adicionarErro("Linha " + ctx.start.getLine() + ": tipo " + tipo.getNome() + " nao declarado");
            }
            else {
                for (String nome : nomes) {
                    if (!tabelaVariaveis.entradaDeclarada(nome)) {
                        tabelaVariaveis.inserirEntrada(nome, tipo);
                    }
                    else {
                        adicionarErro("Linha " + ctx.start.getLine() + ": variavel " + nome + " ja declarada");
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
                    adicionarErro("Linha " + ctx.start.getLine() + ": tipo " + tipo + " nao primitivo");
                    tiposBasicos = false;
                }
            }

            // Escrita do tipo e seus campos na tabela de tipos
            if (tiposBasicos) {
                tabelaTipos.inserirTipo(nome);

                for (int i = 0; i < nomes.size(); i++) {
                    String nomeCampo = nomes.get(i);
                    if (tabelaTipos.getEntrada(nome).campoDeclarado(nomeCampo)) {
                        adicionarErro("Linha " + ctx.start.getLine() + ": campo " + nomeCampo + " ja declarado em " + nome);
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

    @Override
    public Map<String, String> visitLeia(LinguagemAlgoritimicaParser.LeiaContext ctx) {
        Map<String, String> id;

        id = visitIdentificador(ctx.identificador());
        String nomeId = id.get("Identificador");
        TabelaVariaveis tabelaVariaveis = main.tabelas.getTabelaVariaveis();
        if (!tabelaVariaveis.entradaDeclarada(nomeId)) {
            this.adicionarErro("Linha " + ctx.start.getLine() + ": variavel " + nomeId + " nao declarada");
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
}
