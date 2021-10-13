package br.com.cwi.reset.rimacksena;

public class NenhumDiretorEncontradoExeption extends Throwable {

    public NenhumDiretorEncontradoExeption() {
        super("Nenhum diretor cadastrado, favor cadastar diretores.");
    }
}
