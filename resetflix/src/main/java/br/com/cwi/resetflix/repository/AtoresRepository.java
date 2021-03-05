package br.com.cwi.resetflix.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.cwi.resetflix.entity.FilmeEntity;
import org.springframework.stereotype.Repository;

import br.com.cwi.resetflix.entity.AtorEntity;

@Repository
public class AtoresRepository {

    static List<AtorEntity> atores = new ArrayList<>();
    Long contadorIds = 1l;

    public List<AtorEntity> getAtores(){
        return atores;
    }

    public Long criarAtor(final AtorEntity atorSalvar) {
        if(atorSalvar.getId() == null){
            atorSalvar.setId(contadorIds);
            contadorIds++;
        }
        atores.add(atorSalvar);
        return atorSalvar.getId();
    }

    public AtorEntity acharAtorPorId(final Long id) {
        AtorEntity atorProcurado = new AtorEntity();
        for(AtorEntity ator : atores){
            if(ator.getId().equals(id)){
               atorProcurado = ator;
               break;
            }
        }
        return atorProcurado;
    }

    public void vincularFilme(FilmeEntity filmeSalvar) {
        for (AtorEntity ator : atores){
            if (ator.getId().equals(filmeSalvar.getIdsAtores())){
                ator.getIdsFilmes().add(filmeSalvar.getId());
            }
        }
    }
}
