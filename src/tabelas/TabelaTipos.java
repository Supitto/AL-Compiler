package tabelas;

import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;

public class TabelaTipos {
    ArrayList<EntradaTabelaTipos> entradas;

    TabelaTipos() { this.entradas = new ArrayList<>(); }

    public boolean tipoDeclarado(String nome) {
        for (EntradaTabelaTipos entrada : this.entradas) {
            if (entrada.nome.equals(nome)) { return true; }
        }
        return false;
    }

    public void adicionarTipo (String nome, ArrayList<Campo> campos) {
        if (this.tipoDeclarado(nome)) {
            throw new ParseCancellationException("Tipo ja declarado");
        }
        EntradaTabelaTipos entrada = new EntradaTabelaTipos();
        entrada.nome = nome;
        entrada.campos = campos;
        this.entradas.add(entrada);
    }

    public ArrayList<Campo> verificarCampos(String nome) {
        for (EntradaTabelaTipos entrada : this.entradas) {
            if (entrada.nome.equals(nome)) { return entrada.campos; }
        }
        return null;
    }

}
