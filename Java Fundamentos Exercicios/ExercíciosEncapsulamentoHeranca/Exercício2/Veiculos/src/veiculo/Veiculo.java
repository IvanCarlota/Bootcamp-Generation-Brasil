package veiculo;

public class Veiculo {
	
	private String marca;
	private String anoFabrica��o;
	private boolean ligado;
	private boolean temRodas;
	private String cor;
	private boolean temRetrovisor;
	
	
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAnoFabrica��o() {
		return anoFabrica��o;
	}

	public void setAnoFabrica��o(String anoFabrica��o) {
		this.anoFabrica��o = anoFabrica��o;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTemRodas() {
		return temRodas;
	}

	public void setTemRodas(boolean temRodas) {
		this.temRodas = temRodas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isTemRetrovisor() {
		return temRetrovisor;
	}

	public void setTemRetrovisor(boolean temRetrovisor) {
		this.temRetrovisor = temRetrovisor;
	}
	
	
	

	public void ligarVeiculo() {
		System.out.println("O ve�culo "+ this.getMarca()+" foi ligado!");
	}
	
	public void corVeiculo() {
		System.out.println("O ve�culo "+ this.getMarca()+" possui a cor "+ this.getCor());
	}
	
	public void desligarVeiculo() {
		System.out.println("O ve�culo "+ this.getMarca()+" foi desligado!");
	}
	
	
	
}
