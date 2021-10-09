import java.time.LocalDate;

public class Aplicacao {

    public static void main(String[] args) throws AvaliacaoForaDoPadraoException {

        Diretor diretor1 = new Diretor("Rimack", LocalDate.of(1996,1,01), Genero.MASCULINO, 5);
        Diretor diretor2 = new Diretor("Sena", LocalDate.of(1991,3,14), Genero.MASCULINO, 4);
        Ator ator1 = new Ator("Ronaldo", LocalDate.of(1986,12,25),Genero.MASCULINO, 3);

        Filme filme1 = new Filme(diretor1, "filme1",
                "filme sobre orientação a objeto", 90, 2021, 5);

        Filme filme2 = new Filme(diretor2, "filme2",
                "filme sobre banco de dados", 60, 2019, 4);


        filme1.reproduzir();

        System.out.println("-----------------");

        filme2.reproduzir();

        System.out.println("-----------------");

       // diretor1.imprimirdiretor();

       // System.out.println("-----------------");

       // ator1.imprimirAtor();

        System.out.println("-----------------");

        diretor1.imprimirAtributos();
    }
}
