package tabelas;


import java.util.HashMap;
import java.util.Map;

class EntradaTabelaTipos {
    Map<String, TipoBasico> campos;

    EntradaTabelaTipos() { this.campos = new HashMap<>(); }

    public boolean campoDeclarado(String nome) {
        return campos.containsKey("nome");
    }

    public boolean inserirCampo(String nome, TipoBasico tipo) {
        if (this.campoDeclarado(nome)) { return false; }
        campos.put(nome, tipo);
        return true;
    }

    public String verificarTipo(String nome) {
        if (!campoDeclarado(nome)) { return null; }
        return campos.get(nome).toString();
    }

}

public class TabelaTipos {
    Map<String, EntradaTabelaTipos> entradas;

    TabelaTipos() { this.entradas = new HashMap<>(); }

    public boolean tipoDeclarado(String nome) {
        return entradas.containsKey(nome);
    }

    public boolean inserirTipo (String nome, EntradaTabelaTipos entrada) {
        if (tipoDeclarado(nome)) { return false; }
        entradas.put(nome, entrada);
        return true;
    }

    public EntradaTabelaTipos verificarEntrada(String nome) {
        if (!entradas.containsKey(nome)) { return null; }
        return entradas.get(nome);
    }

}
