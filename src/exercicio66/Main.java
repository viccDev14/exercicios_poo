package exercicio66;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int soma = 0;
		int inicio;
		int fim;

		Scanner in = new Scanner(System.in);

		System.out.print("Digite o 1° valor: ");
		int valor = in.nextInt();

		int valor2;
		do {
			System.out.print("Digite o 2° valor: ");
			valor2 = in.nextInt();

		} while (valor2 == valor);

		if (valor < valor2) {
			inicio = valor;
			fim = valor2;
		} else {
			inicio = valor2;
			fim = valor;
		}

		for (int i = inicio; i <= fim; i++) {
			soma += i;

		}
		System.out.println(soma);
	}
}
