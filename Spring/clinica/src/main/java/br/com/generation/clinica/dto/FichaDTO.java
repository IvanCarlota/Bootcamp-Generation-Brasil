package br.com.generation.clinica.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FichaDTO {
	
	private long codFicha;
	
	private Long medico;
	
	private Date dataConsulta = new java.sql.Date(System.currentTimeMillis());
	
	private double valorConsulta;
	
	private String diagnostico;
	
	private String procedimento;
	
	private String exame;
	
	private Date dataRetorno;
	
	private String crm;
	
	private long codPaciente;
}
