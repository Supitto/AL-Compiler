package tabelas;


public class TabelaFuncoes
{
	//Variaveis internas
	private HashMap<String,FunctionArgs> funcoes;
	//gambiarra
	String ultimo ="";
	//Construtor
	public FuncoesGlobais()
	{
		funcoes = new HashMap<>();
	}
	//Metodos de Acesso
	public boolean verificar(String nome, String tipo_retorno, ArrayList<String> args)
	{
		if(funcoes.contains(nome))
		{
			if(funcoes.get(nome).equals(new FunctionArgs(nome, tipo_retorno, args)))
			{
				return true;
			}
		}
		return false;
	}

	public boolean verificar(String nome, ArrayList<String> args,int nroLinha)
	{
		boolean retorno = true;
		if(funcoes.contains(nome))
		{
			if(funcoes.get(nome).getArgs().size() != args.size()) return false;
			for(int i = 0;i < args.size() && retorno;i++)
			{
				retorno = retorno && args[i] == funcoes.get(nome).getArgs()[i].value;
				if(!retorno) AnalisadorSemantico.adicionarErro("Tipo incompativel",nroLinha);
			}			
		}
		return retorno;
	}

	public boolean verificar(FunctionArgs func_args)
	{
		if(funcoes.contains(func_args.getName()))
		{
			if(funcoes.get(nome).equals(func_args))
			{
				return true;
			}
		}
		return false;
	}

	public boolean addFuncao(String nome, String tipo_retorno, ArrayList<String> args)
	{
		if(!funcoes.contains(nome))
		{
			ultimo=nome;
			funcoes.add(new FunctionArgs(nome, tipo_retorno, args));
			return true;
		}
		return false;
	}

	public boolean addFuncao(FunctionArgs func_args)
	{
		if(!funcoes.contains(func_args.getName()))
		{
			funcoes.add(func_arg.getClone());
		}
		return false;
	}

	public void inserirArgNaUltima(String nome, String tipo)
	{
		funcoes[ultimo].addArg(nome,tipo);
	}
}
