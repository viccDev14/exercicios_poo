package exercicio.exercicio28;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        Maior comparador = new Maior();

        System.out.print("Digite o primeiro valor: ");
        comparador.setNumero1(in.nextInt());

        System.out.print("Digite o segundo valor: ");
        comparador.setNumero2(in.nextInt());

        System.out.print("Digite o terceiro valor: ");
        comparador.setNumero3(in.nextInt());

    
        System.out.println("O maior valor é: " + comparador.maiorValor());

	}

}
