package exercicio.exercicio30;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Ordenador ordenador = new Ordenador();

        System.out.print("Digite o primeiro valor: ");
        ordenador.setValor1(in.nextInt());

        System.out.print("Digite o segundo valor: ");
        ordenador.setValor2(in.nextInt());

        System.out.print("Digite o terceiro valor: ");
        ordenador.setValor3(in.nextInt());

        System.out.println();
        ordenador.exibirOrdem();

	}

}
