package exercicio19;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ObterMaior comparar = new ObterMaior();

		System.out.print("Digite o primeiro número: ");
        comparar.setNumero1(in.nextInt());

        System.out.print("Digite o segundo número (diferente do primeiro): ");
        comparar.setNumero2(in.nextInt());
        
        System.out.println(comparar.maior() + " é o numero maior.");
	}

}
