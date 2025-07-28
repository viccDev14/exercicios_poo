package exercicio.exercicio16;

import java.util.Scanner;

public class MetodoPrincipal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Maças m = new Maças();
		
		System.out.print("Quantas maças irá comprar? ");
		m.setMaçasCompradas(in.nextInt());
		
		System.out.println("O custo total da compra: R$ " + m.custoTotal());
	}
}
