package main;

import model.Cachorro;
import model.Cavalo;
import model.Preguica;
import model.Veterinario;

public class main {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		Veterinario veterinario = new Veterinario();
		
		cachorro.emitirSom();

		cavalo.emitirSom();

		preguica.emitirSom();

		
		veterinario.examinar(cachorro);
		veterinario.examinar(cavalo);
		veterinario.examinar(preguica);
	}

	
}
