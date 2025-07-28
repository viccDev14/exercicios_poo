package exercicio.exercicio54;

import java.util.Scanner;

import exercicio.exercicio53.Contador;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Contador numeros = new Contador();

		// Entrada de dados
		System.out.print("Digite um valor maior que 0: ");
		numeros.setValorN(in.nextInt());

		// Garante que N seja maior que zero
		while (numeros.getValorN() == 0) {
			System.out.println("O valor deve ser maior que zero.");
			System.out.print("Digite um valor maior que 0: ");
			numeros.setValorN(in.nextInt());
		}
		numeros.setValorN(numeros.getValorN());
		numeros.imprimir();
	}
}
