package br.com.cwi.reset.rimacksena;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class DiretorService {

    private FakeDatabase fakeDatabase;

    public DiretorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public void criarDiretor(DiretorRequest diretor) throws CampoObrigatorioExepition, NomeESobrenomeException, DataNascimentoInvalidoExcepition, DataInicioAtividadeInvalidaExcepition, DiretorJaCadastradoExcepition {
        String regex = "[A-Z][a-z]* [A-Z][a-z]*";
        List<DiretorRequest> diretores = fakeDatabase.recuperaDiretores();
        if (isNull(diretor.getNome())){
            throw new CampoObrigatorioExepition();
        }if (isNull(diretor.getDataNascimento())){
            throw new CampoObrigatorioExepition();
        }if (diretor.getAnoInicioAtividade() == 0){
            throw new CampoObrigatorioExepition();
        }if (!diretor.getNome().matches(regex)){
            throw new NomeESobrenomeException();
        }if (diretor.getDataNascimento().isAfter(LocalDate.now())){
            throw new DataNascimentoInvalidoExcepition();
        }if (diretor.getDataNascimento().getYear() > diretor.getAnoInicioAtividade()){
            throw new DataInicioAtividadeInvalidaExcepition();
        } for (DiretorRequest diretor1 : diretores) {
            if (diretor.getNome().equals(diretor1.getNome())){
                throw new DiretorJaCadastradoExcepition();
            }
        }
        fakeDatabase.persisteDiretor(diretor);
    }

    public List<DiretorRequest> listarDiretores(String name) throws DiretorNaoEncontradoExeption, NenhumDiretorEncontradoExeption {
        List<DiretorRequest> diretores = fakeDatabase.recuperaDiretores();
        List<DiretorRequest> diretoresRetornar = new ArrayList<>();
        if (isNull(name)) {
            if (diretores.size() == 0) {
                throw new NenhumDiretorEncontradoExeption();
            } else return diretores;
        }
        if (nonNull(name)) {
            for (DiretorRequest diretor : diretores) {
                if (name.equals(diretor.getNome())) {
                    diretoresRetornar.add(diretor);
                }
            }
        }
        if (diretoresRetornar.size() == 0) {
            throw new DiretorNaoEncontradoExeption();
        }
        return diretoresRetornar;
    }

    public DiretorRequest consultarDiretor(int id) throws IdNaoInformadoExcepition, NenhumDiretorEncontradoComEsseIdExeption {
        List<DiretorRequest> diretores = fakeDatabase.recuperaDiretores();
        DiretorRequest diretorRetornar = null;
        if (id < 1) {
            throw new IdNaoInformadoExcepition();
        } else {
            for (DiretorRequest diretor : diretores) {
                if (id == diretor.getId()) {
                    diretorRetornar = diretor;
                }
            }
            if (nonNull(diretorRetornar)) {
                return diretorRetornar;
            } else {
                throw new NenhumDiretorEncontradoComEsseIdExeption();
            }

        }
    }
}
