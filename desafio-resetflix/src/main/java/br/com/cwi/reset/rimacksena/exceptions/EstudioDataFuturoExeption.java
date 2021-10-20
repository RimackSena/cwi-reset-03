package br.com.cwi.reset.rimacksena.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EstudioDataFuturoExeption extends Exception {

    public EstudioDataFuturoExeption() {
        super("Não é possível cadastrar estúdios do futuro.");
    }
}
