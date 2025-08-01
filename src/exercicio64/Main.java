package exercicio64;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int maiorQue40 = 0;
		
		for (int indice = 0; indice < 10; indice++) {
			System.out.print("Numero " + (indice + 1) + ": ");
			numeros.add(in.nextInt());
		}
		
		for (int i = 0; i < 10; i++) {
			if (numeros.get(i) < 40) {
				maiorQue40+= numeros.get(i);
			}
		}
		
		System.out.println(maiorQue40);
		
	}
}
