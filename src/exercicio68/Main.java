package exercicio68;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o numero total de mercadorias do mercado fox: ");
		int mercadorias = in.nextInt();
		
		System.out.print("Digite o valor por cada mercadoria do mercado fox: ");
		double valorPorMercadoria = in.nextDouble();
		
		double valorTot = valorPorMercadoria * mercadorias;
		System.out.println("Valor total em estoque: " + valorTot);
		
		double media = (valorPorMercadoria * mercadorias)/ mercadorias;
		System.out.println("Média de valor das mercadorias: " + media);
		
	}
}
