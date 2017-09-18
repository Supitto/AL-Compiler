package tabelas;

import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;

public class EntradaTabelaFuncoes {
    String nome;
    ArrayList<Parametro> parametros;
    TipoEstendido tipoRetorno;

    public EntradaTabelaFuncoes() { this.parametros = new ArrayList<>(); }

    public boolean parametroDeclarado(String nome) {
        for (Parametro parametro : this.parametros) {
            if (parametro.nome.equals(nome)) { return true; }
        }
        return false;
    }

    public TipoEstendido verificarTipoParametro(String nome) {
        for (Parametro parametro : this.parametros) {
            if (parametro.nome.equals(nome)) { return parametro.tipo; }
        }
        return null;
    }

    public void inserirParametro(String nome, TipoEstendido tipo) {
        if (this.parametroDeclarado(nome)) {
            throw new ParseCancellationException("tabelas.Parametro ja declarado");
        }
        Parametro parametro = new Parametro();
        parametro.nome = nome;
        parametro.tipo = tipo;
        this.parametros.add(parametro);
    }

}
