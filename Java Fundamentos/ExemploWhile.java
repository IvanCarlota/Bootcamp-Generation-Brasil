package JavaTeste;

import java.util.Scanner;

public class ExemploWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o n�mero inicial: ");
		int numeroInicial = entrada.nextInt();
		System.out.println("Digite o n�mero final");
		int numerdoFinal = entrada.nextInt();
		int numertoAtual = numeroInicial;
		
		
		
		while(numertoAtual <= numerdoFinal) {
			System.out.println(numertoAtual);
			numertoAtual++;
		}
		
		System.out.println("O n�mero atual e menor que o n�mero final");
		
		entrada.close();
	}
}
