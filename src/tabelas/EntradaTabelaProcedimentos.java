package tabelas;

import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;

public class EntradaTabelaProcedimentos {
    String nome;
    ArrayList<Parametro> parametros;

    public EntradaTabelaProcedimentos() { this.parametros = new ArrayList<>(); }

    public boolean parametroDeclarado(String nome) {
        for (Parametro parametro : this.parametros) {
            if (parametro.nome.equals(nome)) { return true; }
        }
        return true;
    }

    public void inserirParametro(String nome, TipoEstendido tipo) {
        if (this.parametroDeclarado(nome)) {
            throw new ParseCancellationException("Parametro ja declarado");
        }
        Parametro parametro = new Parametro();
        parametro.nome = nome;
        parametro.tipo = tipo;
        this.parametros.add(parametro);
    }

    public TipoEstendido verificarTipo(String nome) {
        for (Parametro parametro : this.parametros) {
            if (parametro.nome.equals(nome)) { return parametro.tipo; }
        }
        return null;
    }

}
