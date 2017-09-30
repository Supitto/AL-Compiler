package tabelas;

import java.util.HashMap;
import java.util.Map;

class EntradaTabelaFuncoes {
    private Map<String, String> parametros;
    private String tipoRetorno;

    public EntradaTabelaFuncoes() { this.parametros = new HashMap<String, String>(); }

    public boolean parametroDeclarado(String nome) {
        return parametros.containsKey(nome);
    }

    public String verificarTipoParametro(String nome) {
        if (!parametroDeclarado(nome)) { return null; }
        return parametros.get(nome);
    }

    public boolean inserirParametro(String nome, String tipo) {
        if (parametroDeclarado(nome)) { return false; }
        parametros.put(nome, tipo);
        return true;
    }

    public Map<String, String> getParametros() { return this.parametros; }

}

public class TabelaFuncoes {
    private Map<String, EntradaTabelaFuncoes> entradas;

    public TabelaFuncoes() {
        this.entradas = new HashMap<>();
    }

    public boolean funcaoDeclarada(String nome) {
        return entradas.containsKey(nome);
    }

    public boolean inserirFuncao(String nome, EntradaTabelaFuncoes entrada) {
        if (funcaoDeclarada(nome)) { return false; }
        entradas.put(nome, entrada);
        return true;
    }

    public EntradaTabelaFuncoes verificarEntrada(String nome) {
        if (!funcaoDeclarada(nome)) { return null; }
        return this.entradas.get(nome);
    }

    public Map<String, EntradaTabelaFuncoes> getEntradas() { return this.entradas; }

}
