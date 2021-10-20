package br.com.cwi.reset.rimacksena.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EstudioNaoEncontradoExeption extends Exception {

    public EstudioNaoEncontradoExeption() {
        super("Estúdio não encontrado com o filtro, favor informar outro filtro.");
    }
}
