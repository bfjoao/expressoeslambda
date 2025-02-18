package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entidades.Produto;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista contendo os nomes dos produtos em caixa alta.
		
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		/* IMPLEMENTAÇÃO DA INTERFACE
		List<String> nomes = list.stream().map(new NomeMaiusculo()).collect(Collectors.toList());     */
		
		/* REFERENCE METHOD  COM MÉTODO ESTÁTICO
		List <String> nomes = list.stream().map(Produto::staticNomeMaiusculo).collect(Collectors.toList());     */
		
		/* REFERENCE METHOD  COM MÉTODO NÃO ESTÁTICO
		List <String> nomes = list.stream().map(Produto::noStaticNomeMaiusculo).collect(Collectors.toList()); */
		
		/* EXPRESSÃO LAMBDA DECLARADA
		Function<Produto, String> func = p -> p.getNome().toUpperCase();     */
		
		// EXPRESSÃO LAMBDA INLINE
		List<String> nomes = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		
		nomes.forEach(System.out::println);
	}

}
