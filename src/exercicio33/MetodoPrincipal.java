package exercicio33;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		Valores valor = new Valores();
		
		System.out.print("Digite o primeiro valor: ");
		valor.setValor1(in.nextInt());
		System.out.print("Digite o segundo valor: ");
		valor.setValor2(in.nextInt());
		
		valor.verificar();
	}

}
