package br.com.biblioteca.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmprestimo;
	
	@NotNull
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date dtRetirada = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date dtDevolucaoPrevista = new java.sql.Date(System.currentTimeMillis());

	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private Date dtDevolucao = new java.sql.Date(System.currentTimeMillis());

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idLivro", referencedColumnName="idLivro") 
	private Livro livro;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idAluno", referencedColumnName="idAluno") 
	private Aluno aluno;

	public long getIdEmprestimo() {
		return idEmprestimo;
	}

	public void setIdEmprestimo(long idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}

	public Date getDtRetirada() {
		return dtRetirada;
	}

	public void setDtRetirada(Date dtRetirada) {
		this.dtRetirada = dtRetirada;
	}

	public Date getDtDevolucaoPrevista() {
		return dtDevolucaoPrevista;
	}

	public void setDtDevolucaoPrevista(Date dtDevolucaoPrevista) {
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
	}

	public Date getDtDevolucao() {
		return dtDevolucao;
	}

	public void setDtDevolucao(Date dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
