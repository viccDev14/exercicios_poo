package exercicio.exercicio48;

import java.util.Scanner;

//Classe principal
public class Main {

	public static void main(String[] args) {

		// Leitor de dados
		Scanner in = new Scanner(System.in);

		// Objeto instanciado nomeado notas
		Notas notas = new Notas();

		// Entrada de dados
		System.out.print("Digite a nota da 1° avaliação de (0 a 10): ");
		notas.setNota1(in.nextDouble());

		// Estrutura de repetiçao
		while (notas.getNota1() < 0 || notas.getNota1() > 10) {
			System.out.print("Digite novamente a nota da 1° avaliação de (0 a 10): ");
			notas.setNota1(in.nextDouble());
		}

		// Entrada de dados
		System.out.print("Digite a nota da 2° avaliação de (0 a 10): ");
		notas.setNota2(in.nextDouble());

		// Estrutura de repetiçao
		while (notas.getNota2() < 0 || notas.getNota2() > 10) {
			System.out.print("Digite novamente a nota da 2° avaliação de (0 a 10): ");
			notas.setNota2(in.nextDouble());
		}

		// Exibe o resultado da media
		System.out.println(notas.mediaSimples());
	}
}
