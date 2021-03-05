package br.com.cwi.resetflix.request;

import br.com.cwi.resetflix.domain.Genero;

public class CriarSerieRequest {
    private Long id;
    private String nome;
    private Genero genero;
    private Integer episodios;
    private Integer temporadas;

    public CriarSerieRequest() {
    }

    public CriarSerieRequest(Long id, String nome, Genero genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
    }

    public CriarSerieRequest(Long id, String nome, Genero genero, Integer episodios, Integer temporadas) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.temporadas = temporadas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public Genero getGenero (){
        return genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEpisodios() {
        return episodios;
    }

    public void setEpisodios(Integer episodios) {
        this.episodios = episodios;
    }

    public Integer getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Integer temporadas) {
        this.temporadas = temporadas;
    }

}
