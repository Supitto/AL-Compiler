package tabelas;

import java.util.HashMap;
import java.util.Map;


public class TabelaVariaveis {
    private Map<String, Tipo> entradas;

    public TabelaVariaveis() {
        this.entradas = new HashMap<>();
    }

    public void listarEntradas() {
        for (Map.Entry<String, Tipo> entrada : entradas.entrySet())
        {
            String nome = entrada.getKey();
            String tipo = entrada.getValue().getNome();
            if (entrada.getValue().isPonteiro()) { tipo = "^" + tipo; }
            System.out.println("Nome: " + nome + "    Tipo: " + tipo);
        }
    }

    public boolean entradaDeclarada(String nome) {
        return entradas.containsKey(nome);
    }

    public boolean inserirEntrada(String nome, Tipo tipo) {
        if (this.entradaDeclarada(nome)) { return false; }
        this.entradas.put(nome, tipo);
        return true;
    }

    public Tipo verificarTipo(String nome) {
        return this.entradas.get(nome);
    }

}
