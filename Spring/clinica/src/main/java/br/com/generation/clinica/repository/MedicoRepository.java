package br.com.generation.clinica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import br.com.generation.clinica.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, String>{
	List<Medico> findAllByNomeContainingIgnoreCase(String nome);
}
