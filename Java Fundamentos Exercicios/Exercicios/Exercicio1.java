package ExerciciosJava;

public class Exercicio1 {
	public static void main(String[] args) {
		
		/* 1- Desenvolver um sistema que efetue a soma de todos os n�meros �mpares
		que s�o m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1
		at� 500. */
		
		// Declara��o de vari�veis de ambiente
		
		int i, somaImpar = 0, cont=0;
		
		// In�cio do la�o for
			for(i = 0; i < 500; i+=3) {
				
				if ( i%2==0 ) {}
				// se i for par n�o fa�a nada
				else{
					// se i for impar e divis�vel por 3 atribui mais 1 ao contador e mais ao somaImpar
					cont+=1;
					somaImpar+=i;	
				}
			}
			//Exibe uma mensagem com a somat�ria dos n�meros impares
			
			System.out.println("A soma dos "+cont+" n�meros multiplos de 3 �: " + somaImpar);
			
	}
}