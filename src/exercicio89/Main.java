package exercicio89;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Integer> V1 = new ArrayList<>();
		List<Integer> V2 = new ArrayList<>();


		System.out.println("Vetor V1");
		for (int i = 0; i < 3; i++) {
			System.out.print("Numero " + i + ": ");
			V1.add(in.nextInt());
		}

		System.out.println("Vetor V2");
		for (int j = 0; j < 3; j++) {
			System.out.print("Numero " + j + ": ");
			V2.add(in.nextInt());
		}
		
		int numerosMesmaPosicao = 0;
		for (int i = 0; i < 3; i++) {
			if (V1.get(i).equals(V2.get(i))) {
				numerosMesmaPosicao++;
			}
		}
		
		System.out.println("\nQuantidade de números iguais na mesma posição: " + numerosMesmaPosicao);
	}
}
