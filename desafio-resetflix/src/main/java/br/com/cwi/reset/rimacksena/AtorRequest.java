package br.com.cwi.reset.rimacksena;

import java.time.LocalDate;

public class AtorRequest extends Pessoas {

    private int id;
    private StatusAtividade statusCarreira;
    private FakeDatabase fakeDatabase;

    public AtorRequest(FakeDatabase fakeDatabase, String nome, LocalDate dataNascimento, int anoInicioAtividade, StatusAtividade statusCarreira) {
        super(nome, dataNascimento, anoInicioAtividade);
        this.statusCarreira = statusCarreira;
        this.fakeDatabase = fakeDatabase;
        this.id = fakeDatabase.gerarIdAtor();
    }

    public int getId() {
        return id;
    }

    public StatusAtividade getStatusCarreira() {
        return statusCarreira;
    }
}
