package exercicio3;

import java.util.Scanner;

public class CaixaDeBanco {
	public static void main(String[] args) {
		int numeroAgencia=0;
		int numeroConta=0;
		float saldoConta=0;
		String operacao="";
		float valor=0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		ContaCorrente contacorrentepessoal = new ContaCorrente(numeroAgencia, numeroConta, saldoConta, operacao, valor);
		
		System.out.print("Informe o número de sua agência: ");
		numeroAgencia = scanner.nextInt();
		contacorrentepessoal.setNumeroAgencia(numeroAgencia);
		
		System.out.print("Informe o número de sua conta: ");
		numeroConta = scanner.nextInt();
		contacorrentepessoal.setNumeroConta(numeroConta);
		
		System.out.println("\nEste é o seu saldo Atual: "+contacorrentepessoal.getSaldoConta());
		
		
		System.out.println("\nDigite o valor do saque: ");
		valor = scanner.nextFloat();
		contacorrentepessoal.setValor(valor);
		contacorrentepessoal.depositar();
		
		System.out.println("\nDigite o valor do saque: ");
		valor = scanner.nextFloat();
		contacorrentepessoal.setValor(valor);
		contacorrentepessoal.sacar();
		
		
		System.out.println("\n\nAgência: " + numeroAgencia);
		System.out.println("Conta Corrente: " + numeroConta);
		System.out.println("Saldo em conta: "+ contacorrentepessoal.MostarSaldoAtual());
		
		scanner.close();
	}
}
