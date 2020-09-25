package main;

public class Aula {
	private String titulo;
	private int tempo;
	
	//Construtor
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	//Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}
}
