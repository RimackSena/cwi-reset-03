public class Ator extends Pessoa{


    private int numerosDeOscars;


    public Ator(String nome, int idade, Genero genero, int numerosDeOscars) {
        super(nome, idade, genero);
        this.numerosDeOscars = numerosDeOscars;
    }
    public String getNome(){
        return super.getNome() ;
    }
}
