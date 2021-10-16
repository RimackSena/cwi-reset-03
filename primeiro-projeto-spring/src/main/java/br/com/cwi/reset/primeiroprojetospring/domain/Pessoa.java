package br.com.cwi.reset.primeiroprojetospring.domain;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Genero genero;

    public Pessoa(String nome, LocalDate dataNascimento, Genero genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public void imprimirAtributos(){
        System.out.println(this.nome);
        System.out.println(this.calcularIdade());
        System.out.println(genero.getDescricao());
    }

    public String getNome() {
        return nome;
    }

    private Integer calcularIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
}
