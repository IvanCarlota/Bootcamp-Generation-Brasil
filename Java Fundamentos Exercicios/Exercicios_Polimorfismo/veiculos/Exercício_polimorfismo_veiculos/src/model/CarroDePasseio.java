package model;

public class CarroDePasseio extends Veiculo{
	private String cor;
	private String modelo;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//Construtor
	public CarroDePasseio(String cor, String modelo) {
		cor = (String)"nenhuma";
		modelo = (String)"nenhum";
	}
	
	
	//Outros métodos
	public void EntrePass() {
		System.out.println("\n---------Carro de passeio---------\n");
		System.out.print("Digite a cor do Carro: ");
		this.cor = entrada.nextLine();
		System.out.print("Digite o modelo do Carro: ");
		this.modelo = entrada.nextLine();
		this.entrVeic();
	}
	
	public void mostrPass() {
		System.out.println("Cor: "+ this.getCor());
		System.out.println("Modelo: "+ this.getModelo());
		this.mostrVeic();
	}
	
	
}
