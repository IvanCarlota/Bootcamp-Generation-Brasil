package br.com.generation.clinica.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.generation.clinica.dto.MedicoDTO;
import br.com.generation.clinica.model.Especialidade;
import br.com.generation.clinica.model.Medico;
import br.com.generation.clinica.repository.EspecialidadeRepository;
import br.com.generation.clinica.repository.MedicoRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/medico")
@CrossOrigin("*")
@RequiredArgsConstructor
public class MedicoController {

	private final EspecialidadeRepository especialidadeRepository;
	
	private final MedicoRepository repository;
	
	@PostMapping
	public Medico salvar (@RequestBody MedicoDTO dto) {
		Long codespecialidade = dto.getEspecialidade();
		
		Especialidade especialidade = especialidadeRepository.findById(codespecialidade)
				.orElseThrow(()-> 
				new ResponseStatusException(HttpStatus.BAD_REQUEST, "Especialidade "
						+ "Inexistente."));
		Medico medico = new Medico();
		medico.setEspecialidade(especialidade);
		medico.setCrm(dto.getCrm());
		medico.setNome(dto.getNome());
		
		return repository.save(medico);
	}
	
	@GetMapping
	public ResponseEntity<List<Medico>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	

	
	@GetMapping("/medico/{medico}")
	public ResponseEntity<List<Medico>> GetByTitulo(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
}
