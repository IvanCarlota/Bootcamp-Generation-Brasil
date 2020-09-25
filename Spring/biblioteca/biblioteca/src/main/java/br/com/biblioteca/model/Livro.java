package br.com.biblioteca.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tbLivro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idLivro;
	
	@NotNull
	private String titulo;
	
	@NotNull
	private String nmAutor;
	
	@NotNull
	private String nmGenero;
	
	@NotNull
	@JsonFormat(pattern="yyyy")
	private Date dtDePublicacao;
	
	@NotNull
	private long cdEdicao;
	
	@NotNull
	private long cdIsbn;
	
	@NotNull
	private long qtdPagina;
	
	@NotNull
	private String nmEditora;
	
	@NotNull
	private String nmIdioma;
	
	@NotNull
	private double cdAltura;
	
	@NotNull
	private double cdEspessura;
	
	@NotNull
	private double peso;
	
	@NotNull
	private double largura;
	
	@NotNull
	private String nmFormatoLivro;

	public long getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(long idLivro) {
		this.idLivro = idLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNmAutor() {
		return nmAutor;
	}

	public void setNmAutor(String nmAutor) {
		this.nmAutor = nmAutor;
	}

	public String getNmGenero() {
		return nmGenero;
	}

	public void setNmGenero(String nmGenero) {
		this.nmGenero = nmGenero;
	}

	public Date getDtDePublicacao() {
		return dtDePublicacao;
	}

	public void setDtDePublicacao(Date dtDePublicacao) {
		this.dtDePublicacao = dtDePublicacao;
	}

	public long getCdEdicao() {
		return cdEdicao;
	}

	public void setCdEdicao(long cdEdicao) {
		this.cdEdicao = cdEdicao;
	}

	public long getCdIsbn() {
		return cdIsbn;
	}

	public void setCdIsbn(long cdIsbn) {
		this.cdIsbn = cdIsbn;
	}

	public long getQtdPagina() {
		return qtdPagina;
	}

	public void setQtdPagina(long qtdPagina) {
		this.qtdPagina = qtdPagina;
	}

	public String getNmEditora() {
		return nmEditora;
	}

	public void setNmEditora(String nmEditora) {
		this.nmEditora = nmEditora;
	}

	public String getNmIdioma() {
		return nmIdioma;
	}

	public void setNmIdioma(String nmIdioma) {
		this.nmIdioma = nmIdioma;
	}

	public double getCdAltura() {
		return cdAltura;
	}

	public void setCdAltura(double cdAltura) {
		this.cdAltura = cdAltura;
	}

	public double getCdEspessura() {
		return cdEspessura;
	}

	public void setCdEspessura(double cdEspessura) {
		this.cdEspessura = cdEspessura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public String getNmFormatoLivro() {
		return nmFormatoLivro;
	}

	public void setNmFormatoLivro(String nmFormatoLivro) {
		this.nmFormatoLivro = nmFormatoLivro;
	}

	
	
	
}
