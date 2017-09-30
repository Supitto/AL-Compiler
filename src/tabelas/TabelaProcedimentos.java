package tabelas;

import java.util.HashMap;
import java.util.Map;

class EntradaTabelaProcedimentos {
    Map<String, String> parametros;

    public EntradaTabelaProcedimentos() { this.parametros = new HashMap<>(); }

    public boolean parametroDeclarado(String nome) {
        return parametros.containsKey(nome);
    }

    public boolean inserirParametro(String nome, String tipo) {
        if (this.parametroDeclarado(nome)) { return false; }
        parametros.put(nome, tipo);
        return true;
    }

    public String verificarTipoParametro(String nome) {
        if (!parametros.containsKey(nome)) { return null; }
        return parametros.get(nome);
    }

    public Map<String, String> getParametros() { return this.parametros; }

}

public class TabelaProcedimentos {
    Map<String, EntradaTabelaProcedimentos> entradas;

    public TabelaProcedimentos() { this.entradas = new HashMap<>(); }

    public boolean procedimentoDeclarado(String nome) {
        return entradas.containsKey(nome);
    }

    public boolean inserirProcedimento(String nome, EntradaTabelaProcedimentos entrada) {
        if (this.procedimentoDeclarado(nome)) { return false; }
        entradas.put(nome, entrada);
        return true;
    }

    public EntradaTabelaProcedimentos verificarEntrada(String nome) {
        return this.entradas.get(nome);
    }

}
