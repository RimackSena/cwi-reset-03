package br.com.cwi.reset.rimacksena;

import java.time.LocalDate;

public class Ator extends Datas{

    private StatusAtividade statusCarreira;

    public Ator(String nome, LocalDate dataNascimento, int anoInicioAtividade, StatusAtividade statusCarreira) {
        super(nome, dataNascimento, anoInicioAtividade);
        this.statusCarreira = statusCarreira;
    }
}
