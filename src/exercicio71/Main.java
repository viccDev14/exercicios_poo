package exercicio71;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> valores = new ArrayList<>();

		int soma = 0;
		System.out.print("Digite um valor: ");
		int valor = in.nextInt();

		for (int indice = 0; indice < valor; indice++) {
			System.out.print("Numero " + indice + ": ");
			valores.add(in.nextInt());
			soma+= valores.get(indice);
		}
		
		int maior = valores.get(0);
		
		for (int i = 1; i < valores.size(); i++) {
			int valorVerificar = valores.get(i);
			if (valorVerificar > maior) {
				maior = valorVerificar;
			}
		}
		
		int media = soma/valor;
		
		System.out.println("Maior dos números lidos: " + maior);
		System.out.println("Média dos números lidos: " + media);
	}
}
