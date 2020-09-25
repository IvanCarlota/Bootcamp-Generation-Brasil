package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class main {

	public static void main(String[] args) {
		List<Integer> minhaLista = new ArrayList<Integer>(); //Instacia o Arraylist chamado minhalista 
		
		minhaLista.add(1); // adiciona o valor 1 no Array
		minhaLista.add(2); // adiciona o valor 2 no Array
		minhaLista.add(2); // adiciona o valor 2 no Array
		
		for (Integer listaElementos : minhaLista) { // listaElementos percorre o array de minhaLista e pega os indices do Array e lista.
			System.out.println(listaElementos); //imprime os valores da lista 
		}
		
		Set<Integer> meuSet = new HashSet<Integer>(); 
		//Instacia o HashSet meuSet e guarda todos os valores em um set;   
		
		
		meuSet.add(1); // adiciona o valor 1
		meuSet.add(2); // adiciona o valor 2
		meuSet.add(3); // adiciona o valor 3
		meuSet.add(1); // Colection set não aceita valores iguais, valor não exibido.
		
		
		Iterator<Integer> iMeuSet = meuSet.iterator(); 
		//Iteração os itens do meuSet em iMeuSet
		
		while(iMeuSet.hasNext()){ 
		// Percorre o iMeuSet
			
			System.out.println(iMeuSet.next()); 
		//Mostra na tela o próximo elemento do iMeuSet
			
		}

	}

}
