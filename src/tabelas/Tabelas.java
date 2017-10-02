package tabelas;

public class Tabelas {
    private TabelaVariaveis tabelaVariaveis;
    private TabelaProcedimentos tabelaProcedimentos;
    private TabelaFuncoes tabelaFuncoes;
    private TabelaTipos tabelaTipos;
    private TabelaVariaveis tabelaVariaveisDeEscopo;
    private TabelaTipos tabelaTiposDeEscopo;
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

    public boolean variavelExiste(String var)
    {
        bool retorno = false;
        if(temEscopoLocal) {
         retorno = tabelaVariaveisDeEscopo.entradaDeclarada(var);
        }
        return retorno || tabelaVariaveis.entradaDeclarada(var);
    }

    public boolean funcaoExiste(FunctionArgs arg)
    {
        bool retorno = false;
        if(temEscopoLocal) {
            retorno = tabelaFuncoes.verificar(String nome, String tipo_retorno, ArrayList<String> args)
        }
        return retorno || tabelaVariaveis.entradaDeclarada(var);
    }



    public void entraEmEscopo(){
        temEscopoLocal=true;
        this.tabelaTiposDeEscopo = new TabelaTipos();
        this.tabelaVariaveisDeEscopo = new TabelaVariaveis();
    }

    public void saiDeEscopo(){temEscopoLocal=false;}


    public TabelaVariaveis getTabelaVariaveis() { return this.tabelaVariaveis; }
    public TabelaProcedimentos getTabelaProcedimentos() { return this.tabelaProcedimentos; }
    public TabelaFuncoes getTabelaFuncoes() { return this.tabelaFuncoes; }
    public TabelaTipos getTabelaTipos() { return this.tabelaTipos; }

}
