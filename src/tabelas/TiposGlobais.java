
import java.util.ArrayList;

public class TiposGlobais
{
	//Variaveis internas
	ArrayList<String> tipos; 
	//Construtor
	public TiposGlobais()
	{
		this.tipos = new ArrayList<String>();
		this.tipos.add("inteiro");
		this.tipos.add("literal");
		this.tipos.add("real");
		this.tipos.add("logico");
	}
	//Metodos
	public bool verificar(String tipo)
	{
		return this.tipo.contains(tipo);
	}
	
	public bool addTipo(String tipo)
	{
		if(this.Verificar(tipo))
		{
			return false;
		}
		this.tipo.add(tipo)
		return true;
	}

}
