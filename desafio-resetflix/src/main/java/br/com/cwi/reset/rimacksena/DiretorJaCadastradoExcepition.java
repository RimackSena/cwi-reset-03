package br.com.cwi.reset.rimacksena;

public class DiretorJaCadastradoExcepition extends Throwable {

    public DiretorJaCadastradoExcepition() {
        super("Já existe um diretor cadastrado para o nome");
    }
}
