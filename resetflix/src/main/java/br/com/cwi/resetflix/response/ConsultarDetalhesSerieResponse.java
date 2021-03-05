package br.com.cwi.resetflix.response;

import java.util.List;

import br.com.cwi.resetflix.domain.Genero;

public class ConsultarDetalhesSerieResponse {

    private Long id;
    private String nome;
    private Genero genero;
    private Integer episodios;
    private Integer temporadas;
    private List<AtoresResponse> elenco;

    public ConsultarDetalhesSerieResponse(Long id, String nome, Genero genero, Integer episodios, Integer temporadas,
                                          List<AtoresResponse> elenco) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.temporadas = temporadas;
        this.elenco = elenco;
    }

    public ConsultarDetalhesSerieResponse(Long id, String nome, Genero genero, Integer episodios, Integer temporadas) {
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
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

    public List<AtoresResponse> getElenco() {
        return elenco;
    }

    public void setElenco(List<AtoresResponse> elenco) {
        this.elenco = elenco;
    }
}
