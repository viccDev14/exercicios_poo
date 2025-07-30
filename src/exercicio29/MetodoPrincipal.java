package exercicio29;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Soma s1 = new Soma();
		
		System.out.print("Digite o primeiro valor: ");
		s1.setNumero1(in.nextInt());
		System.out.print("Digite o segundo valor: ");
		s1.setNumero2(in.nextInt());
		System.out.print("Digite o terceiro valor: ");
		s1.setNumero3(in.nextInt());
		
		
		System.out.println("A soma dos maiores valores é " + s1.somaMaiores());
	}

}
