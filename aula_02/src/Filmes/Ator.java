package Filmes;

public class Ator {
    private String nome;
    private int idade;
    private int oscarGanho;
    private Genero genero;

    public Ator(String nome, int idade, int oscarGanho, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.oscarGanho = oscarGanho;
        this.genero = genero;
    }


    public void descreveAtor(){
    System.out.println ("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);
    System.out.println("Gênero: " + this.genero);
}
}
