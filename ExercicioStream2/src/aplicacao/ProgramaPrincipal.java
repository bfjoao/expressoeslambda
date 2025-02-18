package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidade.Funcionario;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Fazer um programa para ler os dados (nome, email e salário) de funcionários a partir de um arquivo em formato .csv
		 * Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior a um dado valor fornecido pelo usuário.
		 * Mostrar também a soma dos salários dos funcionários cujonome começa com a letra 'M'.
		 */
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o caminho do arquivo: ");
		String pasta = sc.nextLine();
		
		System.out.print("Insira o salário: ");
		Double salario = sc.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(pasta))) {
			List<Funcionario> list = new ArrayList<>();

			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				list.add(new Funcionario(campos[0], campos[1], Double.parseDouble(campos[2])));
				linha = br.readLine();
			}

		// FILTER: pega todos os salários maiores que o valor informado
		// MAP: pega os emails
		// SORTED: ordena os emails alfabeticamente
			
		List<String> email = list.stream()
					.filter(x -> x.getSalario() > salario)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
		email.forEach(System.out::println);
		
		// FILTER: pega todos os nomes que começam com M.
		// MAP: pega o salário dos funcionários
		// REDUCE: soma os salários
		double somaSalario = list.stream()
				.filter(x -> x.getNome().startsWith("M"))
				.map(x -> x.getSalario())
				.reduce(0.0, (x,y) -> x + y);
		
		System.out.println("Soma dos salários de funcionários que começam com a letra 'M': " + String.format("%.2f", somaSalario));
		
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}