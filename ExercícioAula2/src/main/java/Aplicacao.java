public class Aplicacao {

    public static void main(String[] args) {

        Filme filme1 = new Filme(new Diretor("Rimack", 25,01), "filme1",
                "filme sobre orientação a objeto", 90, 2021, 5);

        Filme filme2 = new Filme(new Diretor("Sena", 30,04), "filme2",
                "filme sobre banco de dados", 60, 2019, 4);


        filme1.reproduzir();

        System.out.println("-----------------");

        filme2.reproduzir();

    }
}
