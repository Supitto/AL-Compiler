package tabelas;

import java.util.HashMap;
import java.util.Map;

public class TabelaFuncoes {
    public class EntradaTabelaFuncoes {
        private Map<String, Tipo> parametros;
        private Tipo tipoRetorno;

        public EntradaTabelaFuncoes() { this.parametros = new HashMap<String, Tipo>(); }

        public boolean parametroDeclarado(String nome) {
            return parametros.containsKey(nome);
        }

        public Tipo getTipoParametro(String nome) {
            if (!parametroDeclarado(nome)) { return null; }
            return parametros.get(nome);
        }

        public boolean inserirParametro(String nome, Tipo tipo) {
            if (parametroDeclarado(nome)) { return false; }
            parametros.put(nome, tipo);
            return true;
        }

        public Tipo getTipoRetorno() { return this.tipoRetorno; }

        public Map<String, Tipo> getParametros() { return this.parametros; }

    }

    private Map<String, EntradaTabelaFuncoes> entradas;

    public TabelaFuncoes() {
        this.entradas = new HashMap<>();
    }

    public boolean funcaoDeclarada(String nome) {
        return entradas.containsKey(nome);
    }

    public boolean inserirFuncao(String nome) {
        if (funcaoDeclarada(nome)) { return false; }
        entradas.put(nome, new EntradaTabelaFuncoes());
        return true;
    }

    public EntradaTabelaFuncoes verificarEntrada(String nome) {
        if (!funcaoDeclarada(nome)) { return null; }
        return this.entradas.get(nome);
    }

    public Map<String, EntradaTabelaFuncoes> getEntradas() { return this.entradas; }

}
