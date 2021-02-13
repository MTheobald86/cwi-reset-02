package Filmes;

public class App {

    public static void main (String [] args){
        Diretor diretor1 = new Diretor("Kevin Feig", 40, 100, Genero.MASCULINO);
        Filme avenger = new Filme("The Avengers", "Os heróis mais poderosos da Terra em ação",
                "160", 2012, 10,diretor1 );

        avenger.rodarFilme();

        Filme avenger2 = new Filme ("The Avenger: Ultron Age", "Eles retornaram",
                "160", 2015, 6, diretor1);

        avenger2.rodarFilme();

        Ator ator1 = new Ator("José", 37, 3, Genero.MASCULINO);


        diretor1.descreveDiretor();
        ator1.descreveAtor();

    }
}
