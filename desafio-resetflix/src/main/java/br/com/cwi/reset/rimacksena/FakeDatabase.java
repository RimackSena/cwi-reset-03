package br.com.cwi.reset.rimacksena;

import java.util.ArrayList;
import java.util.List;

public class FakeDatabase {

    private List<AtorRequest> atores = new ArrayList<>();
    private List<DiretorRequest> diretores = new ArrayList<>();


    public void persisteAtor(AtorRequest ator) {
        atores.add(ator);
    }

    public List<AtorRequest> recuperaAtores() {
        return atores;
    }

    public void persisteDiretor(DiretorRequest diretor) {
        diretores.add(diretor);
    }

    public List<DiretorRequest> recuperaDiretores() {
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