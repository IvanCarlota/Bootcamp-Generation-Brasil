package model;

public class Cachorro extends Animal{
	
	public boolean correr;
	
	
	public boolean isCorrer() {
		return correr;
	}
	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro latiu !!!");
		
	}
	
}
