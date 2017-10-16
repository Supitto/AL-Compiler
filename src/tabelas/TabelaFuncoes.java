package tabelas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TabelaFuncoes {
    public class EntradaTabelaFuncoes {
        private ArrayList<Parametro> parametros;
        private Tipo tipoRetorno;

        public EntradaTabelaFuncoes() { this.parametros = new ArrayList<>(); }

        public boolean parametroDeclarado(String nome) {
            for (Parametro parametro: this.parametros) {
                if (parametro.getId().equals(nome)) { return true; }
            }
            return false;
        }

        int getPosicaoParametro(String nome) {
            for (int i = 0; i < this.parametros.size(); i++) {
                if (this.parametros.get(i).getId().equals(nome)) { return i; }
            }
            return -1;
        }

        public String getTipoParametro(String nome) {
            int indice = this.getPosicaoParametro(nome);
            if (indice == -1) { return null; }
            else { return this.parametros.get(indice).getTipo(); }
        }

        public boolean inserirParametro(String nome, Tipo tipo) {
            if (parametroDeclarado(nome)) { return false; }
            parametros.add(new Parametro(nome, tipo));
            return true;
        }

        public Tipo getTipoRetorno() { return this.tipoRetorno; }

        public void setTipoRetorno(Tipo tipo) { this.tipoRetorno = tipo; }

        public ArrayList<Parametro> getParametros() { return this.parametros; }

        public ArrayList<String> listaNomes() {
            ArrayList<String> nomes = new ArrayList<>();
            for (Parametro parametro : parametros) {
                nomes.add(parametro.getId());
            }
            return nomes;
        }

        public ArrayList<String> listaTipos() {
            ArrayList<String> tipos = new ArrayList<>();
            for (Parametro parametro : parametros) {
                tipos.add(parametro.getTipo());
            }
            return tipos;
        }

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

    public EntradaTabelaFuncoes getEntrada(String nome) {
        return this.entradas.get(nome);
    }

}
