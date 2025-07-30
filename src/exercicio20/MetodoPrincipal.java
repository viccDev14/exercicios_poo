package exercicio20;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		OrdemCrescente ordenar = new OrdemCrescente();
		
		System.out.print("Digite o primeiro número: ");
        ordenar.setNumero1(in.nextInt());

        System.out.print("Digite o segundo número (diferente do primeiro): ");
        ordenar.setNumero2(in.nextInt());

        ordenar.ordem();
	}

}
