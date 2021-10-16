package br.com.cwi.reset.primeiroprojetospring.controller;

import br.com.cwi.reset.primeiroprojetospring.domain.Diretor;
import br.com.cwi.reset.primeiroprojetospring.domain.Filme;
import br.com.cwi.reset.primeiroprojetospring.domain.Genero;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;


@RestController
@RequestMapping("/filme")
public class FilmeController {

    private static List<Filme> filmes = new ArrayList<>();

    Diretor diretor = new Diretor("Rimack Sena", LocalDate.of(1996,01,01), Genero.MASCULINO, 2);
    Filme filme1 = new Filme(diretor,"Circulo de fogo","Filme muito bom",96,2000,4);



    @GetMapping("/{nomeFilme}")
    public Filme getFilme(@PathVariable String nomeFilme){
        Filme f = buscarFilmePeloNome(nomeFilme);
        return f;
    }

    @GetMapping
    public List<Filme> getFilmes() {
//        Diretor diretor = new Diretor("Rimack Sena", LocalDate.of(1996,01,01), Genero.MASCULINO, 2);
//        Filme filme1 = new Filme(diretor,"Circulo de fogo","Filme muito bom",96,2000,4);
//        filmes.add(filme1);
        return filmes;
    }


    @PostMapping
    public ResponseEntity<Filme> cadastrarFilme(@RequestBody Filme filme) {
        Filme f = buscarFilmePeloNome(filme.getNomeFilme());
           if (nonNull(f)) {
               return ResponseEntity.badRequest().build();
            }
        filmes.add(filme);
        return ResponseEntity.ok(filme);
    }

    @PutMapping
    public void atualizarFilme(@RequestBody Filme filme) {
        Filme fCadastrado = buscarFilmePeloNome(filme.getNomeFilme());
        if (nonNull(filme)){
            filmes.remove(fCadastrado);
            filmes.add(filme);
        }
    }

    @DeleteMapping("/{nomeFilme}")
    public void deletarFilme(@PathVariable String nomeFilme) {
        Filme filme = buscarFilmePeloNome(nomeFilme);
        if (filme != null) {
            filmes.remove(filme);
        }
    }

    private Filme buscarFilmePeloNome(String nomeFilme) {
        for (Filme f : filmes) {
            if (f.getNomeFilme().equals(nomeFilme)) {
                return f;
            }
        }
        return null;
    }


}
