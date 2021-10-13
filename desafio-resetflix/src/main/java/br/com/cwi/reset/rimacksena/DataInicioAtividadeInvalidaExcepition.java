package br.com.cwi.reset.rimacksena;

public class DataInicioAtividadeInvalidaExcepition extends Throwable {

    public DataInicioAtividadeInvalidaExcepition() {
        super("Ano de início de atividade inválido");
    }
}
