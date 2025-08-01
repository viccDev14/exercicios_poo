package exercicio60;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intervalo = 0;
		List<Integer> valores = new ArrayList<>();

		for (int indice = 0; indice < 10; indice++) {
			System.out.print("Numero " + indice + ": ");
			valores.add(in.nextInt());
		}

		for (int i = 0; i < 10; i++) {
			if (valores.get(i) >= 10 && valores.get(i) <= 20) {
				intervalo++;
			}
		}

		System.out.println("Valores dentro do intervalo [10,20]: " + intervalo);
		System.out.println("Valores fora do intervalo [10,20]: " + (valores.size() - intervalo));

	}
}
