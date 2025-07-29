package exercicio.exercicio8;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Eleitores eleitores = new Eleitores();

		System.out.print("Digite o total de eleitores: ");
        eleitores.setTotEleitores(in.nextInt());
		System.out.print("Digite o numero de votos brancos: ");
		eleitores.setBrancos(in.nextInt());
		System.out.print("Digite o numero de votos nulos: ");
		eleitores.setNulos(in.nextInt());
		System.out.print("Digite o numero de votos validos: ");
		eleitores.setValidos(in.nextInt());
		
	    System.out.printf("Percentual de votos brancos: %.2f%%\n", eleitores.percentualBrancos());
        System.out.printf("Percentual de votos nulos: %.2f%%\n", eleitores.percentualNulos());
        System.out.printf("Percentual de votos válidos: %.2f%%\n", eleitores.percentualValidos());
		
		
		
	}

}
