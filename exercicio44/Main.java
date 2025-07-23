package exercicio.exercicio44;

import java.util.Scanner;

//Classe principal
public class Main {

	public static void main(String[] args) {

		// Leitor de dados, ja instanciado
		Scanner in = new Scanner(System.in);

		// Objeto repita instanciado
		Valor valor = new Valor();

		// Entrada de dados
		System.out.print("Digite o 1° valor: ");
		valor.setValor1(in.nextInt());

		// Estrutura de repetiçao
		do {
			System.out.print("Digite o 2° valor: ");
			valor.setValor2(in.nextInt());
		} while (valor.getValor2() == 0);

		//Exibe o resultado
		System.out.println(valor.divisao());
	}

}
