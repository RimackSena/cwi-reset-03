package br.com.cwi.reset.rimacksena;

public class CampoObrigatorioExepition extends Throwable {

    public CampoObrigatorioExepition() {
        super("Campo obrigatório não informado. Favor informar o campo");
    }

}
