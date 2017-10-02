package tabelas;

class Parametro
{
    //Variaveis internas
    private String id;
    private Tipo tipo;

    //Contrutores
    public Parametro (String _id, Tipo _tipo) //sem reclamaçoes sobre tipagem
    {
        id = _id;
        tipo = new Tipo();
        tipo.setTipo(_tipo.toString());
    }

    //Mensagens

    public boolean equal (Parametro p)
    {
        return p.getId()==this.getId() && p.getTipo().equals(this.getTipo())
    }

    public Parametro clone()
    {
        Tipo t;
        t.setTipo(this.tipo.toString());
        return new Parametro(id,t);
    }

    //Mensagens de Acesso

    public String getId() {
        return id;
    }

    public String getTipo()
    {
        return tipo.toString();
    }
}