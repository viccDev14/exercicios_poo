package exercicio82;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<Integer> A = new ArrayList<>();
		List<Integer> M = new ArrayList<>();
		
		for (int indice = 0; indice < 3; indice++) {
			System.out.print("Digite o numero " + indice + ": ");
			A.add(in.nextInt());
		}
		
		System.out.print("Digite mais um numero: ");
		int X = in.nextInt();
		
		for (int i = 0; i < 3; i++) {
			int multiplicar = A.get(i) * X;
			M.add(multiplicar);
			System.out.println(M.get(i));
		}
	}
}
