package br.com.cwi.reset.rimacksena.domain;

import br.com.cwi.reset.rimacksena.enuns.Genero;
import br.com.cwi.reset.rimacksena.request.DiretorRequest;

import java.util.List;

public class Filme {

    private int id;
    private String nome;
    private int anoLancamento;
    private String capaFilme; //nao sei que tipo de variavel vai ser aqui
    private DiretorRequest diretor;
    private Estudio estudio;
    private List<PersonagemAtor> personagem;
    private List<Genero> generos;
    private String resumo;

    public Filme(int id, String nome, int anoLancamento, String capaFilme, DiretorRequest diretor,Estudio estudio,  PersonagemAtor personagem, Genero generos,
                 String resumo) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.capaFilme = capaFilme;
        this.diretor = diretor;
        this.estudio = estudio;
        this.personagem.add(personagem);
        this.generos.add(generos);
        this.resumo = resumo;
    }
}
