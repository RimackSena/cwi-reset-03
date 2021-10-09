public class Aplicacao {

    public static void main(String[] args) {

        Diretor diretor1 = new Diretor("Rimack", 25, Genero.MASCULINO, 5);
        Diretor diretor2 = new Diretor("Sena", 30, Genero.MASCULINO, 4);
        Ator ator1 = new Ator("Ronaldo",33,Genero.MASCULINO, 3);

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
