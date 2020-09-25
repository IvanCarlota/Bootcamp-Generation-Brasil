package main;

import veiculo.Carro;
import veiculo.Moto;

public class main {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setMarca("Fiat");
		carro.setCor("Branco");
		carro.setNumeroBancos("4");
		carro.setNumeroPortas("4");
		carro.setTemArCondicionado(true);
		carro.setTemCameraTraseira(true);
		carro.setTemDirecaohidraulica(true);
		carro.setTemVidroEletrico(true);
		carro.setAnoFabricação("2013");
		
		carro.ligarVeiculo();
		carro.corVeiculo();
		carro.desligarVeiculo();
		carro.mostraNumeroPortas();
		carro.mostraNumeroBancos();
		
		System.out.println("\n--------------------------------------------------------------------\n");
		
		Moto moto = new Moto();
		
		moto.setAnoFabricação("2019");
		moto.setCor("Preta");
		moto.setCilindrada("150");
		moto.setMarca("CG");
		
		moto.ligarVeiculo();
		moto.mostracilindrada();
		moto.mostraPezinho();
		moto.desligarVeiculo();

	}

}
