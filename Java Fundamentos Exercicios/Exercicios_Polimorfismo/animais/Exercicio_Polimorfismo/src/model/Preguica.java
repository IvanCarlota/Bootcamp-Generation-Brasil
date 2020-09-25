package model;

public class Preguica extends Animal{

	public boolean subirArvore;
	
	
	public boolean isSubirArvore() {
		return subirArvore;
	}
	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	
	
	@Override
	public void emitirSom() {
		System.out.println("A preguiça bocejou !!!");
		
	}
	
	
}
