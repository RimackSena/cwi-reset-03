package br.com.cwi.reset.rimacksena.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NenhumGeneroImformadoException extends Exception {

    public NenhumGeneroImformadoException() {
        super("Deve ser informado pelo menos um gênero para o cadastro do filme.");
    }
}
