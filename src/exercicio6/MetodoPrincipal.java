package exercicio6;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("=========== DIMENSOES RETANGULO ============");
		System.out.print("Digite a base do retangulo: ");
		retangulo.setBase(in.nextDouble());
		System.out.print("Digite a altura do retangulo: ");
		retangulo.setAltura(in.nextDouble());
		
		double area = retangulo.calcular();
		
		System.out.println("A área do retângulo é: " + area);
		
		
		
		

	}

}
