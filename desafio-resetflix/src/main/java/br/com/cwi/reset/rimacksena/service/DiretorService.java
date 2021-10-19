package br.com.cwi.reset.rimacksena.service;

import br.com.cwi.reset.rimacksena.domain.Diretor;
import br.com.cwi.reset.rimacksena.FakeDatabase;
import br.com.cwi.reset.rimacksena.exceptions.*;
import br.com.cwi.reset.rimacksena.request.DiretorRequest;

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

    public void criarDiretor(DiretorRequest diretor) throws CampoObrigatorioExeption, NomeESobrenomeException, DataNascimentoInvalidoException, DataInicioAtividadeInvalidaException, DiretorJaCadastradoException {
        String regex = "[A-Z][a-z]* [A-Z][a-z]*";
        List<Diretor> diretores = fakeDatabase.recuperaDiretores();
        if (isNull(diretor.getNome())){
            throw new CampoObrigatorioExeption();
        }if (isNull(diretor.getDataNascimento())){
            throw new CampoObrigatorioExeption();
        }if (diretor.getAnoInicioAtividade() == 0){
            throw new CampoObrigatorioExeption();
        }if (!diretor.getNome().matches(regex)){
            throw new NomeESobrenomeException();
        }if (diretor.getDataNascimento().isAfter(LocalDate.now())){
            throw new DataNascimentoInvalidoException();
        }if (diretor.getDataNascimento().getYear() > diretor.getAnoInicioAtividade()){
            throw new DataInicioAtividadeInvalidaException();
        } for (Diretor diretor1 : diretores) {
            if (diretor.getNome().equals(diretor1.getNome())){
                throw new DiretorJaCadastradoException();
            }
        }
        Integer idGerado = diretores.size() + 1;
        Diretor diretorASerGerado = new Diretor(idGerado, diretor.getNome(),diretor.getDataNascimento(),diretor.getAnoInicioAtividade());
        fakeDatabase.persisteDiretor(diretorASerGerado);
    }

    public List<Diretor> listarDiretores(String name) throws DiretorNaoEncontradoExeption, NenhumDiretorEncontradoExeption {
        List<Diretor> diretores = fakeDatabase.recuperaDiretores();
        List<Diretor> diretoresRetornar = new ArrayList<>();
        if (isNull(name)) {
            if (diretores.size() == 0) {
                throw new NenhumDiretorEncontradoExeption();
            } else return diretores;
        }
        if (nonNull(name)) {
            for (Diretor diretor : diretores) {
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

    public Diretor consultarDiretor(int id) throws IdNaoInformadoException, NenhumDiretorEncontradoComEsseIdExeption {
        List<Diretor> diretores = fakeDatabase.recuperaDiretores();
        Diretor diretorRetornar = null;
        if (id < 1) {
            throw new IdNaoInformadoException();
        } else {
            for (Diretor diretor : diretores) {
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
