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
		
		//recebendo a digita��o do usu�rio
		System.out.print("Informe o nome que ficar� contido no cart�o de visitas: ");
		nome = scanner.nextLine();
		cartaopessoa.setNome(nome);
		
		System.out.print("Informe o email que ficar� contido no cart�o de visitas: ");
		email = scanner.nextLine();
		cartaopessoa.setEmail(email);
		
		System.out.print("Informe o telefone que ficar� contido no cart�o de visitas: ");
		
		telefone = scanner.nextLine();
		cartaopessoa.setTelefone(telefone);
		
		//mostrando os resultados
		
		cartaopessoa.mostrarNomeEmailTelefone();
		
		scanner.close();
		
		
		
	}
}
