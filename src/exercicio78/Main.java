package exercicio78;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		List<String> nomes = new ArrayList<>();
		boolean nomeIgual = false;
		for (int indice = 0; indice < 10; indice++) {
			System.out.print("Digite o nome " + indice + ": ");
			nomes.add(in.next());

		}
		System.out.print("Digite mais um nome: ");
		String nome = in.next();

		for (int i = 0; i < nomes.size(); i++) {
			if (nomes.get(i).equals(nome)) {
				nomeIgual = true;
				break;
			}
		}
		
		if (nomeIgual) {
			System.out.println("Achei");
		} else {
			System.out.println("Nao achei");
		}
	}
}
