package br.com.generation.clinica.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;


@Entity
@Table(name = "tbFicha")
@Data
public class Ficha {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codFicha;
	
	@ManyToOne
	@JoinColumn(name="codPaciente")
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name="crm")
	private Medico medico; 
	
	private Date dataConsulta = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	private double valorConsulta;
	
	private String diagnostico;
	
	private String procedimento;
	
	private String exame;
	
	private Date dataRetorno;

	
}
