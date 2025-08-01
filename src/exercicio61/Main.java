package exercicio61;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int soma = 0;
		List<Integer> numeros = new ArrayList<>();
		
		for (int indice = 0; indice < 10; indice++) {
			System.out.print("Numero " + indice + ": ");
			numeros.add(in.nextInt());
		}
		
		for (int i = 0; i < 10; i++) {
			soma = soma + numeros.get(i);
		}
		
		System.out.println(soma);
		double media = (double) soma/10;
		System.out.printf("A media desses valores é: %.1f%n" , media);
	}
}
