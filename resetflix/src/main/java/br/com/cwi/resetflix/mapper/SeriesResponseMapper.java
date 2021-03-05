package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.SerieResponse;

import java.util.ArrayList;
import java.util.List;

public class SeriesResponseMapper {

    public List<SerieResponse> mapear(List<SerieEntity> series) {
        List<SerieResponse> serieResponses = new ArrayList<>();
        for (SerieEntity serie : series){
            serieResponses.add(new SerieResponse(serie.getId(), serie.getNome(), serie.getGenero()));
        }
        return serieResponses;
    }
}
