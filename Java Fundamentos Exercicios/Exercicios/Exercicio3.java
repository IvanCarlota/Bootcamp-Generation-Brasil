package ExerciciosJava;

public class Exercicio3 {
	public static void main(String[] args) {
		/* 3- Faça um
		programa que mostre uma contagem na tela de 233 a 456, só que contando de
		3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver. */
		
		// Declaração de variáveis de ambiente
		int i;
		
		// Início do laço for
		for (i = 233; i < 457; i++) {
			
			//Imprime os números menores que 300
			if (i < 300) {
				System.out.println(i);
			}
			//Imprime os números entre 300 e 400
			else if(i>=300 && i<=400 ) {
				i+=2;
				System.out.println("Números impressos de 3 em 3:  "+i);
			
			//Imprime os números maiores que 400	
			}else {
				i+=4;
				System.out.println("Números impressos de 5 em 5:  "+i);
				
			}
			
				
		}
		// Fim do laço for
	}
}
