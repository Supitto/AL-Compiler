package Tabelas


public class FuncoesGlobais
{
	//Variaveis internas
	private HashMap<String,FunctionArgs> funcoes;
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
			if(funcoes.get(nome) == new FunctionArgs(nome, tipo_retorno, args))
			{
				return true;
			}
		}
		return false;
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
}
