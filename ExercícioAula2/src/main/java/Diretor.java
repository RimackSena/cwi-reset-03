public class Diretor extends Pessoa{



    private int quantidadeDeFilmesDirigidos;


    public Diretor(String nome, int idade, Genero genero, int quantidadeDeFilmesDirigidos) {
        super(nome, idade, genero);
        this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;
    }

    public String getNome(){
        return super.getNome() ;
    }

}
