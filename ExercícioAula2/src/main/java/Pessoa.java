public class Pessoa {

    private String nome;
    private int idade;
    private Genero genero;

    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void imprimirAtributos(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(genero.getDescricao());
    }

    public String getNome() {
        return nome;
    }
}
