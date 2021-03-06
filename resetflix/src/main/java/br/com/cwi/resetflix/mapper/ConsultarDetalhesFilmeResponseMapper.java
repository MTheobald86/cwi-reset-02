package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.AtorEntity;
import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.repository.AtoresRepository;
import br.com.cwi.resetflix.repository.DiretoresRepository;
import br.com.cwi.resetflix.response.AtoresResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesDiretorResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesFilmeResponse;
import br.com.cwi.resetflix.response.DiretoresResponse;
import br.com.cwi.resetflix.service.AtoresService;
import br.com.cwi.resetflix.service.DiretorService;
import br.com.cwi.resetflix.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ConsultarDetalhesFilmeResponseMapper {

    @Autowired
    DiretoresRepository diretoresRepository;
    @Autowired
    DiretoresResponseMapper MAPPER_DIRETOR_DO_FILME;
    @Autowired
    AtoresRepository atoresRepository;
    @Autowired
    AtoresResponseMapper MAPPER_ELENCO;


    public ConsultarDetalhesFilmeResponse mapear(final FilmeEntity filmeSalvo){
         return  new ConsultarDetalhesFilmeResponse(filmeSalvo.getId(),
                filmeSalvo.getNome(),filmeSalvo.getGenero(),
                null, null);
    }
    private DiretoresResponse mapearDiretor(final Long id) {
        DiretorEntity diretor = diretoresRepository.acharDiretorPorId(id);
        DiretoresResponse diretorDoFilme = MAPPER_DIRETOR_DO_FILME.mapearDiretor(diretor);
        return diretorDoFilme;
    }
    private List<AtoresResponse> mapearAtores(final FilmeEntity filmeSalvo) {
        List<AtorEntity> atores = atoresRepository.getAtores();
        for (AtorEntity ator : atores) {
            if (ator.getId().equals(filmeSalvo.getIdsAtores())) {
                atores.add(ator);
            }
        }
        List<AtoresResponse> elenco = MAPPER_ELENCO.mapear(atores);
        return elenco;
    }
}
