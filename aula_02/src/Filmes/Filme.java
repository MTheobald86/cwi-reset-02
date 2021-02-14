package Filmes;

public class Filme {
    private String titulo;
    private String descricao;
    private String tempoDeDuracaoEmMinutos;
    private int anoDeLancamento;
    private int avaliacao;
    private Diretor diretor;


    public Filme(String titulo, String descricao, String tempoDeDuracaoEmMinutos, int anoDeDuracao, int avaliacao,
                 Diretor diretor) {
        this.titulo = titulo;
        verificaTitulo (titulo);
        this.descricao = descricao;
        this.tempoDeDuracaoEmMinutos = tempoDeDuracaoEmMinutos;
        this.anoDeLancamento = anoDeDuracao;
        notaDeAvaliacao (avaliacao);
        this.diretor = diretor;
    }

    public void rodarFilme (){
        System.out.println("Título: " + titulo);
        System.out.println("Sinopse: "+ descricao);
        System.out.println ("Tempo de duração: " + tempoDeDuracaoEmMinutos);
        System.out.println ("Diretor: " + diretor.getNome());
        System.out.println("Classificacao: " + avaliacao);

    }

    private void notaDeAvaliacao (int avaliacao) {
        if (avaliacao < 1 || avaliacao > 5){
            this.avaliacao = 3;
        }else {
            this.avaliacao = avaliacao;
        }
    }

    private void verificaTitulo (String titulo){
        if ("Batman vs Superman".equals(titulo)){
            this.avaliacao = 1;
        } else if ("Clube da Luta".equals(titulo)){
            this.avaliacao = 5;
          }
    }
}




