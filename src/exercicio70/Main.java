package exercicio70;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Integer> valores = new ArrayList<>();

		for (int indice = 0; indice < 5; indice++) {
			System.out.print("Numero " + indice + ": ");
			valores.add(in.nextInt());
		}

		int maior = valores.get(0);
		int menor = valores.get(0);

		for (int i = 1; i < valores.size(); i++) {
			int valor = valores.get(i);
			if (valor > maior) {
				maior = valor;
			}
			if (valor < menor) {
				menor = valor;
			}
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
	}
}
