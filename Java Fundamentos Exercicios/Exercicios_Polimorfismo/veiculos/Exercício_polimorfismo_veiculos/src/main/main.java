package main;

import java.util.Scanner;

import model.Caminhao;
import model.CarroDePasseio;
import model.Veiculo;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		CarroDePasseio carro = new CarroDePasseio("" , "");
		Caminhao caminhao = new Caminhao(0, 0, 0);
		
		carro.EntrePass();
		System.out.println();
		carro.mostrPass();
		System.out.println("\n---------------------\n");
		caminhao.entrCam();
		System.out.println();
		caminhao.mostrVeic();

	}

}
