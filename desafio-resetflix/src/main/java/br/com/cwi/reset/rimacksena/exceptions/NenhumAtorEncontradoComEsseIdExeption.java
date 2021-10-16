package br.com.cwi.reset.rimacksena.exceptions;

public class NenhumAtorEncontradoComEsseIdExeption extends Throwable {

    public NenhumAtorEncontradoComEsseIdExeption() {
        super("Nenhum ator encontrado com esse parâmetro id, favor verifique os parâmetros informados.");
    }
}
