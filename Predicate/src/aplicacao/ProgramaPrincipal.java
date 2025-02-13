package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entidades.Produto;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		// Fazer um programa que, a partir de uma lista de produtos, remova da lista somente aqueles cujo preço mínimo seja 100.

		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tabled", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		/** IMPLEMENTAÇÃO DA INTERFACE
		list.removeIf(new ProdutoPredicate());     */
		
		/** REFERENCE METHOD COM MÉTODO ESTÁTICO
		list.removeIf(Produto::staticProdutoPredicate);     */
		
		/** REFEREMCE METHOD COM MÉTODO NÃO ESTÁTICO
		list.removeIf(Produto::noStaticProdutoPredicate);     */
		
		/** EXPRESSÃO LAMBDA DECLARADA
		Predicate<Produto> pred = p -> p.getPreco() >= 100.0;
		list.removeIf(pred);     */
		
		// EXPRESSÃO LAMBDA INLINE
		list.removeIf(p -> p.getPreco() >= 100.0);
		
		for (Produto p : list) {
			System.out.println(p);
		}
	}

}
