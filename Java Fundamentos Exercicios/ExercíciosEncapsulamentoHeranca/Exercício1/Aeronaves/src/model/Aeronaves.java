 package model;

public class Aeronaves {
	
	private String nomeAeronave;
	private boolean asas;
	private boolean calda;
	private boolean turbinas;
	private String porte;
	private String tipo;
	


	public String getNomeAeronave() {
		return nomeAeronave;
	}

	public void setNomeAeronave(String nomeAeronave) {
		this.nomeAeronave = nomeAeronave;
	}

	public boolean isAsas() {
		return asas;
	}

	public void setAsas(boolean asas) {
		this.asas = asas;
	}

	public boolean isCalda() {
		return calda;
	}

	public void setCalda(boolean calda) {
		this.calda = calda;
	}

	public boolean isTurbinas() {
		return turbinas;
	}

	public void setTurbinas(boolean turbinas) {
		this.turbinas = turbinas;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

	public void ligarAviao() {
		System.out.println("A Aeronave " + this.nomeAeronave +" foi ligada!");
	}
	
	public void iniciandoVoo() {
		System.out.println("A Aeronave " + this.nomeAeronave + " começou a decolagem!");
	}
	
	public void estabilizandoVoo() {
		System.out.println("A Aeronave " + this.nomeAeronave +" esta voando de forma estabilizada!");
	}
	
	public void preparandoParaPousar() {
		System.out.println("A Aeronave " + this.nomeAeronave +" esta preparando-se para pousar e descendo sua altitude!");
	}
	
	public void pouso() {
		System.out.println("A Aeronave " + this.nomeAeronave + " pousou em segurança!");
	}
	
	
	
	
}
