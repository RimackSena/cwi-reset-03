package br.com.cwi.reset.rimacksena.exceptions;

public class DiretorJaCadastradoException extends Throwable {

    public DiretorJaCadastradoException() {
        super("Já existe um diretor cadastrado para o nome");
    }
}
