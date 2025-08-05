package exercicio69;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double soma = 0;
		double totMercadorias = 0;
		String maisMercadoria = "N";
		double custoMercadoria;
		do {
			totMercadorias++;
			System.out.print("Quanto custa a mercadoria? ");
			custoMercadoria = in.nextDouble();
			soma+= custoMercadoria;
			System.out.print("MAIS MERCADORIAS(S/N)? ");
			maisMercadoria = in.next();
		} while (maisMercadoria.equals("S"));

		double valorTot = (custoMercadoria * totMercadorias);
		double media = (custoMercadoria * totMercadorias)/totMercadorias;
		System.out.println("Valor total em estoque: " + valorTot);
		System.out.println("Média de valor das mercadorias em estoque: " + media);
		
	}
}
