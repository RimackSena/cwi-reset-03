package br.com.cwi.reset.primeiroprojetospring.domain;

public enum Genero {

    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    NAO_BINARIO("Não binario");

    private String descricao;

    Genero(String descricao){
        this.descricao = descricao;

    }

    public String getDescricao() {
        return descricao;
    }
}
