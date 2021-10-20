package br.com.cwi.reset.rimacksena.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NenhumEstudioEncontradoExeption extends Exception {

    public NenhumEstudioEncontradoExeption() {
        super("Nenhum estúdio cadastrado, favor cadastar estúdios.");
    }
}
