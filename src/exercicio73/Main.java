package exercicio73;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double somaSalarios = 0;
		int somaFilhos = 0;
		int totalHabitantes = 0;
		int salarioBaixo = 0;
		double maiorSalario = 0;
		double salario;
		while (true) {
			System.out.print("Digite o salario do habitante: ");
			salario = in.nextDouble();

			if (salario < 0) {
				break;

			}
			System.out.print("Digite a quantidade de filhos: ");
			int filhos = in.nextInt();

			somaSalarios += salario;
			somaFilhos += filhos;
			totalHabitantes++;

			if (salario > maiorSalario) {
				maiorSalario = salario;
			}

			if (salario < 150.0) {
				salarioBaixo++;
			}
		}

		if (totalHabitantes > 0) {
			double mediaSalario = somaSalarios / totalHabitantes;
			double mediaFilhos = (double) somaFilhos / totalHabitantes;
			double percentualSalarioBaixo = (salarioBaixo * 100.0) / totalHabitantes;

			System.out.printf("\nMédia de salário da população: R$ %.2f\n", mediaSalario);
			System.out.printf("Média do número de filhos: %.2f\n", mediaFilhos);
			System.out.printf("Maior salário dos habitantes: R$ %.2f\n", maiorSalario);
			System.out.printf("Percentual de pessoas com salário menor que R$ 150,00: %.2f%%\n",
					percentualSalarioBaixo);
		} else {
			System.out.println("Não é possivel prosseguir, não há dados.");

		}
	}
}
