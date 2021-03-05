package br.com.cwi.resetflix.mapper;

import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.request.CriarSerieRequest;

public class SerieEntityMapper {
    public SerieEntity mapear(CriarSerieRequest request) {
        SerieEntity serieSalvar = new SerieEntity(request.getId(), request.getNome(), request.getGenero(),
                request.getEpisodios(), request.getTemporadas());
        return serieSalvar;
    }
}
