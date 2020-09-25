package exercicio2;

public class Pessoa {
			//Declara��o de atributos
			private String nome;
			private int anoNasc;
			private int anoAtual;
			//fim dos atributos
			
			//m�todo construtor - tem sempre o mesmo nome da classe
			public Pessoa(String nome, int anoNasc, int anoAtual) {
				this.nome = nome;
				this.anoNasc = anoNasc;
				this.anoAtual= anoAtual;
			}
			//fim do m�todo construtor

			
			//getters e setters
			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public int getAnoNasc() {
				return anoNasc;
			}

			public void setAnoNasc(int anoNasc) {
				this.anoNasc = anoNasc;
			}
			
			public int getAnoAtual() {
				return anoAtual;
			}
			
			public void setAnoAtual(int anoAtual) {
				this.anoAtual = anoAtual;
			}
			
			
			//fim dos getters e setters
			
			
			//outros m�todos da classe Pessoa
			
			public void mostrarnome() {
				System.out.println("\n"+getNome());
			}
			
			public void mostrarIdade() {
				int mostrarIdade = getAnoAtual() - getAnoNasc() ;
				System.out.print("\nSua idade hoje �: "+mostrarIdade+" anos\n");
			}
			
			
			public void mostrarIdadeMais50anos() {
				int mostrarIdadeMais50anos = (getAnoAtual() - getAnoNasc())+50;
				System.out.print("Sua idade daqui h� 50 anos ser�: "+mostrarIdadeMais50anos+" anos\n");
			}
			
			
			
			
}
