package br.com.cwi.reset.rimacksena;

import br.com.cwi.reset.rimacksena.enuns.StatusAtividade;

import java.time.LocalDate;

public class Ator extends Pessoas {

    private int id;
    private StatusAtividade statusCarreira;

    public Ator(int idGerado, String nome, LocalDate dataNascimento, int anoInicioAtividade, StatusAtividade statusCarreira) {
        super(nome, dataNascimento, anoInicioAtividade);
        this.statusCarreira = statusCarreira;
        this.id = idGerado;
    }

    public int getId() {
        return id;
    }

    public StatusAtividade getStatusCarreira() {
        return statusCarreira;
    }
}
