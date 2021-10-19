package br.com.cwi.reset.rimacksena.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DiretorJaCadastradoException extends Exception {

    public DiretorJaCadastradoException() {
        super("Já existe um diretor cadastrado para o nome");
    }
}
