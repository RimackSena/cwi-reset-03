package br.com.cwi.reset.rimacksena;

import java.time.LocalDate;

public class Datas extends IDeNome {

    private LocalDate dataNascimento;
    private int anoInicioAtividade;

    public Datas(String nome, LocalDate dataNascimento, int anoInicioAtividade) {
        super(nome);
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
    }
}