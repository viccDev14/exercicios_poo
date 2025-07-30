package exercicio36;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Pessoa[] homens = new Pessoa[2];
		Pessoa[] mulheres = new Pessoa[2];

		for (int i = 0; i < 2; i++) {
			System.out.print("Digite a idade do homem " + (i + 1) + ": ");
			Pessoa p = new Pessoa();
			p.setIdade(in.nextInt());
			homens[i] = p;
		}

		for (int i = 0; i < 2; i++) {
			System.out.print("Digite a idade da mulher " + (i + 1) + ": ");
			Pessoa p = new Pessoa();
			p.setIdade(in.nextInt());
			mulheres[i] = p;
		}

		Idades programa = new Idades(homens, mulheres);
		programa.calcularEImprimir();

	}

}
