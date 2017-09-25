package tabelas;

import java.util.ArrayList;

public class TiposGlobais
{
	//Variaveis internas
	private ArrayList<String> tipos;
	
	//Construtor
	public TiposGlobais
	{
		tipos = new ArrayList<>();
		this.addTipo("inteiro");
		this.addTipo("literal");
		this.addTipo("real");
		this.addTipo("logico");;
	}

	//Metodos
	public boolean verificar(String tipo)
	{
		return this.tipos.contains(tipo);
	}
	
	public boolean addTipo(String tipo)
	{
		if(this.verificar(tipo))
		{
			return false;
		}
		this.tipos.add(tipo);
		return true;
	}

}
