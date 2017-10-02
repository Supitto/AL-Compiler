package tabelas;

public class TabelasGlobais {
    private TabelaVariaveis tabelaVariaveis;
    private TabelaProcedimentos tabelaProcedimentos;
    private TabelaFuncoes tabelaFuncoes;
    private TabelaTipos tabelaTipos;

    public TabelasGlobais() {
        this.tabelaVariaveis = new TabelaVariaveis();
        this.tabelaProcedimentos = new TabelaProcedimentos();
        this.tabelaFuncoes = new TabelaFuncoes();
        this.tabelaTipos = new TabelaTipos();
    }

    public TabelaVariaveis getTabelaVariaveis() { return this.tabelaVariaveis; }
    public TabelaProcedimentos getTabelaProcedimentos() { return this.tabelaProcedimentos; }
    public TabelaFuncoes getTabelaFuncoes() { return this.tabelaFuncoes; }
    public TabelaTipos getTabelaTipos() { return this.tabelaTipos; }

}
