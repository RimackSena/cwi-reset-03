package br.com.cwi.reset.rimacksena.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NenhumFilmeParaOsFiltrosException extends Exception {

    public NenhumFilmeParaOsFiltrosException() {
        super("Filme não encontrado com os filtros, favor informar outros filtros.");
    }
}
