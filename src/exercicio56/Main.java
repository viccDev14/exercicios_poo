package exercicio.exercicio56;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Tabuada tabuada = new Tabuada();

		System.out.print("Digite um valor: ");
		tabuada.setNumero(in.nextInt());

		tabuada.imprimirTabuada();
	}
}
