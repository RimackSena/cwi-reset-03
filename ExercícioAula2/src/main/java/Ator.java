public class Ator {

    private String nomeAtor;
    private int idadeAtor;
    private int numerosDeOscars;
    private Genero genero;

    public Ator(String nomeAtor, int idadeAtor, int numerosDeOscars, Genero genero) {
        this.nomeAtor = nomeAtor;
        this.idadeAtor = idadeAtor;
        this.numerosDeOscars = numerosDeOscars;
        this.genero = genero;
    }

    public void imprimirAtor(){
        System.out.println(this.nomeAtor);
        System.out.println(this.idadeAtor);
        System.out.println(genero.getDescricao());
    }

}
