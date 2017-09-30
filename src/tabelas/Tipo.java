package tabelas;

public class Tipo {
    private String tipo;
    private boolean ponteiro;

    public void setTipo(String tipo, boolean ponteiro) {
        this.tipo = tipo;
        this.ponteiro = ponteiro;
    }

    public String getNome() {
        return this.tipo;
    }

    public boolean isPonteiro() {
        return this.ponteiro;
    }
}
