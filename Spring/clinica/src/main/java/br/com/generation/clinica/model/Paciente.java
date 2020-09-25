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
@Table(name = "tbPaciente")
@Data
public class Paciente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//chave primária e autoincremento
	private long codPaciente;
	
	@NotNull
	@Size(min=2, max=80)
	private String nome;
	
	@NotNull
	@Size(min=2, max=80)
	private String endereco;
	
	@NotNull
	@Size(max=9)
	private String cep;
	
	@NotNull
	@Size(max=11)
	private String telefone;

	
}
