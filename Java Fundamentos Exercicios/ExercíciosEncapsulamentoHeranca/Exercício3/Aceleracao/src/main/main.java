package main;

import model.Veiculo;

public class main {

	public static void main(String[] args) {

		Veiculo carro = new Veiculo();
		
		carro.setMarca("Fiat");
		carro.setCor("Branco");
		carro.setVelocidade(50);

		carro.acelerar();
		carro.fazerCurva();
		carro.freiar();
	}

}
