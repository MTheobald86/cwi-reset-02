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
    DiretoresResponseMapper MAPPER_DIRETOR_DO_FILME;
    AtoresRepository atoresRepository;
    AtoresResponseMapper MAPPER_ELENCO;


    public ConsultarDetalhesFilmeResponse mapear(final FilmeEntity filmeSalvo){
        Long  idDiretor = filmeSalvo.getIdDiretor();
        DiretorEntity diretor = diretoresRepository.acharDiretorPorId(idDiretor);
        DiretoresResponse diretorDoFilme = MAPPER_DIRETOR_DO_FILME.mapearDiretor(diretor);
        List<AtorEntity> atores= atoresRepository.getAtores();
        for (AtorEntity ator : atores){
            if (ator.getId().equals(filmeSalvo.getIdsAtores())){
                atores.add(ator);
            }
        }
        List<AtoresResponse> elenco = MAPPER_ELENCO.mapear(atores);
        return new ConsultarDetalhesFilmeResponse(filmeSalvo.getId(), filmeSalvo.getNome(),filmeSalvo.getGenero(),
                diretorDoFilme, elenco);

    }

}
