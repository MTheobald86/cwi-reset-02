package Filmes;

public class App {

    public static void main (String [] args){
        Diretor diretor1 = new Diretor("Kevin Feig", 40, 100);
        Filme avenger = new Filme("The Avengers", "Os heróis mais poderosos da Terra em ação",
                "160", 2012, 10,diretor1 );

        avenger.rodarFilme();

    }
}
