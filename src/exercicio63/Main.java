package exercicio63;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Numero " + i + ": ");
			numeros.add(in.nextInt());
		}
		int soma = 0;
		for (int i = 0; i < 10; i++) {
			soma+= numeros.get(i);
		}
		
		System.out.println(soma);
	}
}
