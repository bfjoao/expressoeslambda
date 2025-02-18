package servicos.modelo;

import java.util.List;
import java.util.function.Predicate;

import entidades.Produto;

public class ServicoProduto {

	/*
	public double somaFiltrada(List<Produto> list) {
		double soma = 0.0;
		for (Produto p : list) {
			if(p.getNome().charAt(0) == 'T') {
				soma += p.getPreco();
			}
		}
		return soma;
	}     */
	
	public double somaFiltrada(List<Produto> list, Predicate<Produto> criterio) {
		double soma = 0.0;
		for(Produto p : list) {
			if(criterio.test(p)) {
				soma += p.getPreco();
			}
		}
		return soma;
	}
}
