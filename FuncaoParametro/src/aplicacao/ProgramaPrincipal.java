package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;
import servicos.modelo.ServicoProduto;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fazer um programa que, a partir de uma lista de produtos, calcule a soma do preços somente dos produtos cujo nome começa com "T".
		
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		ServicoProduto ps = new ServicoProduto();
		
		double soma = ps.somaFiltrada(list, p -> p.getNome().charAt(0) == 'T');
		
		System.out.println("Soma: " + String.format("%.2f", soma));
	}
}
