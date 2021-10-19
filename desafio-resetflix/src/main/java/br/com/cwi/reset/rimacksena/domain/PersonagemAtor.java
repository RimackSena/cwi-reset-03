package br.com.cwi.reset.rimacksena.domain;

import br.com.cwi.reset.rimacksena.enuns.TipoAtuacao;
import br.com.cwi.reset.rimacksena.request.AtorRequest;

public class PersonagemAtor {

    private String nome;
    private AtorRequest ator;
    private String descricaoPersonagem;
    private TipoAtuacao tipoAtuacao;

    public PersonagemAtor(String nome, AtorRequest ator, String descricaoPersonagem, TipoAtuacao tipoAtuacao) {
        this.nome = nome;
        this.ator = ator;
        this.descricaoPersonagem = descricaoPersonagem;
        this.tipoAtuacao = tipoAtuacao;
    }
}
