package br.com.fancybox.fancybox.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.fancybox.fancybox.dto.DoacaoDTO;
import br.com.fancybox.fancybox.model.Doacao;
import br.com.fancybox.fancybox.model.Ong;
import br.com.fancybox.fancybox.model.Usuario;
import br.com.fancybox.fancybox.repository.DoacaoRepository;
import br.com.fancybox.fancybox.repository.OngRepository;
import br.com.fancybox.fancybox.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/doacao") 
@CrossOrigin("*")
@RequiredArgsConstructor
public class DoacaoController {
	
	
	private final DoacaoRepository repositoryDoacao;
	private final UsuarioRepository repositoryUsuario;
	private final OngRepository repositoryOng;
	
	
	@PostMapping
	public Doacao salvar(@RequestBody DoacaoDTO dtoDoacao) {
		long idUsuario = dtoDoacao.getIdUsuario();
		long idOng = dtoDoacao.getIdOng();
		

	Usuario usuario = 
				repositoryUsuario.findById(idUsuario)
				.orElseThrow(()->
				new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuario Inexistente"));
	
	Ong ong = 
			repositoryOng.findById(idOng)
			.orElseThrow(()->
			new ResponseStatusException(HttpStatus.BAD_REQUEST, "Produto Inexistente"));

	Doacao doacao = new Doacao();
	doacao.setUsuario(usuario);
	doacao.setOng(ong);
	doacao.setEmail(dtoDoacao.getEmail());
	doacao.setValorDoacao(dtoDoacao.getValorDoacao());
		
	return repositoryDoacao.save(doacao);
	}
	

	
	
	
}
