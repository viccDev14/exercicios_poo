package exercicio15;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		PositivoNegativo pn = new PositivoNegativo();
		System.out.print("Digite um valor inteiro: ");
		pn.setValor(in.nextInt());
		System.out.println(pn.positivoNegativo());
	}

}
