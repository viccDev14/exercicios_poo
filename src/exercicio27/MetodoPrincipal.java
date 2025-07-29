package exercicio.exercicio27;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

		PositivoOuNegativo numero = new PositivoOuNegativo();

        System.out.print("Digite um número: ");
        numero.setValor(in.nextInt());

        System.out.println("O número é: " + numero.verificarSinal());

	}

}
