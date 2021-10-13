package br.com.cwi.reset.rimacksena;

import java.time.LocalDate;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) throws NenhumDiretorEncontradoExeption, DiretorNaoEncontradoExeption, IdDiretorNaoInformadoExcepition, NenhumDiretorEncontradoComEsseIdExeption, CampoObrigatorioExepition, DataNascimentoInvalidoExcepition, NomeESobrenomeException, DataInicioAtividadeInvalidaExcepition, DiretorJaCadastradoExcepition {

        FakeDatabase fakeDatabase = new FakeDatabase();

        DiretorService diretorService = new DiretorService(fakeDatabase);

        DiretorRequest diretorRequest = new DiretorRequest(fakeDatabase,"Rimack Sena",LocalDate.of(1996,01,01),2000);
        diretorService.criarDiretor(diretorRequest);

       // DiretorRequest diretorRequest01 = new DiretorRequest(fakeDatabase,"Rimack Sena",LocalDate.of(1996,01,01),2000);
       // diretorService.criarDiretor(diretorRequest01);

        DiretorRequest diretor = diretorService.consultarDiretor(1);

        System.out.println(diretor.getNome());
        System.out.println(diretor.getId());
    }
}
