package exercicio.exercicio53;

import java.util.Scanner;

//Classe principal
public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Contador numeros = new Contador();

		// Entrada de dados
		System.out.print("Digite um valor maior que 0: ");
		numeros.setValorN(in.nextInt());

		// Garante que N seja maior que zero
		if (numeros.getValorN() > 0) {
			numeros.setValorN(numeros.getValorN());
			numeros.imprimir();
		} else {
			System.out.println("O valor deve ser maior que zero.");
		}

	}
}
