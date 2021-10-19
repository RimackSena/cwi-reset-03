package br.com.cwi.reset.rimacksena;

import java.time.LocalDate;

public class Diretor extends Pessoas{

    private int id;

    public Diretor(int idGerado, String nome, LocalDate dataNascimento, int anoInicioAtividade) {
        super(nome, dataNascimento, anoInicioAtividade);
        this.id = idGerado;
    }

    public int getId(){
        return this.id;
    }
}
