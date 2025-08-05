package exercicio72;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double soma = 0;
		double maiorPreco = 0;

		for (int i = 0; i < 15; i++) {
			System.out.print("Digite o codigo: ");
			int codigo = in.nextInt();
			System.out.print("Digite o preço do produto " + codigo + ": ");
			double preco = in.nextDouble();

			soma+= preco;
			
			if (i == 1 || preco > maiorPreco) {
				maiorPreco = preco;
			}
		}
		double media = soma/15;
		
		System.out.println("Maior preço lido: " + maiorPreco);
		System.out.println("Média aritmética dos preços dos produtos: " + media);
	}
}
