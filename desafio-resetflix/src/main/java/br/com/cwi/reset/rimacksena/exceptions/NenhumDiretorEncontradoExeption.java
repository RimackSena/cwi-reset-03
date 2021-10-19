package br.com.cwi.reset.rimacksena.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NenhumDiretorEncontradoExeption extends Exception {

    public NenhumDiretorEncontradoExeption() {
        super("Nenhum diretor cadastrado, favor cadastar diretores.");
    }
}
