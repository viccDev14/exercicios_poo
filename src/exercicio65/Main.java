package exercicio65;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Digite o 1° valor: ");
		int valor = in.nextInt();

		int valor2;
		do {
			System.out.print("Digite o 2° valor: ");
			valor2 = in.nextInt();

		} while (valor2 < valor);

		int soma = 0;

		for (int i = valor; i <= valor2; i++) {
			soma += i;
		}

		System.out.println(soma);

	}

}
