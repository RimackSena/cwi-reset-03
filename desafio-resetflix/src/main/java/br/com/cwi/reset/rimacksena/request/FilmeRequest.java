package br.com.cwi.reset.rimacksena.request;

import br.com.cwi.reset.rimacksena.FakeDatabase;
import br.com.cwi.reset.rimacksena.domain.Diretor;
import br.com.cwi.reset.rimacksena.domain.Estudio;
import br.com.cwi.reset.rimacksena.domain.PersonagemAtor;
import br.com.cwi.reset.rimacksena.enuns.Genero;
import br.com.cwi.reset.rimacksena.exceptions.IdNaoInformadoException;
import br.com.cwi.reset.rimacksena.exceptions.NenhumDiretorEncontradoComEsseIdExeption;
import br.com.cwi.reset.rimacksena.exceptions.NenhumEstudioEncontradoComEsseIdExeption;
import br.com.cwi.reset.rimacksena.service.DiretorService;
import br.com.cwi.reset.rimacksena.service.EstudioService;

import java.util.ArrayList;
import java.util.List;

public class FilmeRequest {

    private String nome;
    private int anoLancamento;
    private String capaFilme; //nao sei que tipo de variavel vai ser aqui
    private Diretor diretor;
    private Estudio estudio;
    private List<PersonagemAtorRequest> personagem = new ArrayList<>();
    private List<Genero> generos = new ArrayList<>();
    private String resumo;
    private FakeDatabase fakeDatabase;

    public FilmeRequest(String nome, int anoLancamento, String capaFilme, int idDiretor, int  idEstudio,  PersonagemAtorRequest personagemAdicinar, Genero generos,
                 String resumo) throws IdNaoInformadoException, NenhumDiretorEncontradoComEsseIdExeption, NenhumEstudioEncontradoComEsseIdExeption {
        this.fakeDatabase = FakeDatabase.getInstance();
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.capaFilme = capaFilme;
        this.diretor = new DiretorService(fakeDatabase).consultarDiretor(idDiretor);
        this.estudio = new EstudioService(fakeDatabase).consultarEstudio(idEstudio);
        this.personagem.add(personagemAdicinar);
        this.generos.add(generos);
        this.resumo = resumo;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getCapaFilme() {
        return capaFilme;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public List<PersonagemAtorRequest> getPersonagem() {
        return personagem;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public String getResumo() {
        return resumo;
    }
}
