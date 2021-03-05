package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.entity.FilmeEntity;
import br.com.cwi.resetflix.entity.SerieEntity;
import br.com.cwi.resetflix.response.ConsultarDetalhesDiretorResponse;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SerieRepository {

    List<SerieEntity> series = new ArrayList<>();
    Long idSerie = 101L;

    public List<SerieEntity> getSeries() {
        return series;
    }

    public Long criarSerie(SerieEntity serieSalvar) {
        if (serieSalvar.getId()==null){
            serieSalvar.setId(idSerie);
            idSerie++;
        }
        return serieSalvar.getId();
    }

    public List<SerieEntity> filtraSeriePorGenero(Genero genero) {
        List<SerieEntity> serieFiltrada = new ArrayList<>();

        for (SerieEntity serie : series){
            if (serie.getGenero().equals(genero)){
                serieFiltrada.add(serie);
            }
        }
        return serieFiltrada;
    }

    public SerieEntity acharSeriePorId(final Long id) {
        SerieEntity serieDetalhada = new SerieEntity();
        for (SerieEntity serie : series){
            if (serie.getId().equals(id)){
                serieDetalhada = serie;
                break;
            }
        }
        return serieDetalhada;
    }
}
