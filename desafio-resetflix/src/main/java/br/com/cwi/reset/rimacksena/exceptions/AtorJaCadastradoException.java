package br.com.cwi.reset.rimacksena.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AtorJaCadastradoException extends Exception {

    public AtorJaCadastradoException() {
        super("Já existe um ator cadastrado para o nome");
    }
}
