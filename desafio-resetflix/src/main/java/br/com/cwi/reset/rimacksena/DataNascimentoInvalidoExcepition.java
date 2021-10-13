package br.com.cwi.reset.rimacksena;

public class DataNascimentoInvalidoExcepition extends Throwable {

    public DataNascimentoInvalidoExcepition() {
        super("Não é possível cadastrar não nascidos.");
    }
}
