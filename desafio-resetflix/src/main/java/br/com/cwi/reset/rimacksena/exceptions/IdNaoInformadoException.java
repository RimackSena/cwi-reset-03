package br.com.cwi.reset.rimacksena.exceptions;

public class IdNaoInformadoException extends Throwable {

    public IdNaoInformadoException() {
        super("Campo obrigatório não informado. Favor informar o campo ID.");
    }
}
