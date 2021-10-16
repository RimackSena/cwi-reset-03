package br.com.cwi.reset.rimacksena.exceptions;

public class NenhumDiretorEncontradoExeption extends Throwable {

    public NenhumDiretorEncontradoExeption() {
        super("Nenhum diretor cadastrado, favor cadastar diretores.");
    }
}
