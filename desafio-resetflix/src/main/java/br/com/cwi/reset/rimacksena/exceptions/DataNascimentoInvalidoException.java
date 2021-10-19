package br.com.cwi.reset.rimacksena.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DataNascimentoInvalidoException extends Exception {

    public DataNascimentoInvalidoException() {
        super("Não é possível cadastrar não nascidos.");
    }
}
