package Filmes;

public class Diretor {
    private String nome;
    private int idade;
    private int quantidadeDeFilmesDirigidos;

    public Diretor(String nome, int idade, int quantidadeDeFilmesDirigidos) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", quantidadeDeFilmesDirigidos=" + quantidadeDeFilmesDirigidos +
                '}';

    }
}
