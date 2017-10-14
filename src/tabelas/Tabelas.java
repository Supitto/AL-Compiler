package tabelas;

public class Tabelas {
    private TabelaVariaveis tabelaVariaveis;
    private TabelaProcedimentos tabelaProcedimentos;
    private TabelaFuncoes tabelaFuncoes;
    private TabelaTipos tabelaTipos;
    private TabelaVariaveis tabelaVariaveisDeEscopo;
    private TabelaTipos tabelaTiposDeEscopo;
    private TabelaFuncoes tabelaFuncoesDeEscopo;
    private boolean temEscopoLocal = false;

    public Tabelas()
    {
        this.tabelaVariaveis = new TabelaVariaveis();
        this.tabelaProcedimentos = new TabelaProcedimentos();
        this.tabelaFuncoes = new TabelaFuncoes();
        this.tabelaTipos = new TabelaTipos();
        this.tabelaTiposDeEscopo = new TabelaTipos();
        this.tabelaVariaveisDeEscopo = new TabelaVariaveis();
    }

    public boolean declaraVariavel(String nome, Tipo tipo)
    {
        if (this.variavelExiste(nome))
        {
            return false;
        }
        if(temEscopoLocal){
            tabelaVariaveisDeEscopo.inserirEntrada(nome, tipo);
            return true;
        }   
        tabelaVariaveis.inserirEntrada(nome, tipo);
        return true;
    }

    public boolean variavelExiste(String var)
    {
        bool retorno = false;
        if(temEscopoLocal) {
         retorno = tabelaVariaveisDeEscopo.entradaDeclarada(var);
        }
        return retorno || tabelaVariaveis.entradaDeclarada(var);
    }

    public boolean inserirFuncao(FunctionArgs arg)
    {
        if(funcaoExiste(arg))
        {
            return false;
        }
        if(temEscopoLocal)
        {
            tabelaFuncoesDeEscopo.addFuncao(arg);
            return true;
        }
        tabelaFuncoes.addFuncao(arg);
        return true;
    }

    public boolean funcaoExiste(FunctionArgs arg)
    {
        bool retorno = false;
        if(temEscopoLocal) {
            retorno = tabelaFuncoes.verificar(args);
        }
        return retorno || tabelaVariaveis.entradaDeclarada(var);
    }

    public void addArg(String nome,String tipo)
    {
        tabelaFuncoes.inserirArgNaUltima(nome, tipo);
    }

    public void entraEmEscopo(){
        temEscopoLocal=true;
        this.tabelaTiposDeEscopo = new TabelaTipos();
        this.tabelaVariaveisDeEscopo = new TabelaVariaveis();
    }

    public boolean verificaFuncao(String nome, List<String> Tipos)
    {
        tabelaFuncoes.
    }

    public string retornaTipoFuncao(String nome)
    {
        
    }

    public void saiDeEscopo(){temEscopoLocal=false;}


    public TabelaVariaveis getTabelaVariaveis() { return this.tabelaVariaveis; }
    public TabelaProcedimentos getTabelaProcedimentos() { return this.tabelaProcedimentos; }
    public TabelaFuncoes getTabelaFuncoes() { return this.tabelaFuncoes; }
    public TabelaTipos getTabelaTipos() { return this.tabelaTipos; }

}
