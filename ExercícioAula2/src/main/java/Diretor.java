public class Diretor {

    private String nomeDiretor;
    private int idade;
    private int quantidadeDeFilmesDirigidos;
    private Genero genero;

    public Diretor(String nomeDiretor, int idade, int quantidadeDeFilmesDirigidos, Genero genero) {
        this.genero = genero;
        this.nomeDiretor = nomeDiretor;
        this.idade = idade;
        this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;
    }

    public String getNome() {

        return nomeDiretor;
    }

    public void imprimirdiretor(){
        System.out.println(this.nomeDiretor);
        System.out.println(this.idade);
        System.out.println(genero.getDescricao());
    }
}
