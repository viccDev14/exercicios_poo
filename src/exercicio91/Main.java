package exercicio91;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		List<Integer> vet = new ArrayList<>();
		

		for (int i = 0; i < 50; i++) {
			System.out.print("Digite o número " + i + ": ");
			vet.add(in.nextInt());
		}

		for (int i = 0; i < vet.size(); i++) {
			int numeroAtual = vet.get(i);
			boolean repetido = false;

			for (int j = 0; j < i; j++) {
				if (vet.get(j) == numeroAtual) {
					repetido = true;
					break;
				}
			}

			if (repetido) {
				continue;
			}
			List<Integer> posicoes = new ArrayList<>();
			for (int k = 0; k < vet.size(); k++) {
				if (vet.get(k) == numeroAtual) {
					posicoes.add(k);
				}
			}

			if (posicoes.size() > 1) {
				System.out.println("Número " + numeroAtual + " repetido nas posições: " + posicoes);
			}
		}

	}
}
