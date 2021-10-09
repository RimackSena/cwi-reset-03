import java.time.LocalDate;

public class Diretor extends Pessoa{



    private int quantidadeDeFilmesDirigidos;


    public Diretor(String nome, LocalDate dataNascimento, Genero genero, int quantidadeDeFilmesDirigidos) {
        super(nome, dataNascimento, genero);
        this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;
    }

    public String getNome(){
        return super.getNome() ;
    }

}
