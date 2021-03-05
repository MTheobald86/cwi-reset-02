package br.com.cwi.resetflix.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.repository.FilmeRepository;
import br.com.cwi.resetflix.response.ConsultarDetalhesAtorResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsultarDetalhesAtorResponseMapper {

    public ConsultarDetalhesAtorResponse mapear(final AtorEntity atorSalvo, final List<FilmeEntity> filmesAtor) {
        List<FilmeResponse> filmeResponses = new FilmeResponseMapper().mapear(filmesAtor);
        return new ConsultarDetalhesAtorResponse(atorSalvo.getId(),
            atorSalvo.getNome(), filmeResponses);
    }
}
