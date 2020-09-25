package exercicio2;

import java.util.Scanner;

public class CalculaIdade {
	public static void main(String[] args) {
		//Declaração de variáveis
		String nome="";
		int anoNasc=0;
		int anoAtual = 0;
		//Instanciando a classe Pessoa
		
		//Criando o objeto cartaoPessoa
		
		
		Pessoa idadepessoa = new Pessoa(nome, anoNasc, anoAtual);
		
		//instanciado a classe Scanner
		
		Scanner scanner = new Scanner(System.in);
		
		//recebendo os dados do usuário
		System.out.print("Digite seu nome: ");
		nome = scanner.nextLine();
		idadepessoa.setNome(nome);
		
		System.out.print("Digite seu ano de nascimento: ");
		anoNasc = scanner.nextInt();
		idadepessoa.setAnoNasc(anoNasc);
		
		System.out.print("Digite o ano em que estamos: ");
		anoAtual = scanner.nextInt();
		idadepessoa.setAnoAtual(anoAtual);
		
		//mostrando os resultados
		
		idadepessoa.mostrarIdade();
		idadepessoa.mostrarIdadeMais50anos();
		
		
		scanner.close();
		
		
	}
}
