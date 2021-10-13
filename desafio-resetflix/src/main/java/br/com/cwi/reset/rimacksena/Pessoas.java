package br.com.cwi.reset.rimacksena;

import java.time.LocalDate;

public class Pessoas{

    private String nome;
    private LocalDate dataNascimento;
    private int anoInicioAtividade;

    public Pessoas(String nome, LocalDate dataNascimento, int anoInicioAtividade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getAnoInicioAtividade() {
        return anoInicioAtividade;
    }

    public String getNome() {
        return nome;
    }
}
