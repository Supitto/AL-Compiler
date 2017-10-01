package tabelas;


import java.util.HashMap;
import java.util.Map;

public class TabelaTipos {
    public class EntradaTabelaTipos {
        private Map<String, TipoBasico> campos;

        EntradaTabelaTipos() { this.campos = new HashMap<>(); }

        public boolean campoDeclarado(String nome) {
            return campos.containsKey(nome);
        }

        public boolean inserirCampo(String nome, TipoBasico tipo) {
            if (this.campoDeclarado(nome)) { return false; }
            campos.put(nome, tipo);
            return true;
        }

        public TipoBasico getTipo(String nome) {
            if (!campoDeclarado(nome)) { return null; }
            return campos.get(nome);
        }

    }

    private Map<String, EntradaTabelaTipos> entradas;

    TabelaTipos() { this.entradas = new HashMap<>(); }

    public boolean tipoDeclarado(String nome) {
        return entradas.containsKey(nome);
    }

    public boolean inserirTipo (String nome) {
        if (tipoDeclarado(nome)) { return false; }
        entradas.put(nome, new EntradaTabelaTipos());
        return true;
    }

    public EntradaTabelaTipos getEntrada(String nome) {
        if (!entradas.containsKey(nome)) { return null; }
        return entradas.get(nome);
    }



}
