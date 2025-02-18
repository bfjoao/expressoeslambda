package util;

import java.util.function.Function;

import entidades.Produto;

public class NomeMaiusculo implements Function<Produto, String> {

	@Override
	public String apply(Produto p) {
		// TODO Auto-generated method stub
		return p.getNome().toUpperCase();
	}

	
}
