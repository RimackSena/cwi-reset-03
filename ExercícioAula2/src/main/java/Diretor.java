public class Diretor {

    private String nomeDiretor;
    private int idade;
    private int quantidadeDeFilmesDirigidos;


    public Diretor(String nomeDiretor, int idade, int quantidadeDeFilmesDirigidos) {
        this.nomeDiretor = nomeDiretor;
        this.idade = idade;
        this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;
    }

    public String getNome() {
        return nomeDiretor;
    }

    public int getIdade() {
        return idade;
    }

    public int getQuantidadeDeFilmesDirigidos() {
        return quantidadeDeFilmesDirigidos;
    }
}
