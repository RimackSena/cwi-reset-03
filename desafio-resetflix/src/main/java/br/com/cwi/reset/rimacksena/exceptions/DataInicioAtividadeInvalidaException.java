package br.com.cwi.reset.rimacksena.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DataInicioAtividadeInvalidaException extends Exception {

    public DataInicioAtividadeInvalidaException() {
        super("Ano de início de atividade inválido");
    }
}
