package br.com.cwi.reset.rimacksena;

public class PersonagemAtor extends Nome {

    private AtorRequest ator;
    private String descricaoPersonagem;
    private TipoAtuacao tipoAtuacao;

    public PersonagemAtor(String nome, AtorRequest ator, String descricaoPersonagem, TipoAtuacao tipoAtuacao) {
        super(nome);
        this.ator = ator;
        this.descricaoPersonagem = descricaoPersonagem;
        this.tipoAtuacao = tipoAtuacao;
    }
}
