package br.com.cwi.reset.rimacksena.exceptions;

public class DataNascimentoInvalidoException extends Throwable {

    public DataNascimentoInvalidoException() {
        super("Não é possível cadastrar não nascidos.");
    }
}
