package model;

public abstract class Animal {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	// M�todos abstratos para uso em polimorfismo
	public abstract void emitirSom();
}
