package exercicio62;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Float> notas = new ArrayList<>();

		Scanner in = new Scanner(System.in);

		float somaNotas = 0;
		System.out.print("Quantos alunos ha na turma? ");
		int alunos = in.nextInt();

		for (int indice = 0; indice < alunos; indice++) {
			System.out.print("Digite a nota do aluno numero " + (indice + 1) + ": ");
			notas.add(in.nextFloat());
		}

		for (int i = 0; i < alunos; i++) {
			somaNotas = somaNotas + notas.get(i);
		}
		
		System.out.println(somaNotas);
		float media = somaNotas/alunos;
		
		System.out.printf("A media das notas lidas é %.1f\n " , media);
	}
}
