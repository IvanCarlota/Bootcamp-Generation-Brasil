package br.com.generation.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.generation.clinica.model.Ficha;

@Repository
public interface FichaRepository extends JpaRepository<Ficha, Long>{

}
