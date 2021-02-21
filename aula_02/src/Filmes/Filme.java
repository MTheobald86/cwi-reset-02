package Filmes;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private String descricao;
    private String tempoDeDuracaoEmMinutos;
    private int anoDeLancamento;
    private int avaliacao;
    private Diretor diretor;
    private List<Pessoa> elenco;


    public Filme(String titulo, String descricao, String tempoDeDuracaoEmMinutos, int anoDeLancamento, int avaliacao,
                 Diretor diretor,
                 List<Pessoa> elenco) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tempoDeDuracaoEmMinutos = tempoDeDuracaoEmMinutos;
        this.anoDeLancamento = anoDeLancamento;
        this.avaliacao = avaliacao;
        this.diretor= diretor;
        this.elenco = elenco;
    }



    public void rodarFilme (){
        System.out.println("Título: " + titulo);
        System.out.println("Sinopse: "+ descricao);
        System.out.println ("Tempo de duração: " + tempoDeDuracaoEmMinutos);
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



    public void exibirCreditos (){
        System.out.println("elenco: ");
        for (Pessoa elemento:elenco){
            elemento.descreveInformacao();
        }

    }


}




