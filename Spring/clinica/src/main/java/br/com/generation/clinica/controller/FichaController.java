package br.com.generation.clinica.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.generation.clinica.dto.FichaDTO;
import br.com.generation.clinica.model.Ficha;
import br.com.generation.clinica.model.Medico;
import br.com.generation.clinica.model.Paciente;
import br.com.generation.clinica.repository.FichaRepository;
import br.com.generation.clinica.repository.MedicoRepository;
import br.com.generation.clinica.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/ficha")
@CrossOrigin("*")
@RequiredArgsConstructor
public class FichaController {
	
	private final MedicoRepository repositoryMedico;
	private final PacienteRepository repositorypaciente;
	private final FichaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Ficha>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public Ficha salvar(@RequestBody FichaDTO dto) {
		String crm = dto.getCrm();
		Long codPaciente = dto.getCodPaciente();
		
		Medico medico = repositoryMedico.findById(crm)
				.orElseThrow(()->
				new ResponseStatusException(HttpStatus.BAD_REQUEST, "Médico Inexistente."));
	
		Paciente paciente = repositorypaciente.findById(codPaciente)
				.orElseThrow(()->
				new ResponseStatusException(HttpStatus.BAD_REQUEST, "Paciente Inexistente."));
	
		Ficha ficha = new Ficha();
		ficha.setMedico(medico);
		ficha.setPaciente(paciente);
		ficha.setProcedimento(dto.getProcedimento());
		ficha.setDiagnostico(dto.getDiagnostico());
		ficha.setExame(dto.getExame());
		ficha.setDataConsulta(dto.getDataConsulta());
		ficha.setValorConsulta(dto.getValorConsulta());
	
		return repository.save(ficha);
	}
	
	
}
