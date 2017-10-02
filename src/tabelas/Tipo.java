package tabelas;

public class Tipo {
    private String tipo;
    private boolean ponteiro;

    public void setTipo(String tipo, boolean ponteiro) {
        this.tipo = tipo;
        this.ponteiro = ponteiro;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        this.ponteiro = false;

        if (tipo.charAt(0) == '^') {
            this.tipo = tipo.substring(1);
            this.ponteiro = true;
        }
    }

    @Override
    public String toString() {
        String tipo = "";
        if (this.ponteiro) { tipo += "^"; }
        tipo += this.tipo;
        return tipo;
    }

    public String getNome() {
        return this.tipo;
    }

    public boolean isPonteiro() {
        return this.ponteiro;
    }

    public boolean equals(Tipo t)
    {
        retur t.toString() == this.toString();
    }
}
