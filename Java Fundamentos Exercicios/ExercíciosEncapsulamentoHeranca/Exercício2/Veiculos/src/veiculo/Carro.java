package veiculo;

public class Carro extends Veiculo{
	private String numeroPortas;
	private String numeroBancos;
	private boolean temArCondicionado;
	private boolean temDirecaohidraulica;
	private boolean temVidroEletrico;
	private boolean temCameraTraseira;
	
	
	public String getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(String numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	public String getNumeroBancos() {
		return numeroBancos;
	}
	public void setNumeroBancos(String numeroBancos) {
		this.numeroBancos = numeroBancos;
	}
	public boolean isTemArCondicionado() {
		return temArCondicionado;
	}
	public void setTemArCondicionado(boolean temArCondicionado) {
		this.temArCondicionado = temArCondicionado;
	}
	public boolean isTemDirecaohidraulica() {
		return temDirecaohidraulica;
	}
	public void setTemDirecaohidraulica(boolean temDirecaohidraulica) {
		this.temDirecaohidraulica = temDirecaohidraulica;
	}
	public boolean isTemVidroEletrico() {
		return temVidroEletrico;
	}
	public void setTemVidroEletrico(boolean temVidroEletrico) {
		this.temVidroEletrico = temVidroEletrico;
	}
	public boolean isTemCameraTraseira() {
		return temCameraTraseira;
	}
	public void setTemCameraTraseira(boolean temCameraTraseira) {
		this.temCameraTraseira = temCameraTraseira;
	}
	
	
	
	public void mostraNumeroPortas() {
		System.out.println("O "+this.getMarca()+" tem "+ this.getNumeroPortas()+" portas!");
	}
	
	public void mostraNumeroBancos() {
		System.out.println("O "+this.getMarca()+" tem "+ this.getNumeroBancos()+" banco!");
	}
	
	
	
}
