package main;

import java.util.List;
import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		//Instânciado as variáveis aula1, aula2 e aula3
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>(); 
		//Criado um Array de String para as aulas
		
		aulas.add(aula1); //adiciona o conteudo da variavel aula1 no Array de aulas
		aulas.add(aula2); //adiciona o conteudo da variavel aula2 no Array de aulas
		aulas.add(aula3); //adiciona o conteudo da variavel aula3 no Array de aulas
		
		System.out.println(aulas); 
		//Exibe a lista aulas 
		
		System.out.println(aulas.size()); 
		//Exibe o numero de itens da lista
		
		
		for (int i = 0; i < aulas.size(); i++) { 
		//Looping que percorre os indices da lista
			
			System.out.println("Aula: " + aulas.get(i)); 
			//Exibe a aula no indice que estiver dentro do looping e 
			//pula uma linha. faz isso durante as vezes que o looping percorrer o Array.
		}

	}

}
