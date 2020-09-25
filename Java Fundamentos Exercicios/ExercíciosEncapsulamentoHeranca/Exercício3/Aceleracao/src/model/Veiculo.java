package model;

public class Veiculo {
	private String marca;
	private String cor;
	private int velocidade;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	
	
	public void acelerar() {
		this.velocidade++;
		System.out.println("O "+this.marca+" esta andando a "+this.velocidade+"km por hora.");
	}
	
	public void freiar() {
		if (this.velocidade == 70) {
			System.out.println("O carro esta capotado!");
		}else {
			this.velocidade--;
			System.out.println("O "+this.marca+" esta andando a "+this.velocidade+"km por hora.");
		}
	}
		
		
	
	
	public void fazerCurva() {
		if (this.velocidade == 70) {
			System.out.println("O carro capotou na curva!!!");
		}else {
			System.out.println("O carro fez uma curva!");
		}
	}
	
	
}
