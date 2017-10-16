package tabelas;

public class Tabelas {
    private TabelaVariaveis tabelaVariaveisGlobais;
    private TabelaProcedimentos tabelaProcedimentos;
    private TabelaFuncoes tabelaFuncoes;
    private TabelaTipos tabelaTiposGlobais;

    private TabelaVariaveis tabelaVariaveisLocais;
    private TabelaTipos tabelaTiposLocais;
    private boolean escopoLocal = false;

    public Tabelas() {
        this.tabelaVariaveisGlobais = new TabelaVariaveis();
        this.tabelaProcedimentos = new TabelaProcedimentos();
        this.tabelaFuncoes = new TabelaFuncoes();
        this.tabelaTiposGlobais = new TabelaTipos();
        this.tabelaVariaveisLocais = new TabelaVariaveis();
        this.tabelaTiposLocais = new TabelaTipos();
    }

    public TabelaVariaveis getTabelaVariaveisGlobais() { return this.tabelaVariaveisGlobais; }
    public TabelaProcedimentos getTabelaProcedimentos() { return this.tabelaProcedimentos; }
    public TabelaFuncoes getTabelaFuncoes() { return this.tabelaFuncoes; }
    public TabelaTipos getTabelaTiposGlobais() { return this.tabelaTiposGlobais; }
    public TabelaVariaveis getTabelaVariaveisLocais() { return this.tabelaVariaveisLocais; }
    public TabelaTipos getTabelaTiposLocais() { return this.tabelaTiposLocais; }

    private boolean entradaDeclaradaEscopoLocal(String nome) {
        return this.getTabelaVariaveisLocais().entradaDeclarada(nome)
                || this.getTabelaTiposLocais().tipoDeclarado(nome);
    }

    private boolean entradaDeclaradaEscopoGlobal(String nome) {
        return this.getTabelaVariaveisGlobais().entradaDeclarada(nome)
                || this.getTabelaProcedimentos().procedimentoDeclarado(nome)
                || this.getTabelaFuncoes().funcaoDeclarada(nome)
                || this.getTabelaTiposGlobais().tipoDeclarado(nome);
    }

    public boolean entradaDeclarada(String nome) {
        boolean itemDeclarado = false;
        if (escopoLocal) {
            itemDeclarado = entradaDeclaradaEscopoLocal(nome);
        }

        itemDeclarado = itemDeclarado || entradaDeclaradaEscopoGlobal(nome);

        return itemDeclarado;
    }

    public boolean variavelDeclarada(String nome) {
        if (escopoLocal) {
            return this.getTabelaVariaveisLocais().entradaDeclarada(nome)
                    || this.getTabelaVariaveisGlobais().entradaDeclarada(nome);
        }
        else { return this.getTabelaVariaveisGlobais().entradaDeclarada(nome); }
    }

    public boolean procedimentoDeclarado(String nome) {
        return this.getTabelaProcedimentos().procedimentoDeclarado(nome);
    }

    public boolean funcaoDeclarada(String nome) {
        return this.getTabelaFuncoes().funcaoDeclarada(nome);
    }

    public boolean tipoDeclarado(String nome) {
        if (escopoLocal) {
            return this.getTabelaTiposLocais().tipoDeclarado(nome)
                    || this.getTabelaTiposGlobais().tipoDeclarado(nome);
        }
        else { return this.getTabelaTiposGlobais().tipoDeclarado(nome); }
    }

    public Tipo getTipoVariavel(String nome) {
        if (escopoLocal && this.entradaDeclaradaEscopoLocal(nome)) {
            return this.getTabelaVariaveisLocais().getTipo(nome);
        }
        else { return this.getTabelaVariaveisGlobais().getTipo(nome); }
    }

    public TabelaProcedimentos.EntradaTabelaProcedimentos getProcedimento(String nome) {
        return this.getTabelaProcedimentos().getEntrada(nome);
    }

    public TabelaFuncoes.EntradaTabelaFuncoes getFuncao(String nome) {
        return this.getTabelaFuncoes().getEntrada(nome);
    }

    public TabelaTipos.EntradaTabelaTipos getTipo(String nome) {
        if (escopoLocal && this.entradaDeclaradaEscopoLocal(nome)) {
            return this.getTabelaTiposLocais().getEntrada(nome);
        }
        else { return this.getTabelaTiposGlobais().getEntrada(nome); }
    }

    public boolean inserirVariavel(String nome, Tipo tipo) {
        if (escopoLocal) {
            if (this.tabelaTiposLocais.tipoDeclarado(nome)) { return false; }
            return this.getTabelaVariaveisLocais().inserirEntrada(nome, tipo);
        }
        else {
            if (entradaDeclarada(nome)) { return false; }
            return this.getTabelaVariaveisGlobais().inserirEntrada(nome, tipo);
        }
    }

    public boolean inserirProcedimento(String nome) {
        if (entradaDeclarada(nome)) { return false; }

        return this.getTabelaProcedimentos().inserirProcedimento(nome);
    }

    public boolean inserirFuncao(String nome) {
        if (entradaDeclarada(nome)) { return false; }

        return this.getTabelaFuncoes().inserirFuncao(nome);
    }

    public boolean inserirTipo(String nome) {
        if (escopoLocal) {
            if (this.tabelaVariaveisLocais.entradaDeclarada(nome)) { return false; }
            return this.getTabelaTiposLocais().inserirTipo(nome);
        }
        else {
            if (entradaDeclarada(nome)) { return false; }
            return this.getTabelaTiposGlobais().inserirTipo(nome);
        }
    }

    public void inserirStruct() {
        if (escopoLocal) {
            this.getTabelaTiposLocais().inserirStruct();
        }
        else { this.getTabelaTiposGlobais().inserirStruct(); }
    }

    public Integer getNumStructs() {
        if (escopoLocal) {
            return this.getTabelaTiposLocais().getNumStructs();
        }
        else { return this.getTabelaTiposGlobais().getNumStructs(); }
    }

    public void entrarEscopoLocal() {
        this.escopoLocal = true;
        this.tabelaVariaveisLocais = new TabelaVariaveis();
        this.tabelaTiposLocais = new TabelaTipos();
    }

    public void sairEscopoLocal() { this.escopoLocal = false; }

}
