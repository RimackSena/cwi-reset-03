package br.com.cwi.reset.rimacksena;

import java.util.List;

public class Filme extends IDeNome {

    private int anoLancamento;
    private String capaFilme; //nao sei que tipo de variavel vai ser aqui
    private Diretor diretor;
    private List<PersonagemAtor> personagem;
    private List<Genero> generos;
    private String resumo;

    public Filme(String nome, int anoLancamento, String capaFilme, Diretor diretor, PersonagemAtor personagem, Genero generos,
    String resumo) {
        super(nome);
        this.anoLancamento = anoLancamento;
        this.capaFilme = capaFilme;
        this.diretor = diretor;
        this.personagem.add(personagem);
        this.generos.add(generos);
        this.resumo = resumo;
    }
}
