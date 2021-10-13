package br.com.cwi.reset.rimacksena;

public class IdNaoInformadoExcepition extends Throwable {

    public IdNaoInformadoExcepition() {
        super("Campo obrigatório não informado. Favor informar o campo ID.");
    }
}
