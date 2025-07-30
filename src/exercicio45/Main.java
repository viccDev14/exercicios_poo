package exercicio45;

import java.util.Scanner;

//Classe principal
public class Main {

	public static void main(String[] args) {

		// Leitor de dados, ja instanciado
		Scanner in = new Scanner(System.in);

		// Objeto valor instanciado
		Valor valor = new Valor();

		// Entrada de dados
		System.out.print("Digite o 1° valor: ");
		valor.setValor1(in.nextInt());
		System.out.print("Digite o 2° valor: ");
		valor.setValor2(in.nextInt());

		// Estrutura enquanto
		while (valor.getValor2() == 0) {
			System.out.print("Digite o 2° valor: ");
			valor.setValor2(in.nextInt());
		}

		// Exibe o resultado
		System.out.println(valor.verificar());
	}

}