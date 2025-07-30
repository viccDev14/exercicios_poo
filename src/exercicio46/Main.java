package exercicio46;

import java.util.Scanner;

//Classe principal
public class Main {

	public static void main(String[] args) {

		// Leitor de dados
		Scanner in = new Scanner(System.in);

		// Objeto valor ja instanciado
		Valor valor = new Valor();

		// Entrada de dados
		System.out.print("Digite o 1° valor: ");
		valor.setValor1(in.nextInt());

		// Estrutura ded repetiçao com entrada de dados
		do {
			System.out.print("Digite o 2° valor: ");
			valor.setValor2(in.nextInt());
			if (valor.getValor2() == 0) {
				System.out.println("VALOR INVALIDO");
			}
		} while (valor.getValor2() == 0);

		// Exibe o resultado da divisao
		System.out.println(valor.divisao());
	}

}