package main;

import model.Eletrodomesticos;

public class main {

	public static void main(String[] args) {
		Eletrodomesticos eletrodomestico = new Eletrodomesticos();
		
		eletrodomestico.setLigado(true);
		eletrodomestico.setNomeDoEletro("Geladeira");
		eletrodomestico.setCor("Branco");
		eletrodomestico.setFormato("Retangular");
		
		eletrodomestico.ligarEletro();
		eletrodomestico.desligarEletro();

	}

}
