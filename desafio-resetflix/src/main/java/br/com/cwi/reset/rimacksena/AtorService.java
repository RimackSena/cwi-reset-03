package br.com.cwi.reset.rimacksena;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AtorService {

    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public void criarAtor(AtorRequest ator) throws CampoObrigatorioExepition, NomeESobrenomeException, DataNascimentoInvalidoExcepition, DataInicioAtividadeInvalidaExcepition, DiretorJaCadastradoExcepition {
        String regex = "[A-Z][a-z]* [A-Z][a-z]*";
        List<DiretorRequest> diretores = fakeDatabase.recuperaDiretores();
        if (ator.getNome() == null ){
            throw new CampoObrigatorioExepition();
        }if (ator.getDataNascimento() == null){
            throw new CampoObrigatorioExepition();
        }if (ator.getStatusCarreira() == null) {
            throw new CampoObrigatorioExepition();
        }if (ator.getAnoInicioAtividade() == 0){
            throw new CampoObrigatorioExepition();
        }if (!ator.getNome().matches(regex)){
            throw new NomeESobrenomeException();
        }if (ator.getDataNascimento().isAfter(LocalDate.now())){
            throw new DataNascimentoInvalidoExcepition();
        }if (ator.getDataNascimento().getYear() > ator.getAnoInicioAtividade()){
            throw new DataInicioAtividadeInvalidaExcepition();
        } for (DiretorRequest diretor1 : diretores) {
            if (ator.getNome().equals(diretor1.getNome())){
                throw new DiretorJaCadastradoExcepition();
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
        }if (name == null) {
            if (atores.size() == 0) {
                throw new NenhumAtorEncontradoExeption();
            } else return atoresRetornar;
        }if (name != null) {
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
            if (atorRetornar != null) {
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
