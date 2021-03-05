package br.com.cwi.resetflix.web;

import br.com.cwi.resetflix.domain.Genero;
import br.com.cwi.resetflix.request.CriarSerieRequest;
import br.com.cwi.resetflix.response.ConsultarDetalhesSerieResponse;
import br.com.cwi.resetflix.response.FilmeResponse;
import br.com.cwi.resetflix.response.SerieResponse;
import br.com.cwi.resetflix.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/series")
public class SeriesController implements SeriesContract {

    @Autowired
    SeriesService seriesService;


    @Override
    public void assistirSerie(Long id, Integer temporada, Integer episodio) {

    }

    @Override
    @GetMapping
    public List<SerieResponse> getSeries(final Genero genero) {
        return seriesService.getSeriesPorGenero(genero);
    }

    @Override
    public ConsultarDetalhesSerieResponse getSerieById(final Long id) {
        return seriesService.getSerieById(id);
    }

    @Override
    @PostMapping
    public Long criarSerie(@RequestBody final CriarSerieRequest request){
        return seriesService.criarSerie(request);
    }

    @Override
    public List<SerieResponse> getSeries() {
        //TODO implementar recomendacoes
        return null;
    }


}
