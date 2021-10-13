package br.com.cwi.reset.rimacksena;

public class DiretorNaoEncontradoExeption extends Exception{

    public DiretorNaoEncontradoExeption() {
        super("Diretor não encontrato com o filtro {filtro}, favor informar outro filtro.");
    }

}
