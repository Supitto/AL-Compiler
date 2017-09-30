package tabelas;

import java.util.HashMap;
import java.util.Map;


public class TabelaVariaveis {
    Map<String, String> entradas;

    public TabelaVariaveis() {
        this.entradas = new HashMap<>();
    }

    public void listarEntradas() {
        for (Map.Entry<String, String> entrada : entradas.entrySet())
        {
            String nome = entrada.getKey();
            String tipo = entrada.getValue();
            System.out.println("Nome: " + nome + "    Tipo: " + tipo);
        }
    }

    public boolean entradaDeclarada(String nome) {
        return entradas.containsKey(nome);
    }

    public boolean inserirEntrada(String nome, String tipo) {
        if (this.entradaDeclarada(nome)) { return false; }
        this.entradas.put(nome, tipo);
        return true;
    }

    public String verificarTipo(String nome) {
        return this.entradas.get(nome);
    }

}
