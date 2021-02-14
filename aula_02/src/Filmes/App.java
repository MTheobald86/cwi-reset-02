package Filmes;

public class App {

    public static void main (String [] args){

        Ator ator1 = new Ator("Maria", 37, 3, Genero.FEMININO);
        Diretor diretor1 = new Diretor("Kevin Feig", 40, 100, Genero.MASCULINO);
        Filme avenger = new Filme("The Avengers", "Os heróis mais poderosos da Terra em ação",
                "160", 2012, 5,diretor1 );
        Filme avenger2 = new Filme ("The Avenger: Ultron Age", "Eles retornaram",
                "160", 2015, 6, diretor1);

        avenger.rodarFilme();
        System.out.println();
        avenger2.rodarFilme();
        System.out.println();
        diretor1.descreveInformacao();
        System.out.println();
        ator1.descreveInformacao();
    }
}
