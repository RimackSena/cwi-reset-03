import java.time.LocalDate;

public class Ator extends Pessoa{


    private int numerosDeOscars;


    public Ator(String nome, LocalDate dataNascimento, Genero genero, int numerosDeOscars) {
        super(nome, dataNascimento, genero);
        this.numerosDeOscars = numerosDeOscars;
    }
    public String getNome(){
        return super.getNome() ;
    }
}
