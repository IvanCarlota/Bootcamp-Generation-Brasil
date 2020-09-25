package model;

public class Eletrodomesticos {
	
	private String nomeDoEletro;
	private boolean ligado;
	private String cor;
	private String formato;
	
	
	public String getNomeDoEletro() {
		return nomeDoEletro;
	}
	public void setNomeDoEletro(String nomeDoEletro) {
		this.nomeDoEletro = nomeDoEletro;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	
	
	
	public void ligarEletro() {
		System.out.println(this.getNomeDoEletro() +" foi ligado!");
	}
	
	public void desligarEletro() {
		System.out.println(this.getNomeDoEletro() +" foi desligado!");
	}
	
	
}
