package br.com.cwi.reset.rimacksena.service;

import br.com.cwi.reset.rimacksena.Ator;
import br.com.cwi.reset.rimacksena.FakeDatabase;
import br.com.cwi.reset.rimacksena.enuns.StatusAtividade;
import br.com.cwi.reset.rimacksena.exceptions.*;
import br.com.cwi.reset.rimacksena.request.AtorRequest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class AtorService {

    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public void criarAtor(AtorRequest ator) throws CampoObrigatorioExeption, NomeESobrenomeException, DataNascimentoInvalidoException, DataInicioAtividadeInvalidaException, AtorJaCadastradoException {
        String regex = "[A-Z][a-z]* [A-Z][a-z]*";
        List<Ator> atores = fakeDatabase.recuperaAtores();
        if (isNull(ator.getNome())){
            throw new CampoObrigatorioExeption();
        }if (isNull(ator.getDataNascimento())){
            throw new CampoObrigatorioExeption();
        }if (isNull(ator.getStatusCarreira())) {
            throw new CampoObrigatorioExeption();
        }if (ator.getAnoInicioAtividade() == 0){
            throw new CampoObrigatorioExeption();
        }if (!ator.getNome().matches(regex)){
            throw new NomeESobrenomeException();
        }if (ator.getDataNascimento().isAfter(LocalDate.now())){
            throw new DataNascimentoInvalidoException();
        }if (ator.getDataNascimento().getYear() > ator.getAnoInicioAtividade()){
            throw new DataInicioAtividadeInvalidaException();
        }for (Ator ator1 : atores) {
            if (ator.getNome().equals(ator1.getNome())){
                throw new AtorJaCadastradoException();
            }
        }
        Integer idGerado = atores.size() + 1;
        Ator atorASerGerado = new Ator(idGerado, ator.getNome(), ator.getDataNascimento(), ator.getAnoInicioAtividade(), ator.getStatusCarreira());
        fakeDatabase.persisteAtor(atorASerGerado);
    }


    public List<Ator> listarAtores(String name) throws NenhumAtorEncontradoExeption, AtorNaoEncontradoExeption {
        List<Ator> atores = fakeDatabase.recuperaAtores();
        List<Ator> atoresRetornar = new ArrayList<>();
        List<Ator> atoresRetornarFiltro = new ArrayList<>();
        for (Ator ator : atores) {
            if (ator.getStatusCarreira().equals(StatusAtividade.EM_ATIVIDADE)){
                atoresRetornar.add(ator);
            }
        }if (isNull(name)) {
            if (atores.size() == 0) {
                throw new NenhumAtorEncontradoExeption();
            } else return atoresRetornar;
        }if (nonNull(name)) {
            for (Ator ator : atores) {
                if (name.equals(ator.getNome())) {
                    atoresRetornarFiltro.add(ator);
                }
            }
        }if (atoresRetornarFiltro.size() == 0) {
            throw new AtorNaoEncontradoExeption();
        }
        return atoresRetornarFiltro;
    }

    public Ator consultarAtor(int id) throws IdNaoInformadoException, NenhumAtorEncontradoComEsseIdExeption {
        List<Ator> atores = fakeDatabase.recuperaAtores();
        Ator atorRetornar = null;
        if (id < 1) {
            throw new IdNaoInformadoException();
        } else {
            for (Ator ator : atores) {
                if (id == ator.getId()) {
                    atorRetornar = ator;
                }
            }
            if (nonNull(atorRetornar)) {
                return atorRetornar;
            } else {
                throw new NenhumAtorEncontradoComEsseIdExeption();
            }

        }
    }

    public List<Ator> ConsultarAtores() throws NenhumAtorEncontradoExeption {
        List<Ator> atores = fakeDatabase.recuperaAtores();
        if (atores.size() == 0){
            throw new NenhumAtorEncontradoExeption();
        }
        return atores;
    }
}
