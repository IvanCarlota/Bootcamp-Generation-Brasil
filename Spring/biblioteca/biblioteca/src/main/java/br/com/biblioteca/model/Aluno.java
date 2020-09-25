package br.com.biblioteca.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tbAluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAluno;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String sobrenome;
	
	@NotNull
	@Size(min = 11, max =11)
	private String cdCpf;
	
	@NotNull
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dtDeNascimento;
	
	@NotNull
	@Size(min=8, max=80)
	private String nmEmail;
	
	@NotNull
	@Size(min=8, max = 9)
	private String nrTelefone;

	public long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(long idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCdCpf() {
		return cdCpf;
	}

	public void setCdCpf(String cdCpf) {
		this.cdCpf = cdCpf;
	}

	public Date getDtDeNascimento() {
		return dtDeNascimento;
	}

	public void setDtDeNascimento(Date dtDeNascimento) {
		this.dtDeNascimento = dtDeNascimento;
	}

	public String getNmEmail() {
		return nmEmail;
	}

	public void setNmEmail(String nmEmail) {
		this.nmEmail = nmEmail;
	}

	public String getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}
	
	
}
