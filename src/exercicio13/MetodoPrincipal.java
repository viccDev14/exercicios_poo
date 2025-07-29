package exercicio13;

import java.util.Scanner;

public class MetodoPrincipal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		MediaFinal mf = new MediaFinal();
		
		System.out.print("Digite sua primeira nota: ");
		mf.setNota1(in.nextFloat());
		System.out.print("Digite sua segunda nota: ");
		mf.setNota2(in.nextFloat());
		System.out.print("Digite sua terceira nota: ");
		mf.setNota3(in.nextFloat());
		
		System.out.println("Sua media final é: " + mf.calcularMedia());
	}
}
