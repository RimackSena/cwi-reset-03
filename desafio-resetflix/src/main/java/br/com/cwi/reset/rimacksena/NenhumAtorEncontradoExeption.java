package br.com.cwi.reset.rimacksena;

public class NenhumAtorEncontradoExeption extends Throwable {

    public NenhumAtorEncontradoExeption() {
        super("Nenhum Ator cadastrado, favor cadastar Atores.");
    }
}
