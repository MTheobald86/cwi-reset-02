package Filmes;

public class Ator extends Pessoa {
    private int oscarGanho;

    public Ator(String nome, int idade, int oscarGanho, Genero genero) {
        super (nome, idade, genero);
        this.oscarGanho = oscarGanho;

    }

}
