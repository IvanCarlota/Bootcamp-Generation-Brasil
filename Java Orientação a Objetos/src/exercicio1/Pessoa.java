package exercicio1;

public class Pessoa {
		//Declaração de atributos
		private String nome;
		private String email;
		private String telefone;
		//fim dos atributos
		
		
		//método construtor - tem sempre o mesmo nome da classe
		
		public Pessoa(String nome, String email, String telefone) {
			this.nome = nome;
			this.email = email;
			this.telefone = telefone;
		}
		//fim do método construtor

		//getters e setters
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getTelefone() {
			return telefone;
		}


		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		//fim dos getters e setters
		
		//outros métodos da classe Pessoa
		public void mostrarNome() {
			System.out.println("\n"+getNome());
		}
		
		public void mostrarEmail() {
			System.out.println("\n"+getEmail());
		}
		
		public void mostrarTelefone() {
			System.out.println("telefone: "+getTelefone());
		}
		
		public void mostrarNomeEmailTelefone() {
			System.out.println("\n"+getNome()+
					"\n"+getEmail()+
					"\ntelefone: "+getTelefone());
		}
		
}
