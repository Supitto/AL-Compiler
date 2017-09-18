package tabelas;

import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;

public class EntradaTabelaTipos {
    String nome;
    ArrayList<Campo> campos;

    EntradaTabelaTipos() { this.campos = new ArrayList<>(); }

    public boolean campoDeclarado(String nome) {
        for (Campo campo : campos) {
            if (campo.nome.equals(nome)) { return true; }
        }
        return false;
    }

    public void inserirCampo(String nome, TipoBasico tipo) {
        if (this.campoDeclarado(nome)) {
            throw new ParseCancellationException("Campo ja declarado");
        }
        Campo campo = new Campo();
        campo.nome = nome;
        campo.tipo = tipo;
    }

    public TipoBasico verificarTipo(String nome) {
        for (Campo campo : campos) {
            if (campo.nome.equals(nome)) { return campo.tipo; }
        }
        return null;
    }

}
