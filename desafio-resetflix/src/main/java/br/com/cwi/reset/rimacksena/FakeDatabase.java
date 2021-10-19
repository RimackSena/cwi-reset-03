package br.com.cwi.reset.rimacksena;

import br.com.cwi.reset.rimacksena.request.AtorRequest;
import br.com.cwi.reset.rimacksena.request.DiretorRequest;

import java.util.ArrayList;
import java.util.List;

public class FakeDatabase {

    private List<Ator> atores = new ArrayList<>();
    private List<Diretor> diretores = new ArrayList<>();


    public void persisteAtor(Ator ator) {
        atores.add(ator);
    }

    public List<Ator> recuperaAtores() {
        return atores;
    }

    public void persisteDiretor(Diretor diretor) {
        diretores.add(diretor);
    }

    public List<Diretor> recuperaDiretores() {
        return diretores;
    }

    public int gerarIdDiretor() {
        int id = diretores.size();
        int idsomado = id + 1;
        return idsomado;
    }

    public int gerarIdAtor() {
        int id = atores.size();
        int idsomado = id + 1;
        return idsomado;
    }
}