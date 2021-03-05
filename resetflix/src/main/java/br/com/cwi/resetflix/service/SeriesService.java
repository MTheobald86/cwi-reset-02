package br.com.cwi.resetflix.service;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesAtorResponseMapper;
import br.com.cwi.resetflix.mapper.ConsultarDetalhesSerieResponseMapper;
import br.com.cwi.resetflix.mapper.SerieEntityMapper;
import br.com.cwi.resetflix.mapper.SeriesResponseMapper;
import br.com.cwi.resetflix.repository.SerieRepository;
import br.com.cwi.resetflix.request.CriarSerieRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.SerieResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class SeriesService {

    static SeriesResponseMapper MAPPER_RESPONSE = new SeriesResponseMapper();
    static SerieEntityMapper MAPPER_ENTITY = new SerieEntityMapper();
    static ConsultarDetalhesSerieResponseMapper MAPPER_DETALHES_SERIE = new ConsultarDetalhesSerieResponseMapper();

    @Autowired
    SerieRepository serieRepository;



    public List<SerieResponse> getSeries(){
        List<SerieEntity> series = serieRepository.getSeries();
        return MAPPER_RESPONSE.mapear(series);
    }

    public Long criarSerie(final CriarSerieRequest request) {
        SerieEntity serieSalvar = MAPPER_ENTITY.mapear(request);
        return serieRepository.criarSerie(serieSalvar);
    }

    public List<SerieResponse> getSeriesPorGenero(final Genero genero) {
        List<SerieEntity> serieComFiltro = serieRepository.filtraSeriePorGenero(genero);
        return MAPPER_RESPONSE.mapear(serieComFiltro);
    }

    public ConsultarDetalhesSerieResponse getSerieById(final Long id) {
        SerieEntity serieEntity = serieRepository.acharSeriePorId(id);
        return MAPPER_DETALHES_SERIE.mapear(serieEntity);
    }
}
