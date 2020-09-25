package exercicio1;

import java.util.Scanner;

public class ImprimirCartaoVisita {
	public static void main(String[] args) {
		String nome="";
		String email="";
		String telefone="";
		
		//Instanciando a classe Pessoa
		//Criando o objeto cartaoPessoa
		
		Pessoa cartaopessoa = new Pessoa ("", "", "");
		
		//instanciado a classe Scanner
		
		Scanner scanner = new Scanner(System.in);
		
		//recebendo a digitação do usuário
		System.out.print("Informe o nome que ficará contido no cartão de visitas: ");
		nome = scanner.nextLine();
		cartaopessoa.setNome(nome);
		
		System.out.print("Informe o email que ficará contido no cartão de visitas: ");
		email = scanner.nextLine();
		cartaopessoa.setEmail(email);
		
		System.out.print("Informe o telefone que ficará contido no cartão de visitas: ");
		
		telefone = scanner.nextLine();
		cartaopessoa.setTelefone(telefone);
		
		//mostrando os resultados
		
		cartaopessoa.mostrarNomeEmailTelefone();
		
		scanner.close();
		
		
		
	}
}
