package Filmes;

;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class App {

    public static void main (String [] args){

        List <Pessoa> elenco = new ArrayList<>();
        Ator ator1 = new Ator("Maria", LocalDate.of(1986,11,30), 3, Genero.FEMININO);
        Diretor diretor1 = new Diretor("Kevin Feig", LocalDate.of(1978,10,16), 100, Genero.MASCULINO);
        Filme avenger = new Filme("The Avengers", "Os heróis mais poderosos da Terra em ação",
                "160", 2012, 5,diretor1, elenco);
        Filme avenger2 = new Filme ("The Avenger: Ultron Age", "Eles retornaram",
                "160", 2015, 7, diretor1, elenco);

        elenco.add (ator1);
        elenco.add(diretor1);

        System.out.println("-----------" + avenger.getTitulo() + "------------");
        avenger.rodarFilme();
        avenger.exibirCreditos();
        System.out.println();
        System.out.println("----------"+ avenger2.getTitulo() + "------------");
        avenger2.rodarFilme();
        avenger2.exibirCreditos();
        System.out.println();
        diretor1.descreveInformacao();
        System.out.println();
        ator1.descreveInformacao();
    }



}
