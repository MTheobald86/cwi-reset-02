package br.com.cwi.resetflix.repository;

import br.com.cwi.resetflix.domain.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cwi.resetflix.entity.FilmeEntity;

import java.util.List;

public interface FilmeRepository extends JpaRepository<FilmeEntity, Long> {

    public List <FilmeEntity> findAllByGenero (Genero genero);

}
