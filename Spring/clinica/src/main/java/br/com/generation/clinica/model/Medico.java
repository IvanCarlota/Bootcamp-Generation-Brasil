package br.com.generation.clinica.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "tbMedico")
@Data
public class Medico {
	
	@Id
	private String crm;
	
	@NotNull
	@Size(min=2, max=80)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="especialidade")
	private Especialidade especialidade;
	
}
