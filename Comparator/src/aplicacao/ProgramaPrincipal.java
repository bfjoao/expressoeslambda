package aplicacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entidades.Produto;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Produto> list = new ArrayList<>();

		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 400.00));

		/**	  SEM EXPRESSÃO LAMBDA
		* Comparator<Produto> comp = new Comparator<Produto>() {
		*	@Override
		*	public int compare(Produto p1, Produto p2) {
		*		return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		*	}
		}; */
		
		/** EXPRESSÃO LAMBDA COM CHAVES
		* Comparator<Produto> comp = (p1, p2) -> {
			return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		}; */
		
		/** EXPRESSÃO LAMBDA SEM CHAVES
		 Comparator<Produto> comp = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()); */
		
		// EXPRESSÃO LAMBDA DIRETO NO ARGUMENTO
		list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

		for (Produto p : list) {
			System.out.println(p);
		}
	}

}
