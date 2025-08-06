package exercicio80;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<Integer> numeros = new ArrayList<>();
		
		System.out.println("Digite 20 numeros");
		
		do {
			System.out.print("Numero: ");
			int valor = in.nextInt();
			if (valor >= 0) {
				numeros.add(valor);
			}
			
		} while (numeros.size() < 20);
		
		int maior = numeros.get(0);
		int posicao = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) > maior) {
				maior = numeros.get(i);
				posicao = i;
			}
		}
		
		System.out.println("Maior elemento: " + maior);
		System.out.println("Posiao: " + posicao);
	}
}
