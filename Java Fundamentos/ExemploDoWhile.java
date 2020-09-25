package JavaTeste;

import java.util.Scanner;

public class ExemploDoWhile {
	public static void main(String[] args) {
		// Looping do-while 
		
		Scanner in = new Scanner(System.in);
		int x = 0 ; //onde vamos armazenar a operação desejada
		double num1, num2, resultado = 0;
		
		do {
			System.out.println("1) somar ");
			System.out.println("2) subtrair ");
			System.out.println("3) multiplicar ");
			System.out.println("4) dividir ");
			System.out.println("0) sair ");
			
			System.out.println("Digite o código da opeação desejada: ");
			x = in.nextInt();
			
			if ( x != 0 ) {
				System.out.println("Digite o primeiro número: ");
				num1 = in.nextDouble();
				
				System.out.println("Digite o segundo número: ");
				num2 = in.nextDouble();
				
			switch (x) {
				
			case 1:
				resultado = num1 + num2;
				break;
			case 2: 
				resultado = num1 - num2;
				break;
			case 3: 
				resultado = num1 * num2;
				break;
			case 4:	
				resultado = num1 / num2;
				break;
				
			}
			System.out.println();
			System.out.println("o resultado é: " + resultado);
			System.out.println();
			}
		}while ( x != 0);
		
		in.close();
	}	
}
