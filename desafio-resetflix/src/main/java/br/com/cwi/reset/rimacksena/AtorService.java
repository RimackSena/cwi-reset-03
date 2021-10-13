package br.com.cwi.reset.rimacksena;

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

    public void criarAtor(AtorRequest ator) throws CampoObrigatorioExepition, NomeESobrenomeException, DataNascimentoInvalidoExcepition, DataInicioAtividadeInvalidaExcepition, AtorJaCadastradoExcepition {
        String regex = "[A-Z][a-z]* [A-Z][a-z]*";
        List<AtorRequest> atores = fakeDatabase.recuperaAtores();
        if (isNull(ator.getNome())){
            throw new CampoObrigatorioExepition();
        }if (isNull(ator.getDataNascimento())){
            throw new CampoObrigatorioExepition();
        }if (isNull(ator.getStatusCarreira())) {
            throw new CampoObrigatorioExepition();
        }if (ator.getAnoInicioAtividade() == 0){
            throw new CampoObrigatorioExepition();
        }if (!ator.getNome().matches(regex)){
            throw new NomeESobrenomeException();
        }if (ator.getDataNascimento().isAfter(LocalDate.now())){
            throw new DataNascimentoInvalidoExcepition();
        }if (ator.getDataNascimento().getYear() > ator.getAnoInicioAtividade()){
            throw new DataInicioAtividadeInvalidaExcepition();
        }for (AtorRequest ator1 : atores) {
            if (ator.getNome().equals(ator1.getNome())){
                throw new AtorJaCadastradoExcepition();
            }
        }
        fakeDatabase.persisteAtor(ator);
    }


    public List<AtorRequest> listarAtores(String name) throws NenhumAtorEncontradoExeption, AtorNaoEncontradoExeption {
        List<AtorRequest> atores = fakeDatabase.recuperaAtores();
        List<AtorRequest> atoresRetornar = new ArrayList<>();
        List<AtorRequest> atoresRetornarFiltro = new ArrayList<>();
        for (AtorRequest ator : atores) {
            if (ator.getStatusCarreira().equals(StatusAtividade.EM_ATIVIDADE)){
                atoresRetornar.add(ator);
            }
        }if (isNull(name)) {
            if (atores.size() == 0) {
                throw new NenhumAtorEncontradoExeption();
            } else return atoresRetornar;
        }if (nonNull(name)) {
            for (AtorRequest ator : atores) {
                if (name.equals(ator.getNome())) {
                    atoresRetornarFiltro.add(ator);
                }
            }
        }if (atoresRetornarFiltro.size() == 0) {
            throw new AtorNaoEncontradoExeption();
        }
        return atoresRetornarFiltro;
    }

    public AtorRequest consultarAtor(int id) throws IdNaoInformadoExcepition, NenhumAtorEncontradoComEsseIdExeption {
        List<AtorRequest> atores = fakeDatabase.recuperaAtores();
        AtorRequest atorRetornar = null;
        if (id < 1) {
            throw new IdNaoInformadoExcepition();
        } else {
            for (AtorRequest ator : atores) {
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

    public List<AtorRequest> ConsultarAtores() throws NenhumAtorEncontradoExeption {
        List<AtorRequest> atores = fakeDatabase.recuperaAtores();
        if (atores.size() == 0){
            throw new NenhumAtorEncontradoExeption();
        }
        return atores;
    }
}
