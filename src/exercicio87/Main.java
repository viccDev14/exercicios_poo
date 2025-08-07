package exercicio87;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();

		Scanner in = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o numero " + (i + 1) + ": ");
			numeros.add(in.nextInt());
		}

		for (int i = 0; i < numeros.size() - 1; i++) {
			for (int j = 0; j < numeros.size() - 1 - i; j++) {
				if (numeros.get(j) > numeros.get(j + 1)) {
					int temp = numeros.get(j);
					numeros.set(j, numeros.get(j + 1));
					numeros.set(j + 1, temp);
				}
			}
		}
		
		System.out.print("\nDigite mais um número para inserir ordenado: ");
        int novoNumero = in.nextInt();
	
		int posicao = 0;
		while (posicao < numeros.size() && novoNumero > numeros.get(posicao)) {
		    posicao++;
		}
		
		numeros.add(posicao, novoNumero);
		
		for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
		}
	}
}
