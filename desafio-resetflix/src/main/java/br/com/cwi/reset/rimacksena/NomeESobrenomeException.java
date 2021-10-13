package br.com.cwi.reset.rimacksena;

public class NomeESobrenomeException extends Throwable {

    public NomeESobrenomeException() {
        super("Deve ser informado no mínimo nome e sobrenome");
    }
}
