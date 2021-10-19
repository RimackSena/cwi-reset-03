package br.com.cwi.reset.rimacksena.request;

import br.com.cwi.reset.rimacksena.FakeDatabase;
import br.com.cwi.reset.rimacksena.domain.Pessoas;
import br.com.cwi.reset.rimacksena.enuns.StatusAtividade;

import java.time.LocalDate;

public class AtorRequest extends Pessoas {


    private StatusAtividade statusCarreira;


    public AtorRequest(String nome, LocalDate dataNascimento, int anoInicioAtividade, StatusAtividade statusCarreira) {
        super(nome, dataNascimento, anoInicioAtividade);
        this.statusCarreira = statusCarreira;

    }

    public StatusAtividade getStatusCarreira() {
        return statusCarreira;
    }
}
