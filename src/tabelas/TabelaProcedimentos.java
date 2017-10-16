package tabelas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TabelaProcedimentos {
    public class EntradaTabelaProcedimentos {
        private ArrayList<Parametro> parametros;

        public EntradaTabelaProcedimentos() { this.parametros = new ArrayList<>(); }

        public boolean parametroDeclarado(String nome) {
            for (Parametro parametro : this.parametros) {
                if (parametro.getId().equals(nome)) { return true; }
            }
            return false;
        }

        private int getPosicaoParametro(String nome) {
            for (int i = 0; i < this.parametros.size(); i++) {
                if (this.parametros.get(i).equals(nome)) { return i; }
            }
            return -1;
        }

        public boolean inserirParametro(String nome, Tipo tipo) {
            if (this.parametroDeclarado(nome)) { return false; }
            parametros.add(new Parametro(nome, tipo));
            return true;
        }

        public String getTipoParametro(String nome) {
            int indice = this.getPosicaoParametro(nome);
            if (indice == -1) { return null; }
            else {
                return this.parametros.get(indice).getTipo();
            }
        }

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
            for (Parametro parametro : this.parametros) {
                tipos.add(parametro.getTipo());
            }
            return tipos;
        }

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
