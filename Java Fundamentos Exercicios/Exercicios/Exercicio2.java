package ExerciciosJava;

public class Exercicio2 {
	public static void main(String[] args) {
		
		 /*2- Escreva um sistema estruturado que gere os n�meros de 1000 a
		 1999 e escreva
		 somente os n�meros que s�o divis�veis por 11 ou cujo resto � 5. */
		
		
		// Declara��o de vari�veis de ambiente
		
				int i;
				
				// In�cio do la�o for
				for(i = 1000; i < 1999; i++) {
					
					//Se for divis�vel por 11 OU se o resto da divis�o por 11 for 5
					if ( i%11==0 || i%11==5 ) {
						
					//mostra na tela os n�meros	
					System.out.println(i);
					}
				}
				// Fim do la�o for
	}
}
