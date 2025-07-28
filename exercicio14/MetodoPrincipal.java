package exercicio.exercicio14;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		OperadoresRelacionais or = new OperadoresRelacionais();
		
		System.out.print("Digite um valor inteiro: ");
		or.setValor(in.nextInt());
		System.out.println(or.maiorOuMenor());
	}

}
