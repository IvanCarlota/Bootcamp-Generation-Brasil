package br.com.generation.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.generation.clinica.model.Paciente;
import br.com.generation.clinica.repository.PacienteRepository;

@RestController
@RequestMapping("/paciente")
@CrossOrigin("*")
public class PacienteController {
	
	@Autowired
	private PacienteRepository repositoryPaciente;
	
	@GetMapping
	public ResponseEntity<List<Paciente>> GetAll(){
		return ResponseEntity.ok(repositoryPaciente.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Paciente> GetById(@PathVariable long id){
		return repositoryPaciente.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/paciente/{paciente}")
	public ResponseEntity<List<Paciente>> GetByTitulo(@PathVariable String nome){
		return ResponseEntity.ok(repositoryPaciente.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Paciente> post (@RequestBody Paciente paciente){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryPaciente.save(paciente));
	}
	
	@PutMapping
	public ResponseEntity<Paciente> put (@RequestBody Paciente paciente){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryPaciente.save(paciente));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repositoryPaciente.deleteById(id);
	}
	
}
