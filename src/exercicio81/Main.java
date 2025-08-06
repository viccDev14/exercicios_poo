package exercicio81;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Integer> numeros = new ArrayList<>();

		System.out.println("Digite 20 valores");
		do {
			System.out.print("Numero: ");
			int valor = in.nextInt();
			if (valor > 0) {
				numeros.add(valor);
			}
		} while (numeros.size() < 20);

		int menor = numeros.get(0);
		int posicao = 0;

		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) < menor) {
				menor = numeros.get(i);
				posicao = i;
			}
		}

		System.out.println("Maior elemento: " + menor);
		System.out.println("Posiao: " + posicao);

	}
}
