package JavaTeste;

import java.util.Scanner;

public class EntradaSaidaJava {
	public static void main(String[] args) {
		System.out.println("Entre com a idade do seu cachorro: ");
		Scanner in = new Scanner(System.in);
		int idadecachorro = in.nextInt();
		idadecachorro = idadecachorro * 7;
		System.out.println("Meu cachorro tem: " + idadecachorro + " ano(s) de vida...");
		
		in.close();
	}
}
