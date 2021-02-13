package Filmes;

public class Diretor {
    private String nome;
    private int idade;
    private int quantidadeDeFilmesDirigidos;
    private Genero genero;

    public Diretor(String nome, int idade, int quantidadeDeFilmesDirigidos, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeDeFilmesDirigidos = quantidadeDeFilmesDirigidos;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", quantidadeDeFilmesDirigidos=" + quantidadeDeFilmesDirigidos +
                '}';

    }

    public void descreveDiretor() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Gênero: " + this.genero);
    }

    public Genero getGenero() {
        return genero;
    }
}
