package tabelas;

import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;

public class TabelaVariaveis {
    ArrayList<EntradaTabelaVariaveis> entradas;

    public TabelaVariaveis() {
        this.entradas = new ArrayList<>();
    }

    public void inserirEntrada(String nome, TipoEstendido tipo) {
        if (this.entradaDeclarada(nome)) {
            throw new ParseCancellationException("Variavel ja declarada");
        }
        EntradaTabelaVariaveis entrada = new EntradaTabelaVariaveis();
        entrada.nome = nome;
        entrada.tipo = tipo;
        this.entradas.add(entrada);
    }

    public boolean entradaDeclarada(String nome) {
        for (EntradaTabelaVariaveis entrada : this.entradas) {
            if (entrada.nome.equals(nome)) { return true; }
        }
        return false;
    }

    public TipoEstendido verificarTipo(String nome) {
        for (EntradaTabelaVariaveis entrada : this.entradas) {
            if (entrada.nome.equals(nome)) { return entrada.tipo; }
        }
        return null;
    }

    public boolean removerEntrada(String nome) {
        for (EntradaTabelaVariaveis entrada : this.entradas) {
            if (entrada.nome.equals(nome)) {
                this.entradas.remove(entrada);
                return true;
            }
        }
        return false;
    }

}
