package br.com.cwi.reset.rimacksena.controller;

import br.com.cwi.reset.rimacksena.FakeDatabase;
import br.com.cwi.reset.rimacksena.domain.Ator;
import br.com.cwi.reset.rimacksena.exceptions.*;
import br.com.cwi.reset.rimacksena.request.AtorRequest;
import br.com.cwi.reset.rimacksena.service.AtorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/atores")
public class AtorController {

    private AtorService atorService;

    public AtorController() {
        this.atorService = new AtorService(FakeDatabase.getInstance());
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void criarAtor(@RequestBody AtorRequest ator) throws DataNascimentoInvalidoException, NomeESobrenomeException, AtorJaCadastradoException, CampoObrigatorioExeption, DataInicioAtividadeInvalidaException {
        this.atorService.criarAtor(ator);
    }

    @GetMapping()
    public List<Ator> colsultarAtores() throws NenhumAtorEncontradoExeption {
       return this.atorService.consultarAtores();
    }

    @GetMapping("/em_atividade")
    public List<Ator> listarAtoresEmAtividade(@RequestParam(value = "nome", required = false) String nome) throws NenhumAtorEncontradoExeption, AtorNaoEncontradoExeption {
        return this.atorService.listarAtores(nome);
    }

    @GetMapping("/{id}")
    public Ator consultarAtor(@PathVariable int id) throws NenhumAtorEncontradoExeption, AtorNaoEncontradoExeption, IdNaoInformadoException, NenhumAtorEncontradoComEsseIdExeption {
        return this.atorService.consultarAtor(id);
    }
}
