package com.company;

import com.company.Dominio.Editora;
import com.company.Dominio.Filme;
import com.company.Dominio.Genero;
import com.company.Heranca.Diretor;

public class AplicacaoTeste {
    public static void main (String [] args){

        Filme theAvenger = new Filme ("The Avenger", "Os heróis mais poderosos da Terra", 120,
                2011, 10, new Diretor("Kevin Feige", 40, 10,
                Genero.MASCULINO));

        Filme ligaDaJustica = new Filme("Liga da Justiça", "Um filminho qualquer", 120,
                2015, 1, new Diretor("Fulano", 50, 1,
                Genero.MASCULINO));

        Editora editora1 = new Editora("DC Comics", "California");
        editora1.apresentaEditora();

        theAvenger.reproduzir();
        ligaDaJustica.reproduzir();

    }


}
