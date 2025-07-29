package exercicio.exercicio23;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		PesoIdeal pessoa = new PesoIdeal();
		System.out.print("Digite seu nome: ");
		pessoa.setNome(in.next());
		System.out.print("Digite sua altura: ");
		pessoa.setAltura(in.nextDouble());
		System.out.print("Digite seu sexo (M)/(F): ");
		pessoa.setSexo(in.next());
		
		System.out.println("O seu peso ideal é " + pessoa.calcularPeso());
	}

}
