package br.com.cwi.reset.rimacksena.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NenhumAtorEncontradoComEsseIdExeption extends Exception {

    public NenhumAtorEncontradoComEsseIdExeption() {
        super("Nenhum ator encontrado com esse parâmetro id, favor verifique os parâmetros informados.");
    }
}
