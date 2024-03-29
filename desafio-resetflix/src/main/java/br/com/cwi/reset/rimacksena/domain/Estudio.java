package br.com.cwi.reset.rimacksena.domain;

import br.com.cwi.reset.rimacksena.enuns.StatusAtividade;

import java.time.LocalDate;

public class Estudio {

    private int id;
    private String nome;
    private String descricao;
    private LocalDate dataCriacao;
    private StatusAtividade statusAtividade;

    public Estudio(int id, String nome, String descricao, LocalDate dataCriacao, StatusAtividade statusAtividade) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.statusAtividade = statusAtividade;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public StatusAtividade getStatusAtividade() {
        return statusAtividade;
    }
}
