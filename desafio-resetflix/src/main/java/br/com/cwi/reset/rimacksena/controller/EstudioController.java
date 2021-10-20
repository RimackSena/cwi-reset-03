package br.com.cwi.reset.rimacksena.controller;


import br.com.cwi.reset.rimacksena.FakeDatabase;
import br.com.cwi.reset.rimacksena.domain.Ator;
import br.com.cwi.reset.rimacksena.domain.Estudio;
import br.com.cwi.reset.rimacksena.exceptions.*;
import br.com.cwi.reset.rimacksena.request.EstudioRequest;
import br.com.cwi.reset.rimacksena.service.AtorService;
import br.com.cwi.reset.rimacksena.service.EstudioService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudios")
public class EstudioController {

    private EstudioService estudioService;

    public EstudioController() {
        this.estudioService = new EstudioService(FakeDatabase.getInstance());
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public void CriarEstudio(@RequestBody EstudioRequest estudio) throws EstudioDataFuturoExeption, CampoObrigatorioExeption, EstudioJaCadastradoExeption {
        this.estudioService.criarEstudio(estudio);
    }

    @GetMapping
    public List<Estudio> consultarEstudios(@RequestParam(value = "nome", required = false) String nome) throws EstudioNaoEncontradoExeption, NenhumEstudioEncontradoExeption {
        return this.estudioService.consultarEstudios(nome);
    }

    @GetMapping("/{id}")
    public Estudio consultarEstudio(@PathVariable int id) throws IdNaoInformadoException, NenhumEstudioEncontradoComEsseIdExeption {
        return this.estudioService.consultarEstudio(id);
    }
}
