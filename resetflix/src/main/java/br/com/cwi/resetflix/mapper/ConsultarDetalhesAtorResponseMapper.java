package br.com.cwi.resetflix.mapper;

import java.util.List;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.response.ConsultarDetalhesAtorResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsultarDetalhesAtorResponseMapper {
    static FilmeResponseMapper MAPPER_RESPONSE = new FilmeResponseMapper();

    @Autowired
    FilmeRepository filmeRepository;

    public ConsultarDetalhesAtorResponse mapear(final AtorEntity atorSalvo) {

        List<FilmeEntity> filmesEntity = filmeRepository.acharFilmesAtor(atorSalvo.getId());
        List<FilmeResponse> filmesResponse = MAPPER_RESPONSE.mapear(filmesEntity);
        return new ConsultarDetalhesAtorResponse(atorSalvo.getId(),
            atorSalvo.getNome(), filmesResponse);
    }
}
