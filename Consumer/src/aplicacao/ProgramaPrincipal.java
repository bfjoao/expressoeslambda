package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entidades.Produto;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		// Fazer uma programa que, a partir de uma lista de produtos, aumente o preço dos produtos em 10%.

		List<Produto> list = new ArrayList<>();

		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tabled", 350.50));
		list.add(new Produto("HD Case", 80.90));

		/* IMPLEMENTAÇÃO DA INTERFACE
		list.forEach(new PrecoAtualizado());     */
		
		/* REFERENCE METHOD COM MÉTODO ESTÁTICO
		list.forEach(Produto::staticPrecoAtualizado);
		
		/* REFERENCE METHOD COM MÉTODO NÃO ESTÁTICO
		list.forEach(Produto::staticPrecoAtualizado);     */
		
		/* EXPRESSÃO LAMBDA DECLARADA
		Consumer<Produto> cons = p -> {
			p.setPreco(p.getPreco() * 1.1);
		};     */
		
		// EXPRESSÃO LAMBDA INLINE
		list.forEach(p -> p.setPreco(p.getPreco() * 1.1));
		
		list.forEach(System.out::println);
	}

}
