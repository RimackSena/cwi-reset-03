package br.com.cwi.reset.rimacksena.service;

import br.com.cwi.reset.rimacksena.FakeDatabase;
import br.com.cwi.reset.rimacksena.domain.Estudio;
import br.com.cwi.reset.rimacksena.exceptions.*;
import br.com.cwi.reset.rimacksena.request.EstudioRequest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class EstudioService {

    private FakeDatabase fakeDatabase;

    public EstudioService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public void criarEstudio(EstudioRequest estudio) throws CampoObrigatorioExeption, EstudioJaCadastradoExeption, EstudioDataFuturoExeption {
        List<Estudio> estudios = fakeDatabase.recuperaEstudios();
        if (isNull(estudio.getNome())){
            throw new CampoObrigatorioExeption();
        }if (isNull(estudio.getDescricao())){
            throw new CampoObrigatorioExeption();
        }if (isNull(estudio.getDataCriacao())){
            throw new CampoObrigatorioExeption();
        }if (isNull(estudio.getStatusAtividade())){
            throw new CampoObrigatorioExeption();
        }if (estudio.getDataCriacao().isAfter(LocalDate.now())){
            throw new EstudioDataFuturoExeption();
        } for (Estudio estudio1 : estudios){
            if (estudio.getNome().equals(estudio1.getNome())){
                throw new EstudioJaCadastradoExeption();
            }
        }
        Integer idGerado = estudios.size() + 1;
        Estudio estudioASerGerado = new Estudio(idGerado, estudio.getNome(), estudio.getDescricao(), estudio.getDataCriacao(),estudio.getStatusAtividade());
        fakeDatabase.persisteEstudio(estudioASerGerado);
    }

    public List<Estudio> consultarEstudios(String name) throws NenhumEstudioEncontradoExeption, EstudioNaoEncontradoExeption {
        List<Estudio> estudios = fakeDatabase.recuperaEstudios();
        List<Estudio> atoresRetornar = new ArrayList<>();
        List<Estudio> atoresRetornarFiltro = new ArrayList<>();
        for (Estudio estudio : estudios) {
            atoresRetornar.add(estudio);
        }if (isNull(name)) {
            if (estudios.size() == 0) {
                throw new NenhumEstudioEncontradoExeption();
            } else return atoresRetornar;
        }if (nonNull(name)) {
            for (Estudio estudio : estudios) {
                if (name.equals(estudio.getNome())) {
                    atoresRetornarFiltro.add(estudio);
                }
            }
        }if (atoresRetornarFiltro.size() == 0) {
            throw new EstudioNaoEncontradoExeption();
        }return atoresRetornarFiltro;
    }

    public Estudio consultarEstudio(int id) throws IdNaoInformadoException, NenhumEstudioEncontradoComEsseIdExeption {
        List<Estudio> atores = fakeDatabase.recuperaEstudios();
        Estudio estudioRetornar = null;
        if (id < 1) {
            throw new IdNaoInformadoException();
        } else {
            for (Estudio estudio : atores) {
                if (id == estudio.getId()) {
                    estudioRetornar = estudio;
                }
            }
            if (nonNull(estudioRetornar)) {
                return estudioRetornar;
            } else {
                throw new NenhumEstudioEncontradoComEsseIdExeption();
            }
        }
    }
}
