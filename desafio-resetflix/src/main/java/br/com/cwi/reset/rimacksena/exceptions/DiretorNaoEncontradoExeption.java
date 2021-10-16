package br.com.cwi.reset.rimacksena.exceptions;

public class DiretorNaoEncontradoExeption extends Exception{

    public DiretorNaoEncontradoExeption() {
        super("Diretor não encontrato com o filtro, favor informar outro filtro.");
    }

}
