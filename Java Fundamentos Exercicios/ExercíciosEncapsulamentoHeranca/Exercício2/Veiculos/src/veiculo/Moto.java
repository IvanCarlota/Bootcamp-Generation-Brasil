package veiculo;

public class Moto extends Veiculo {
	private String cilindrada;
	private boolean temPezinho;
	private boolean temBau;
	
	
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	public boolean isTemPezinho() {
		return temPezinho;
	}
	public void setTemPezinho(boolean temPezinho) {
		this.temPezinho = temPezinho;
	}
	public boolean isTemBau() {
		return temBau;
	}
	public void setTemBau(boolean temBau) {
		this.temBau = temBau;
	}
	
	
	public void mostracilindrada() {
		System.out.println("A "+this.getMarca()+" tem "+ this.getCilindrada()+" cilindradas!");
	}
	
	public void mostraPezinho() {
		System.out.println("A "+this.getMarca()+" tem pezinho para apoiar!");
	}
	
	
}
