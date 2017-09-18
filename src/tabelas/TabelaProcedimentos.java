package tabelas;

import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;

public class TabelaProcedimentos {
    ArrayList<EntradaTabelaProcedimentos> entradas;

    public TabelaProcedimentos() { this.entradas = new ArrayList<>(); }

    public boolean procedimentoDeclarado(String nome) {
        for (EntradaTabelaProcedimentos entrada : this.entradas) {
            if (entrada.nome.equals(nome)) { return true; }
        }
        return false;
    }

    public void inserirProcedimento(String nome, ArrayList<Parametro> parametros) {
        if (this.procedimentoDeclarado(nome)) {
            throw new ParseCancellationException("Procedimento ja declarado");
        }
        EntradaTabelaProcedimentos entrada = new EntradaTabelaProcedimentos();
        entrada.nome = nome;
        entrada.parametros = parametros;
        this.entradas.add(entrada);
    }

    public ArrayList<Parametro> verificarParametros(String nome) {
        for (EntradaTabelaProcedimentos entrada : entradas) {
            if (entrada.nome.equals(nome)) { return entrada.parametros; }
        }
        return null;
    }

}
