package br.com.cwi.reset.rimacksena.request;

import br.com.cwi.reset.rimacksena.FakeDatabase;
import br.com.cwi.reset.rimacksena.domain.Pessoas;

import java.time.LocalDate;

public class DiretorRequest extends Pessoas {

    public DiretorRequest(String nome, LocalDate dataNascimento, int anoInicioAtividade) {
        super(nome, dataNascimento, anoInicioAtividade);
    }

}
