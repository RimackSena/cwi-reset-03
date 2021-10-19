package br.com.cwi.reset.rimacksena.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NenhumAtorEncontradoExeption extends Exception {

    public NenhumAtorEncontradoExeption() {
        super("Nenhum Ator cadastrado, favor cadastar Atores.");
    }
}
