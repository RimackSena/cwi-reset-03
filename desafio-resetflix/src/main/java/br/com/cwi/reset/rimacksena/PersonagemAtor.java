package br.com.cwi.reset.rimacksena;

public class PersonagemAtor extends IDeNome {

    private Ator ator;
    private String descricaoPersonagem;
    private TipoAtuacao tipoAtuacao;

    public PersonagemAtor(String nome, Ator ator, String descricaoPersonagem, TipoAtuacao tipoAtuacao) {
        super(nome);
        this.ator = ator;
        this.descricaoPersonagem = descricaoPersonagem;
        this.tipoAtuacao = tipoAtuacao;
    }
}
