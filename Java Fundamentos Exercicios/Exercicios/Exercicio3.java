package ExerciciosJava;

public class Exercicio3 {
	public static void main(String[] args) {
		/* 3- Fa�a um
		programa que mostre uma contagem na tela de 233 a 456, s� que contando de
		3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando n�o estiver. */
		
		// Declara��o de vari�veis de ambiente
		int i;
		
		// In�cio do la�o for
		for (i = 233; i < 457; i++) {
			
			//Imprime os n�meros menores que 300
			if (i < 300) {
				System.out.println(i);
			}
			//Imprime os n�meros entre 300 e 400
			else if(i>=300 && i<=400 ) {
				i+=2;
				System.out.println("N�meros impressos de 3 em 3:  "+i);
			
			//Imprime os n�meros maiores que 400	
			}else {
				i+=4;
				System.out.println("N�meros impressos de 5 em 5:  "+i);
				
			}
			
				
		}
		// Fim do la�o for
	}
}
