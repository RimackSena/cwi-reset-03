package br.com.cwi.reset.rimacksena;

public class AtorJaCadastradoExcepition extends Throwable {

    public AtorJaCadastradoExcepition() {
        super("Já existe um ator cadastrado para o nome");
    }
}
