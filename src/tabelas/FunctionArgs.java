package tabelas;

public class FunctionArgs
{
		//Variaveis internas
		private String name;
		private String tipo_retorno;
		private ArrayList <HashMap.Entry<String,String>> tipo_args;  //nome x tipo
		//Construturores
		public FunctionArgs(String nome, String tipo, List<HashMap.Entry<String,String>> args)
		{
			tipo_args = new ArrayList<>();
			for(HashMap.Entry<String,String> s : args)//sei que isso nao é nescessario mas quis garantir a integridade dos itens
			{
				tipo_args.add(s);
			}
			name = nome;
			tipo_retorno = tipo;
		}
		public FunctionArgs(FunctionArgs fun)
		{
			name = fun.getName();
			tipo_retorno = fun.getTipoRetorno();
			tipo_args =  new ArrayList<>();			
			for(HashMap.Entry<String,String> s : fun.getArgs())
			{
				tipo_args.add(s);
			}
		}
		//Metodos de Acesso
		public String getName()//Provavelmente desnecessario devido a natureza do String em java
		{
			return name;
		}
		public String getTipoRetorno()
		{
			return tipo_retorno;
		}
		public ArrayList<String> getArgs()
		{
			return tipo_args;
		}
		public int getQtdArgs()//Caso queira fazer a verificação de quantidade externa a classe
		{
			return tipo_args.size();
		}
		//Implementacao da Clonable
		public FunctionArgs Clone()
		{
			return new FunctionArgs(this);
		}
		//Override do operador == (na verdade não é um override pq o java é feio e nao permite
		public boolean equals(FunctionArgs args) {
            if (this.getName() != args.getName()) return false;
            if (this.getTipoRetorno() != args.getTipoRetorno()) return false;
            if (this.getQtdArgs() != args.getQtdArgs()) return false;
            for (int i = 0; i < this.getQtdArgs(); i++)//Seria mais performartico um acesso unico ao qtd
            {
                if (this.getArgs()[i] != args.getArgs()[i]) return false;
                //mais uma vez seria mais
                //performatico se armazenasse
                //a lista e fizesse acesso
                //local
            }
            return true; //Sei que essa maneira de comparação é feia; Get along or get the fuck out!
		}
		
		public void adddArg(String nome, String tipo)
		{
			tipo_args.add(new HashMap.Entry<String,String>(nome,tipo));
		}
}
