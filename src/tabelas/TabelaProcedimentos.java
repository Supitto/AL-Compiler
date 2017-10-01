package tabelas;

import java.util.HashMap;
import java.util.Map;

public class TabelaProcedimentos {
    public class EntradaTabelaProcedimentos {
        private Map<String, Tipo> parametros;

        public EntradaTabelaProcedimentos() { this.parametros = new HashMap<>(); }

        public boolean parametroDeclarado(String nome) {
            return parametros.containsKey(nome);
        }

        public boolean inserirParametro(String nome, Tipo tipo) {
            if (this.parametroDeclarado(nome)) { return false; }
            parametros.put(nome, tipo);
            return true;
        }

        public Tipo getTipoParametro(String nome) {
            if (!parametros.containsKey(nome)) { return null; }
            return parametros.get(nome);
        }

        public Map<String, Tipo> getParametros() { return this.parametros; }

    }

    private Map<String, EntradaTabelaProcedimentos> entradas;

    public TabelaProcedimentos() { this.entradas = new HashMap<>(); }

    public boolean procedimentoDeclarado(String nome) {
        return entradas.containsKey(nome);
    }

    public boolean inserirProcedimento(String nome) {
        if (this.procedimentoDeclarado(nome)) { return false; }
        entradas.put(nome, new EntradaTabelaProcedimentos());
        return true;
    }

    public EntradaTabelaProcedimentos getEntrada(String nome) {
        return this.entradas.get(nome);
    }

}
