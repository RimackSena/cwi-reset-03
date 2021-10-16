package br.com.cwi.reset.rimacksena.exceptions;

public class AtorJaCadastradoException extends Throwable {

    public AtorJaCadastradoException() {
        super("Já existe um ator cadastrado para o nome");
    }
}
