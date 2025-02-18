package aplicacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		// MULTIPLICA CADA ELEMENTO POR 10
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		// SOMA TODOS OS ELEMENTOS DO ARRAY
		int soma = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Soma = " + soma);
	
		// FILTER = PEGA SÓ OS NUMEROS PARES, MAP = MULTIPLICA CADA ELEMENTO POR 10
		List<Integer> novaLista = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
		System.out.println(Arrays.toString(novaLista.toArray()));
	}

}
