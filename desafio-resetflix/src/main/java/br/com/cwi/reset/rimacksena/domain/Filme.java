package br.com.cwi.reset.rimacksena.domain;

import br.com.cwi.reset.rimacksena.enuns.Genero;
import br.com.cwi.reset.rimacksena.request.DiretorRequest;

import java.util.List;

public class Filme {

    private int id;
    private String nome;
    private int anoLancamento;
    private String capaFilme; //nao sei que tipo de variavel vai ser aqui
    private Diretor diretor;
    private Estudio estudio;
    private List<PersonagemAtor> personagem;
    private List<Genero> generos;
    private String resumo;

    public Filme(int id, String nome, int anoLancamento, String capaFilme, Diretor diretor,Estudio estudio,  List<PersonagemAtor> personagem, List<Genero> generos,
                 String resumo) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.capaFilme = capaFilme;
        this.diretor = diretor;
        this.estudio = estudio;
        this.personagem = personagem;
        this.generos = generos;
        this.resumo = resumo;
    }

    public int getId() {
        return id;
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

    public List<PersonagemAtor> getPersonagem() {
        return personagem;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public String getResumo() {
        return resumo;
    }
}
