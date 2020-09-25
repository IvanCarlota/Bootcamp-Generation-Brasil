package ExerciciosJava;

public class Exercicio2 {
	public static void main(String[] args) {
		
		 /*2- Escreva um sistema estruturado que gere os números de 1000 a
		 1999 e escreva
		 somente os números que são divisíveis por 11 ou cujo resto é 5. */
		
		
		// Declaração de variáveis de ambiente
		
				int i;
				
				// Início do laço for
				for(i = 1000; i < 1999; i++) {
					
					//Se for divisível por 11 OU se o resto da divisão por 11 for 5
					if ( i%11==0 || i%11==5 ) {
						
					//mostra na tela os números	
					System.out.println(i);
					}
				}
				// Fim do laço for
	}
}
