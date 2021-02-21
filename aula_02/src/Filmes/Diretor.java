package Filmes;

import java.time.LocalDate;

public class Diretor extends Pessoa {

    private int quantidadeDeFilmesDirigidos;

    public Diretor(String nome, LocalDate dataNascimento, int quantidadeDeFilmesDirigidos, Genero genero) {
        super (nome, dataNascimento, genero);
        this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;

    }

    @Override
    public void descreveInformacao() {
        super.descreveInformacao();
        System.out.println ("Quantidade de filmes dirigidos: " + quantidadeDeFilmesDirigidos);
    }
}
