package exercicio83;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Integer> numeros = new ArrayList<>();

		for (int indice = 0; indice < 20; indice++) {
			System.out.print("Digite o numero " + indice + ": ");
			numeros.add(in.nextInt());
		}

		for (int i = numeros.size() -1; i >= 0; i--) {
			System.out.println(numeros.get(i));

		}
	}
}
