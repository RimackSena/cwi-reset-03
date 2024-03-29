package br.com.cwi.reset.rimacksena.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IdNaoInformadoException extends Exception {

    public IdNaoInformadoException() {
        super("Campo obrigatório não informado. Favor informar o campo ID.");
    }
}
