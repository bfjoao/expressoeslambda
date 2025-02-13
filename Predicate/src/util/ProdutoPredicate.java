package util;

import java.util.function.Predicate;

import entidades.Produto;

public class ProdutoPredicate implements Predicate<Produto> {

	@Override
	public boolean test(Produto p) {
		// TODO Auto-generated method stub
		return p.getPreco() >= 100.0;
	}

}
