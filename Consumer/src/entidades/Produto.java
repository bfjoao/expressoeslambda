package entidades;

public class Produto {

	private String nome;
	private Double preco;

	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public static void staticPrecoAtualizado(Produto p) {
		p.setPreco(p.getPreco() * 1.1);
	}
	
	public void noStaticPrecoAtualizado() {
		preco = preco * 1.1;
	}
	
	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", preco);
	}
}