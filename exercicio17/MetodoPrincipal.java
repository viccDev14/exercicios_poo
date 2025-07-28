package exercicio.exercicio17;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Notas n1 = new Notas();
		System.out.print("Digite a nota da 1° avaliação: ");
		n1.setAvaliaçao1(in.nextDouble());
		System.out.print("Digite a nota da 2° avaliação: ");
		n1.setAvaliaçao2(in.nextDouble());

		System.out.println("A media do aluno: " + n1.getMedia());
		System.out.println(n1.calcularMedia());

	}

}
