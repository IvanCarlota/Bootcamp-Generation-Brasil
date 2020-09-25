package br.com.biblioteca.controller;

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

import br.com.biblioteca.model.Aluno;
import br.com.biblioteca.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
@CrossOrigin("*")
public class AlunoController {
	 
	@Autowired
	private AlunoRepository repositoryAluno;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> GetAll(){
		return ResponseEntity.ok(repositoryAluno.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aluno> GetById(@PathVariable long id){
		return repositoryAluno.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Aluno>> GetByTitulo(@PathVariable String nome){
		return ResponseEntity.ok(repositoryAluno.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Aluno> post (@RequestBody Aluno aluno){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryAluno.save(aluno));
	}
	
	@PutMapping
	public ResponseEntity<Aluno> put (@RequestBody Aluno aluno){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryAluno.save(aluno));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repositoryAluno.deleteById(id);
	}
	
}
