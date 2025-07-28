package exercicio.exercicio31;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();

		System.out.print("Digite o lado A: ");
		triangulo.setLadoA(in.nextDouble());

		System.out.print("Digite o lado B: ");
		triangulo.setLadoB(in.nextDouble());

		System.out.print("Digite o lado C: ");
		triangulo.setLadoC(in.nextDouble());

		if (triangulo.verificar()) {
			System.out.println("Os lados formam um triângulo.");
		} else {
			System.out.println("Os lados NÃO formam um triângulo.");
		}

	}

}
