package br.com.cwi.resetflix.repository;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.cwi.resetflix.exception.NotFoundException;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;

import javax.swing.text.html.parser.Entity;

@Repository
public class FilmeRepository {

    static List<FilmeEntity> filmes = new ArrayList<>();
    static Long idFilme = 1001l;

    @Autowired
    DiretoresRepository diretoresRepository;
    AtoresRepository atoresRepository;


    public List<FilmeEntity> getFilmes(Genero genero){
        for (FilmeEntity filme : filmes){
            if (filme.getGenero().equals(genero)){
                filmes.add(filme);
            }else{
                throw new NotFoundException("Não há registros para sua busca");
            }
        }
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
        List<FilmeEntity> filmeDiretor = new ArrayList<>();
        for (FilmeEntity filme : filmes){
            if (filme.getIdDiretor().equals(id)){
                filmeDiretor.add(filme);
            }
        }
        return filmeDiretor;
    }

    public FilmeEntity encontrarFilmeId(Long id) {
        for (FilmeEntity filme : filmes){
            if (filme.getId().equals(id)){
                return filme;
            }
        }
        return null;
    }

    public Long criarFilme(final FilmeEntity filmeSalvar) {
        if (filmeSalvar.getId() == null){
            filmeSalvar.setId(idFilme);
            idFilme++;
        }
        diretoresRepository.vincularFilme(filmeSalvar);
        atoresRepository.vincularFilme(filmeSalvar);

        filmes.add(filmeSalvar);
        return filmeSalvar.getId();
    }
}
