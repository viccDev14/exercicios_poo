package exercicio47;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println();
		Scanner in = new Scanner(System.in);
		Valor valor = new Valor();

		System.out.print("Digite o 1° valor: ");
		valor.setValor1(in.nextInt());
		System.out.print("Digite o 2° valor: ");
		valor.setValor2(in.nextInt());

		while (valor.getValor2() == 0) {
			System.out.println("VALOR INVALIDO");
			System.out.print("Digite o 2° valor: ");
			valor.setValor2(in.nextInt());

		}

		System.out.println(valor.divisao());
	}

}
