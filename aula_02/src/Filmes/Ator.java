package Filmes;

import java.time.LocalDate;

public class Ator extends Pessoa {
    private int oscarGanho;

    public Ator(String nome, LocalDate dataNascimento, int oscarGanho, Genero genero) {
        super (nome, dataNascimento, genero);
        this.oscarGanho = oscarGanho;

    }

    @Override
    public void descreveInformacao() {
        super.descreveInformacao();
        System.out.println ("Quantidade de oscar ganhos: "+ oscarGanho);
    }
}
