package model;

public class Cavalo extends Animal{
	
	public boolean correr;
	
	
	public boolean isCorrer() {
		return correr;
	}
	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	
	@Override
	public void emitirSom() {
		System.out.println("O cavalo relinchou !!!");
		
	}
	
}
