package exercicio79;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<Float> notas = new ArrayList<>();
		
		int acimaMedia = 0;
		float soma = 0;
		
		for (int indice = 0; indice < 20; indice++) {
			System.out.print("Digite a nota do aluno " + indice + ": ");
			notas.add(in.nextFloat());
			soma += notas.get(indice);
		}

		float media = soma / 20;

		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i) > media) {
				acimaMedia++;
			}
		}
		
		System.out.printf("Media da turma: %.1f\n" , media);
		System.out.println("Resultado da contagem: " + acimaMedia);
	}
}
