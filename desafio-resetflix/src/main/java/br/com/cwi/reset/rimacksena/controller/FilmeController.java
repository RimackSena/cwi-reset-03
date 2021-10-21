package br.com.cwi.reset.rimacksena.controller;

import br.com.cwi.reset.rimacksena.FakeDatabase;
import br.com.cwi.reset.rimacksena.domain.Filme;
import br.com.cwi.reset.rimacksena.exceptions.*;
import br.com.cwi.reset.rimacksena.request.FilmeRequest;
import br.com.cwi.reset.rimacksena.service.AtorService;
import br.com.cwi.reset.rimacksena.service.FilmeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    private FilmeService filmeService;

    public FilmeController() {
        this.filmeService = new FilmeService(FakeDatabase.getInstance());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarFilme(@RequestBody FilmeRequest filme) throws MesmoGeneroNaListaException, MesmoPersonagemComMesmoAtorException, NenhumGeneroImformadoException, CampoObrigatorioExeption {
        this.filmeService.criarFilme(filme);
    }

    @GetMapping
    public List<Filme> consultarFilmes(@RequestParam(value = "nomeFilme", required = false) String nomeFilme,
                                       @RequestParam(value = "nomeDiretor", required = false) String nomeDiretor,
                                       @RequestParam(value = "nomePersonagem", required = false) String nomePersonagem,
                                       @RequestParam(value = "nomeAtor", required = false) String nomeAtor) throws NenhumFilmeCadastradoException, NenhumFilmeParaOsFiltrosException {
        return this.filmeService.consultarFilmes(nomeFilme,nomeDiretor,nomePersonagem,nomeAtor);
    }
}
