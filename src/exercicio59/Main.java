package exercicio59;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int numerosNegativos = 0;
		ArrayList<Integer> numeros = new ArrayList<>();
		for (int indice = 0; indice < 10; indice++) {
			System.out.print("Valor " + indice + ": ");
			numeros.add(in.nextInt());

		}

		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) < 0) {
				numerosNegativos++;
			}
		}
		System.out.println(numerosNegativos + " são negativos. ");
	}
}
