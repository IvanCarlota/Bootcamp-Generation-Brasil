package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Telefone;

public class main {

	public static void main(String[] args) {
		List<Telefone> minhaLista = new ArrayList<Telefone>();
		
		Telefone telefone1 = new Telefone();
		telefone1.setNrTelefone("3621-2020");
		telefone1.setTipoTelefone(0);
		Telefone telefone2 = new Telefone();
		telefone2.setNrTelefone("3621-2021");
		telefone2.setTipoTelefone(0);
		Telefone telefone3 = new Telefone();
		telefone3.setNrTelefone("3621-2022");
		telefone3.setTipoTelefone(0);
		Telefone telefone4 = new Telefone();
		telefone4.setNrTelefone("9999-5555");
		telefone4.setTipoTelefone(2);
		Telefone telefone5 = new Telefone();
		telefone5.setNrTelefone("4444-4444");
		telefone5.setTipoTelefone(1);
		
		minhaLista.add(telefone1);
		minhaLista.add(telefone2);
		minhaLista.add(telefone3);
		minhaLista.add(telefone4);
		minhaLista.add(telefone5);
	
		System.out.println("\n---------------------------------\n");
		
		Telefone telefone;
		Iterator<Telefone> iterator = minhaLista.iterator();
		while(iterator.hasNext()) {
			telefone = iterator.next();
			System.out.println("O número de telefone é: "+telefone.getNrTelefone() + " e o seu tipo é: " + telefone.getTipoTelefone());
		}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
