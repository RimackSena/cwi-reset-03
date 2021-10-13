package br.com.cwi.reset.rimacksena;

public class IdDiretorNaoInformadoExcepition extends Throwable {

    public IdDiretorNaoInformadoExcepition() {
        super("Campo obrigatório não informado. Favor informar o campo {campo}.");
    }
}
