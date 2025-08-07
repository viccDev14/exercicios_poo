package exercicio85;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		List<Integer> temperaturas = new ArrayList<>();

		Scanner in = new Scanner(System.in);

		double soma = 0;
		double menor = 0;
		double maior = 0;

		for (int i = 0; i < 365; i++) {
			System.out.print("Digite a temperatura média do dia " + (i + 1) + ": ");
			temperaturas.add(in.nextInt());

			soma += temperaturas.get(i);

			if (temperaturas.get(i) < menor) {
				menor = temperaturas.get(i);
			}
			if (temperaturas.get(i) > maior) {
				maior = temperaturas.get(i);
			}
		}

		double media = soma / temperaturas.size();

		int diasAbaixoDaMedia = 0;
		for (int i = 0; i < temperaturas.size(); i++) {
			if (temperaturas.get(i) < media) {
				diasAbaixoDaMedia++;
			}
		}

		System.out.printf("\nMenor temperatura do ano: %.2f°C\n", menor);
		System.out.printf("Maior temperatura do ano: %.2f°C\n", maior);
		System.out.printf("Temperatura média anual: %.2f°C\n", media);
		System.out.println("Número de dias com temperatura abaixo da média: " + diasAbaixoDaMedia);

	}
}
