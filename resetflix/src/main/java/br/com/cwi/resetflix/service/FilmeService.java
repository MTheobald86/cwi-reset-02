package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.exception.NotFoundException;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesFilmeResponseMapper;
import br.com.cwi.resetflix.mapper.FilmeEntityMapper;
import br.com.cwi.resetflix.mapper.FilmeResponseMapper;
import br.com.cwi.resetflix.repository.AtoresRepository;
import br.com.cwi.resetflix.repository.DiretoresRepository;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.request.CriarFilmeRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {
    static FilmeResponseMapper MAPPER_RESPONSE = new FilmeResponseMapper() ;
    static ConsultarDetalhesFilmeResponseMapper MAPPER_DETALHES_FILME = new ConsultarDetalhesFilmeResponseMapper();
    static FilmeEntityMapper MAPPER_ENTITY = new FilmeEntityMapper();

    @Autowired
    private FilmeRepository filmeRepository;
    @Autowired
    private DiretoresRepository diretoresRepository;
    @Autowired
    private AtoresRepository atoresRepository;

    public ConsultarDetalhesFilmeResponse acharFilmePorId(final Long id) {
        FilmeEntity filmeSalvo = filmeRepository.encontrarFilmeId(id);
        return MAPPER_DETALHES_FILME.mapear(filmeSalvo);

    }

    public List<FilmeResponse> getFilmes(final Genero genero){
        List<FilmeEntity> filmes = filmeRepository.getFilmes(genero);
        return MAPPER_RESPONSE.mapear(filmes);
    }

    public Long criarFilme(final CriarFilmeRequest request) {
        FilmeEntity filmeSalvar = MAPPER_ENTITY.mapear(request);
        return filmeRepository.criarFilme(filmeSalvar);
    }
}
