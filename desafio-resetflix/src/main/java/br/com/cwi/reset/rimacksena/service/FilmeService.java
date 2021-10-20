package br.com.cwi.reset.rimacksena.service;

import br.com.cwi.reset.rimacksena.FakeDatabase;
import br.com.cwi.reset.rimacksena.domain.Filme;
import br.com.cwi.reset.rimacksena.domain.PersonagemAtor;
import br.com.cwi.reset.rimacksena.enuns.Genero;
import br.com.cwi.reset.rimacksena.exceptions.*;
import br.com.cwi.reset.rimacksena.request.FilmeRequest;
import br.com.cwi.reset.rimacksena.request.PersonagemAtorRequest;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class FilmeService {

    private FakeDatabase fakeDatabase;

    public FilmeService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public void criarFilme(FilmeRequest filme) throws CampoObrigatorioExeption, MesmoPersonagemComMesmoAtorException, MesmoGeneroNaListaException, NenhumGeneroImformadoException {
        List<Filme> filmes = fakeDatabase.recuperaFilmes();
        if (isNull(filme.getNome())){
            throw new CampoObrigatorioExeption();
        }if (isNull(filme.getAnoLancamento())){
            throw new CampoObrigatorioExeption();
        }if (isNull(filme.getCapaFilme())){
            throw new CampoObrigatorioExeption();
        }if (isNull(filme.getDiretor())){
            throw new CampoObrigatorioExeption();
        }if (isNull(filme.getDiretor())){
            throw new CampoObrigatorioExeption();
        }if (isNull(filme.getResumo())){
            throw new CampoObrigatorioExeption();
        }if (isNull(this.criarListaPersonagemAtorValidacao(filme))){
            throw new CampoObrigatorioExeption();
        }if (this.CriarListaGeneroValidação(filme));

        Integer idGeradoFilme = filmes.size() + 1;
        Integer idGeradoPersonagem = fakeDatabase.recuperaPersonagens().size() + 1;
        List<PersonagemAtor> personagemAtors = new ArrayList<>();
        for (PersonagemAtorRequest personagem : filme.getPersonagem()){
            PersonagemAtor personagemASerGerado = new PersonagemAtor(idGeradoPersonagem,personagem.getNome(),personagem.getAtor(),personagem.getDescricaoPersonagem(),personagem.getTipoAtuacao());
            fakeDatabase.persistePersonagem(personagemASerGerado);
            personagemAtors.add(personagemASerGerado);
        }
        Filme filmeASerGerado = new Filme(idGeradoFilme,filme.getNome(),filme.getAnoLancamento(), filme.getCapaFilme(),filme.getDiretor(),filme.getEstudio(),personagemAtors,filme.getGeneros(),filme.getResumo());
        fakeDatabase.persisteFilme(filmeASerGerado);
    }

    public List<Filme> consultarFilmes(String nomeFilme, String nomeDiretor, String nomePersonagem, String nomeAtor) throws NenhumFilmeCadastradoException, NenhumFilmeParaOsFiltrosException {
        List<Filme> filmes = fakeDatabase.recuperaFilmes();
        List<Filme> filmesFiltro = new ArrayList<>();
        if (isNull(nomeFilme) & isNull(nomeDiretor) & isNull(nomePersonagem) & isNull(nomeAtor)){
            if (filmes.size() == 0){
                throw new NenhumFilmeCadastradoException();
            }else return filmes;
        }if (nonNull(nomeFilme) | nonNull(nomeDiretor) | nonNull(nomePersonagem) | nonNull(nomeAtor)){
            for (Filme filme : filmes){
                if (filme.getNome().equals(nomeFilme) | filme.getDiretor().getNome().equals(nomeDiretor) | filme.getPersonagem().stream()
                        .filter(p -> p.getNome().equals(nomePersonagem)).findFirst().isPresent() | filme.getPersonagem().stream()
                        .filter(p -> p.getAtor().getNome().equals(nomeAtor)).findFirst().isPresent()){
                    filmesFiltro.add(filme);
                }if (filmesFiltro.size() == 0){
                    throw new NenhumFilmeParaOsFiltrosException();
                }
                return filmesFiltro;
            }
        }return filmes;
    }

    private List<PersonagemAtorRequest> criarListaPersonagemAtorValidacao(FilmeRequest filme) throws CampoObrigatorioExeption, MesmoPersonagemComMesmoAtorException {
        List<PersonagemAtor> personagens = fakeDatabase.recuperaPersonagens();
        List<PersonagemAtorRequest> perdonagensParaCriar = new ArrayList<>();
        for (PersonagemAtorRequest personagem : filme.getPersonagem()){
            if (isNull(personagem.getNome())){
                throw new CampoObrigatorioExeption();
            }if (isNull(personagem.getAtor())){
                throw new CampoObrigatorioExeption();
            }if (isNull(personagem.getDescricaoPersonagem())){
                throw new CampoObrigatorioExeption();
            }if (isNull(personagem.getTipoAtuacao())){
                throw new CampoObrigatorioExeption();
            }
        }for (PersonagemAtor pers: personagens) {
            for (PersonagemAtorRequest pers2 : filme.getPersonagem()){
               if(pers2.getAtor().getId() == pers.getAtor().getId() & pers.equals(pers2));
               throw new MesmoPersonagemComMesmoAtorException();
            }
        }perdonagensParaCriar = filme.getPersonagem();
        return perdonagensParaCriar;
    }

    private boolean CriarListaGeneroValidação(FilmeRequest filme) throws NenhumGeneroImformadoException, MesmoGeneroNaListaException {
        if (filme.getGeneros().size() == 0){
            throw new NenhumGeneroImformadoException();
        }
        for (Genero genero : filme.getGeneros()) {
            if (genero.equals(genero)){
                throw new MesmoGeneroNaListaException();
            }
        }
        return false;
    }
}
