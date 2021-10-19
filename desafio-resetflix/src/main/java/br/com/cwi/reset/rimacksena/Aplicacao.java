package br.com.cwi.reset.rimacksena;

import br.com.cwi.reset.rimacksena.enuns.StatusAtividade;
import br.com.cwi.reset.rimacksena.exceptions.*;
import br.com.cwi.reset.rimacksena.request.AtorRequest;
import br.com.cwi.reset.rimacksena.service.AtorService;

import java.time.LocalDate;
import java.util.List;

public class Aplicacao {

    public static void main(String[] args) throws DataNascimentoInvalidoException, NomeESobrenomeException, AtorJaCadastradoException, CampoObrigatorioExeption, DataInicioAtividadeInvalidaException {
        FakeDatabase fakeDatabase = new FakeDatabase();

        AtorService atorService = new AtorService(fakeDatabase);

        String nome = "Will Smith";
        LocalDate dataNascimento = LocalDate.of(1968, 9, 25);
        StatusAtividade statusAtividade = StatusAtividade.EM_ATIVIDADE;
        Integer anoInicioAtividade = 1986;
        AtorRequest atorRequest = new AtorRequest(fakeDatabase,nome,dataNascimento,anoInicioAtividade,statusAtividade);

        atorService.criarAtor(atorRequest);

        List<Ator> atores = fakeDatabase.recuperaAtores();

        System.out.println("Deve conter 1 ator, quantidade encontrada: " + atores.size());
        System.out.println("Primeiro ator deve ser 'Will Smith', valor encontrado: " + atores.get(0).getNome());
    }
}
