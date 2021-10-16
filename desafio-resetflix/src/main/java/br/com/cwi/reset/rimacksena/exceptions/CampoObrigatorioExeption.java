package br.com.cwi.reset.rimacksena.exceptions;

public class CampoObrigatorioExeption extends Throwable {

    public CampoObrigatorioExeption() {
        super("Campo obrigatório não informado. Favor informar o campo");
    }

}
