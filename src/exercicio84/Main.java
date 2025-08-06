package exercicio84;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Integer> A = new ArrayList<>();
		List<Integer> B = new ArrayList<>();
		List<Integer> Soma = new ArrayList<>();

		System.out.print("Digite um valor: ");
		int N = in.nextInt();

		System.out.println("Vetor A");
		for (int i = 0; i < N; i++) {
			System.out.print("Numero " + i + ": ");
			A.add(in.nextInt());
		}

		System.out.println("Vetor B");
		for (int j = 0; j < N; j++) {
			System.out.print("Numero " + j + ": ");
			B.add(in.nextInt());
		}

		for (int i = 0; i < N; i++) {
			Soma.add(A.get(i) + B.get(i));
		}
		
		System.out.println("Vetor Soma");
		for (int cc = 0; cc < N; cc++) {
			System.out.println(Soma.get(cc));
		}
	}
}
