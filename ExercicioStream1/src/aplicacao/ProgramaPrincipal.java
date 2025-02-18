package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades.Produto;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Fazer um programa para ler um conjunto de produto a partir de um arquivo em formato .csv(suponha que existe pelo menos um produto).
		   Em seguida mostrar o preço médio dos produtos. Depois, mostrar os nomes, em ordem decrescente, dos produtos que possuem preço inferior ao preço médio.    */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o caminho do arquivo: ");
		String pasta = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(pasta))) {
			List <Produto> list = new ArrayList<>();
			
			String linha = br.readLine();
			while (linha != null) {
				String [] campos = linha.split(",");
				list.add(new Produto(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}
			
			// MAP = pega só o preço dos produtos
			// REDUCE = faz a soma dos produtos e divide pelo tamanho da lista
			double media = list.stream()
					.map(p -> p.getPreco())
					.reduce(0.0, (x,y) -> x + y) / list.size();
			System.out.println("Preço médio: " + String.format("%.2f", media));
			
			// COMPARATOR para ordem alfabética
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s1.toUpperCase());
			
			// FILTER = filtra todos produtos abaixo da média
			// MAP = pega só o nome de cada produto
			// SORTED = faz o comparator reverso (ordem decrescente)
			List<String> nomes = list.stream()
					.filter(p -> p.getPreco() < media)
					.map(p -> p.getNome())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			
			nomes.forEach(System.out::println);

			
			
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
