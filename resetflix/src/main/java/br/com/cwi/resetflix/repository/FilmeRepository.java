package br.com.cwi.resetflix.repository;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;

@Repository
public class FilmeRepository {

    static List<FilmeEntity> filmes = new ArrayList<>();

    public List<FilmeEntity> getFilmes(){
        return filmes;
    }

    public List<FilmeEntity> acharFilmesAtor(final Long id) {
        List<FilmeEntity> filmeAtor = new ArrayList<>();
        for (FilmeEntity filme : filmes){
            if (filme.getIdsAtores().equals(id)){
                filmeAtor.add(filme);
            }
        }

        return filmeAtor;
    }

    public List<FilmeEntity> acharFilmeDiretor(Long id) {
        // TODO Filtrar na repository por id de diretor;
        List<FilmeEntity> filmeDiretor = new ArrayList<>();
        for (FilmeEntity filme : filmes){
            if (filme.getIdDiretor().equals(id)){
                filmeDiretor.add(filme);
            }
        }
        return filmeDiretor;
    }
}
