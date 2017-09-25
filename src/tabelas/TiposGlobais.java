package tabelas;

import java.util.ArrayList;

public static class TiposGlobais
{
	//Variaveis internas
	private ArrayList<String> tipos = new ArrayList<>();

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
