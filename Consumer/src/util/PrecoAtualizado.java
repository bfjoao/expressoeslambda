package util;

import java.util.function.Consumer;

import entidades.Produto;

public class PrecoAtualizado implements Consumer<Produto> {

	@Override
	public void accept(Produto p) {
		p.setPreco(p.getPreco() * 1.1);
		
	}

}
