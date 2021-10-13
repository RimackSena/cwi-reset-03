package br.com.cwi.reset.rimacksena;

public class NenhumDiretorEncontradoComEsseIdExeption extends Throwable {

    public NenhumDiretorEncontradoComEsseIdExeption() {
        super("Nenhum diretor encontrado com esse parâmetro id, favor verifique os parâmetros informados.");
    }
}
