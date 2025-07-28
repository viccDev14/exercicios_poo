package exercicio.exercicio18;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Votaçao v1 = new Votaçao();
		
		System.out.print("Digite o ano atual: ");
		v1.setAnoAtual(in.nextInt());
		System.out.print("Digite seu ano de nascimento: ");
		v1.setAnoNasc(in.nextInt());
		
		System.out.println(v1.calcularIdade());
	}

}
