package br.com.cwi.reset.rimacksena.request;

import br.com.cwi.reset.rimacksena.FakeDatabase;
import br.com.cwi.reset.rimacksena.domain.Ator;
import br.com.cwi.reset.rimacksena.enuns.TipoAtuacao;
import br.com.cwi.reset.rimacksena.exceptions.IdNaoInformadoException;
import br.com.cwi.reset.rimacksena.exceptions.NenhumAtorEncontradoComEsseIdExeption;
import br.com.cwi.reset.rimacksena.service.AtorService;

public class PersonagemAtorRequest {

    private String nome;
    private Ator ator;
    private String descricaoPersonagem;
    private TipoAtuacao tipoAtuacao;
    private FakeDatabase fakeDatabase;

    public PersonagemAtorRequest(int idAtor, String nome, String descricaoPersonagem, TipoAtuacao tipoAtuacao) throws IdNaoInformadoException, NenhumAtorEncontradoComEsseIdExeption {
        this.fakeDatabase = FakeDatabase.getInstance();
        this.nome = nome;
        this.ator = new AtorService(fakeDatabase).consultarAtor(idAtor);
        this.descricaoPersonagem = descricaoPersonagem;
        this.tipoAtuacao = tipoAtuacao;
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
