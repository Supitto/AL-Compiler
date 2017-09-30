import org.antlr.v4.runtime.misc.ParseCancellationException;
import tabelas.TabelaTipos;
import tabelas.TabelaVariaveis;
import tabelas.Tipo;
import tabelas.TipoBasico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnalisadorSemantico extends LinguagemAlgoritimicaBaseVisitor<Map<String, String>>{

    private String erro;

    public AnalisadorSemantico() {
        super();
        erro = "";
    }

    public void adicionarErro(String erro) { this.erro += erro + "\n"; }

    @Override
    public Map<String, String> visitPrograma(LinguagemAlgoritimicaParser.ProgramaContext ctx) {
        this.visitCorpo(ctx.corpo());
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

            tipo.setTipo(variaveis.get("Tipo"), false);
            if (tipo.getNome().charAt(0) == '^') {
                tipo.setTipo(tipo.getNome().substring(1), true);
            }

            if (!TipoBasico.isTipoBasico(tipo.getNome()) && !tabelaTipos.tipoDeclarado(tipo)) {
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
        String nomeVar, tipoVar;
        int size;
        Map<String, String> saida = new HashMap<>();

        nomeVar = ctx.ID().getText();
        tipoVar = this.visitTipo(ctx.tipo()).get("Tipo");

        if (ctx.mais_var() != null) { saida.putAll(visitMais_var(ctx.mais_var())); }
        size = saida.size() + 1;

        saida.put("Nome" + size, nomeVar);
        saida.put("Tipo", tipoVar);

        return saida;
    }

    @Override
    public Map<String, String> visitMais_var(LinguagemAlgoritimicaParser.Mais_varContext ctx) {
        Map<String, String> nomes = new HashMap<>();
        int size;

        if (ctx.mais_var() != null) { nomes.putAll(visitMais_var(ctx.mais_var())); }
        size = nomes.size() + 1;

        if (ctx.ID() != null) { nomes.put("Nome" + size, ctx.ID().getText()); }
        return nomes;
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
