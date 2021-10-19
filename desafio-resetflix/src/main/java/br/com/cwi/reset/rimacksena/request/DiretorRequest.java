package br.com.cwi.reset.rimacksena.request;

import br.com.cwi.reset.rimacksena.FakeDatabase;
import br.com.cwi.reset.rimacksena.Pessoas;

import java.time.LocalDate;

public class DiretorRequest extends Pessoas {

    private FakeDatabase fakeDatabase;

    public DiretorRequest(FakeDatabase fakeDatabase, String nome, LocalDate dataNascimento, int anoInicioAtividade) {
        super(nome, dataNascimento, anoInicioAtividade);
        this.fakeDatabase = fakeDatabase;

    }

}
