package model;

public class Caminhao extends Veiculo {
	private double cargaMax;
	private int alturaMax;
	private int comprimento;
	
	public double getCargaMax() {
		return cargaMax;
	}
	public void setCargaMax(double cargaMax) {
		this.cargaMax = cargaMax;
	}
	public int getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	//Construtor
	public Caminhao(double cargaMax, int alturaMax, int comprimento) {
		cargaMax = (double) 0;
		alturaMax = (int) 0;
		comprimento = (int) 0;
	}
	// Outro metodos
	public void entrCam(){
		System.out.println("\n----------------Caminhão----------------\n");
		System.out.print("Por gentileza digite o valor da carga máxima do cam em kg: ");
		this.cargaMax = entrada.nextDouble();
		System.out.print("Por gentileza digite o valor da altura máxima em metros: ");
		this.alturaMax = entrada.nextInt();
		System.out.print("Por gentileza digite o valor do comprimento em metros: ");
		this.comprimento = entrada.nextInt();
		this.entrVeic();
	}
	public void mostrCam() {
		System.out.printf("Carga máxima: %.2fkg", cargaMax);
		System.out.println("\nAltura máxima: "+alturaMax+"m");
		System.out.print("Comprimento: "+comprimento+" metros\n");
		this.mostrVeic();
	}
}
