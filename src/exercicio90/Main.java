package exercicio90;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Integer> vetor = new ArrayList<>();

		for (int i = 0; i < 30; i++) {
			System.out.print("Numero " + i + ": ");
			vetor.add(in.nextInt());
		}

		System.out.print("\nDigite mais um número: ");
		int num = in.nextInt();
		int numeroMesmaPosicao = 0;
		for (int j = 0; j < vetor.size(); j++) {
			if (vetor.get(j).equals(num)) {
				
				numeroMesmaPosicao++;
			}
		}
		
		System.out.println("Vezes que o numero " + num + " aparece no vetor: " + numeroMesmaPosicao);
	}
}
