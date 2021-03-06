package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.entity.DiretorEntity;
import br.com.cwi.resetflix.entity.FilmeEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class DiretoresRepository {

    static List<DiretorEntity> diretores = new ArrayList<>();
    Long contadorIds = 1L;

    public List<DiretorEntity> getDiretores() {
       return diretores;
        }


    public Long criarDiretor(final DiretorEntity diretorSalvar) {
        if (diretorSalvar.getId() == null){
            diretorSalvar.setId(contadorIds);
            contadorIds++;
        }
        diretores.add(diretorSalvar);
        return diretorSalvar.getId();
    }

    public DiretorEntity acharDiretorPorId(final Long id) {
        DiretorEntity diretorDoFilme = new DiretorEntity();
        for (DiretorEntity diretorSalvo:diretores){
            if (diretorSalvo.getId().equals(id)){
                diretorDoFilme = diretorSalvo;
                break;
            }
        }
        return diretorDoFilme;
    }

    public Long vincularFilme(FilmeEntity filmeSalvar) {
        for (DiretorEntity diretor : diretores){
            if (diretor.getId().equals(filmeSalvar.getIdDiretor())){
                diretor.getIdFilmes().add(filmeSalvar.getId());
            }
        }
        return filmeSalvar.getIdDiretor();
    }
}
