package br.com.cwi.reset.rimacksena;

public class AtorNaoEncontradoExeption extends Throwable {

    public AtorNaoEncontradoExeption() {
        super("Ator não encontrato com o filtro, favor informar outro filtro.");
    }
}
