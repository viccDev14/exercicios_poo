package exercicio.exercicio12;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Temperatura t1 = new Temperatura();
		System.out.print("Quantos graus Fahrenheit faz nos EUA? ");
		t1.setGrausFahrenheit(in.nextInt());
		System.out.printf("Em Celsius seria " + t1.calcularGraus() + " graus.");

	}

}
