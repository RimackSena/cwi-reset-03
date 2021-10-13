package br.com.cwi.reset.rimacksena;

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
