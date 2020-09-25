package br.com.fancybox.fancybox.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name="produto")
@Data
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduto;
	

	@NotNull
	@Size(min=2,max=100)
	private String nomeProduto;
	
	@NotNull
	@Size(min=2)
	private String descricao;
	
	@NotNull
	@Size(min=2,max=50)
	private String marca;
	
	@NotNull
	private double preco;
	
	@NotNull
	private long quantidade;
	
	@Column
	private String imagem;

	@ManyToOne
	@JoinColumn(name="idCategoria")
	private Categoria categoria;
	
	


}
