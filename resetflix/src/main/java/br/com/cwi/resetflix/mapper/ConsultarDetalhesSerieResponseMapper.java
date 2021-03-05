package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;

public class ConsultarDetalhesSerieResponseMapper {

    public ConsultarDetalhesSerieResponse mapear(SerieEntity serieEntity) {
        return new ConsultarDetalhesSerieResponse(serieEntity.getId(), serieEntity.getNome(), serieEntity.getGenero(),
                serieEntity.getEpisodios(), serieEntity.getTemporadas());
    }
}
