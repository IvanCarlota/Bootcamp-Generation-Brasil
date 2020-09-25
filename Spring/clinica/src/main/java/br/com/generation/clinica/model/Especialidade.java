package br.com.generation.clinica.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "tbEspecialidade")
@Data
public class Especialidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//chave primária e autoincremento
	private long codespecialidade;
	
	@NotNull
	@Size(max =50)
	private String nome;

	

	

	
	
	
}
