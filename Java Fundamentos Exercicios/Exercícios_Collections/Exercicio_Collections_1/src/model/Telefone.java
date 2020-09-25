package model;

public class Telefone {
	private String nrTelefone;
	private int tipoTelefone;
	
	public String getNrTelefone() {
		return nrTelefone;
	}
	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}
	public int getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(int tipoTelefone) {
		
		if (tipoTelefone == 0) {
			System.out.println("Telefone Residêncial");
		}else if (tipoTelefone ==1) {
			System.out.println("Tefone Comercial");
		}else if(tipoTelefone ==2){
			System.out.println("Telefone Celular");
		}
		
		this.tipoTelefone = tipoTelefone;
	}
	
}
