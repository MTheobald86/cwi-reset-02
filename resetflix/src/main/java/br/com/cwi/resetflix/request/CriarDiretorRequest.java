package br.com.cwi.resetflix.request;

import java.util.List;

public class CriarDiretorRequest {
    private String nome;
    private List<Long> idsFilmes;

    public CriarDiretorRequest(String nome, List<Long> idsFilmes) {
        this.nome = nome;
        this.idsFilmes = idsFilmes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Long> getIdsFilmes() {
        return idsFilmes;
    }

    public void setIdsFilmes(List<Long> idsFilmes) {
        this.idsFilmes = idsFilmes;
    }
}
