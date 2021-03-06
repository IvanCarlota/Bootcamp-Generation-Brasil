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

import br.com.biblioteca.model.Livro;
import br.com.biblioteca.repository.LivroRepository;

@RestController
@RequestMapping("/livro")
@CrossOrigin("*")
public class LivroController {
	
	@Autowired
	private LivroRepository repositoryLivro;
	
	@GetMapping
	public ResponseEntity<List<Livro>> GetAll(){
		return ResponseEntity.ok(repositoryLivro.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Livro> GetById(@PathVariable long id){
		return repositoryLivro.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Livro>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repositoryLivro.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity<Livro> post (@RequestBody Livro livro){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryLivro.save(livro));
	}
	
	@PutMapping
	public ResponseEntity<Livro> put (@RequestBody Livro livro){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryLivro.save(livro));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repositoryLivro.deleteById(id);
	}
	
}
