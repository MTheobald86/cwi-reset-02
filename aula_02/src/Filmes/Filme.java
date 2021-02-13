package Filmes;

public class Filme {
    private String titulo;
    private String descricao;
    private String tempoDeDuracaoEmMinutos;
    private int anoDeLancamento;
    private int notaDeAvaliacao;
    private Diretor diretor;


    public Filme(String titulo, String descricao, String tempoDeDuracaoEmMinutos, int anoDeDuracao, int notaDeAvaliacao, Diretor diretor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tempoDeDuracaoEmMinutos = tempoDeDuracaoEmMinutos;
        this.anoDeLancamento = anoDeDuracao;
        this.notaDeAvaliacao = notaDeAvaliacao;
        this.diretor = diretor;
    }

    public void rodarFilme (){
        System.out.println("Título: " + titulo);
        System.out.println("Sinopse: "+ descricao);
        System.out.println ("Tempo de duração: " + tempoDeDuracaoEmMinutos);
        System.out.println ("Diretor: " + diretor);

    }

}
