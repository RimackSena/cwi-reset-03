package br.com.cwi.reset.rimacksena.domain;

import br.com.cwi.reset.rimacksena.enuns.TipoAtuacao;
import br.com.cwi.reset.rimacksena.request.AtorRequest;

public class PersonagemAtor {

    private int id;
    private String nome;
    private Ator ator;
    private String descricaoPersonagem;
    private TipoAtuacao tipoAtuacao;

    public PersonagemAtor(int id, String nome, Ator ator, String descricaoPersonagem, TipoAtuacao tipoAtuacao) {
        this.id = id;
        this.nome = nome;
        this.ator = ator;
        this.descricaoPersonagem = descricaoPersonagem;
        this.tipoAtuacao = tipoAtuacao;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Ator getAtor() {
        return ator;
    }

    public String getDescricaoPersonagem() {
        return descricaoPersonagem;
    }

    public TipoAtuacao getTipoAtuacao() {
        return tipoAtuacao;
    }
}
