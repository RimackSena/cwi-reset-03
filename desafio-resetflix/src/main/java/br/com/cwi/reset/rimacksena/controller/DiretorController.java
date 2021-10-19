package br.com.cwi.reset.rimacksena.controller;

import br.com.cwi.reset.rimacksena.FakeDatabase;
import br.com.cwi.reset.rimacksena.domain.Ator;
import br.com.cwi.reset.rimacksena.domain.Diretor;
import br.com.cwi.reset.rimacksena.exceptions.*;
import br.com.cwi.reset.rimacksena.request.AtorRequest;
import br.com.cwi.reset.rimacksena.request.DiretorRequest;
import br.com.cwi.reset.rimacksena.service.AtorService;
import br.com.cwi.reset.rimacksena.service.DiretorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diretores")
public class DiretorController {

    private DiretorService diretorService;

    public DiretorController() {
        this.diretorService = new DiretorService(FakeDatabase.getInstance());
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void criarDiretor(@RequestBody DiretorRequest diretor) throws DataNascimentoInvalidoException, NomeESobrenomeException, CampoObrigatorioExeption, DiretorJaCadastradoException, DataInicioAtividadeInvalidaException {
        diretorService.criarDiretor(diretor);
    }

    @GetMapping()
    public List<Diretor> listarDiretores(@RequestParam(value = "nome", required = false) String nome) throws NenhumDiretorEncontradoExeption, DiretorNaoEncontradoExeption {
        return this.diretorService.listarDiretores(nome);
    }

    @GetMapping("/{id}")
    public Diretor consultarDiretor(@PathVariable int id) throws IdNaoInformadoException, NenhumDiretorEncontradoComEsseIdExeption {
        return this.diretorService.consultarDiretor(id);
    }

}
