package br.com.cwi.reset.rimacksena;

import java.time.LocalDate;

public class AtorRequest extends Datas{

    private int id;
    private StatusAtividade statusCarreira;
    private FakeDatabase fakeDatabase;

    public AtorRequest(FakeDatabase fakeDatabase, String nome, LocalDate dataNascimento, int anoInicioAtividade, StatusAtividade statusCarreira) {
        super(nome, dataNascimento, anoInicioAtividade);
        this.statusCarreira = statusCarreira;
        this.fakeDatabase = fakeDatabase;
        this.id = fakeDatabase.gerarIdAtor();
    }
}
