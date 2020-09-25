package ExerciciosJava;

public class Exercicio1 {
	public static void main(String[] args) {
		
		/* 1- Desenvolver um sistema que efetue a soma de todos os números ímpares
		que são múltiplos de três e que se encontram no conjunto dos números de 1
		até 500. */
		
		// Declaração de variáveis de ambiente
		
		int i, somaImpar = 0, cont=0;
		
		// Início do laço for
			for(i = 0; i < 500; i+=3) {
				
				if ( i%2==0 ) {}
				// se i for par não faça nada
				else{
					// se i for impar e divisível por 3 atribui mais 1 ao contador e mais ao somaImpar
					cont+=1;
					somaImpar+=i;	
				}
			}
			//Exibe uma mensagem com a somatória dos números impares
			
			System.out.println("A soma dos "+cont+" números multiplos de 3 é: " + somaImpar);
			
	}
}