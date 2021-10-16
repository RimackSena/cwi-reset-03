package br.com.cwi.reset.primeiroprojetospring.controller;

import br.com.cwi.reset.primeiroprojetospring.domain.Diretor;
import br.com.cwi.reset.primeiroprojetospring.domain.Filme;
import br.com.cwi.reset.primeiroprojetospring.domain.Genero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;


@RestController
@RequestMapping("/filme")
public class FilmeController {

    @GetMapping
    public String getFilme(){
        Diretor diretor = new Diretor("Rimack Sena", LocalDate.of(1996,01,01), Genero.MASCULINO, 2);
        Filme filme1 = new Filme(diretor,"Circulo de fogo","Filme muito bom",96,2000,4);
        return filme1.getNomeFilme();
    }


}
