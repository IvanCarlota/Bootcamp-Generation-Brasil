package model;


public class Veterinario{
	
	public void examinar(Cachorro cachorro) {
		System.out.println("\n--------------------------------------------------\n");
		System.out.println("O cachorro esta sendo examinado pelo veterin�rio!!!");
		cachorro.emitirSom();
	}
	
	public void examinar(Cavalo cavalo) {
		System.out.println("\n--------------------------------------------------\n");
		System.out.println("O cavalo esta sendo examinado pelo veterin�rio !!!");
		cavalo.emitirSom();
	}
	
	public void examinar(Preguica preguica) {
		System.out.println("\n--------------------------------------------------\n");
		System.out.println("A pregui�a esta sendo examinada pelo veterin�rio !!!");
		preguica.emitirSom();
	}

	
}
