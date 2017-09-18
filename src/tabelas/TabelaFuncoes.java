package tabelas;

import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;

public class TabelaFuncoes {
    ArrayList<EntradaTabelaFuncoes> entradas;

    public TabelaFuncoes() {
        this.entradas = new ArrayList<>();
    }

    public boolean funcaoDeclarada(String nome) {
        for (EntradaTabelaFuncoes entrada : this.entradas) {
            if (entrada.nome.equals(nome)) { return true; }
        }
        return false;
    }

    public ArrayList<Parametro> verificarParametros(String nome) {
        for (EntradaTabelaFuncoes entrada : this.entradas) {
            if (entrada.nome.equals(nome)) { return entrada.parametros; }
        }
        return null;
    }

    public TipoEstendido verificarTipoRetorno(String nome) {
        for (EntradaTabelaFuncoes entrada : this.entradas) {
            if (entrada.nome.equals(nome)) { return entrada.tipoRetorno; }
        }
        return null;
    }

    public void inserirFuncao(String nome, ArrayList<Parametro> parametros) {
        if (this.funcaoDeclarada(nome)) {
            throw new ParseCancellationException("Funcao ja declarada");
        }
        EntradaTabelaFuncoes entrada = new EntradaTabelaFuncoes();
        entrada.nome = nome;
        entrada.parametros = parametros;
        this.entradas.add(entrada);
    }
}
