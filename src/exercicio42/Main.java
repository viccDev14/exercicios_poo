package exercicio42;

import java.util.Scanner;

//Classe Principal
public class Main {

	public static void main(String[] args) {
		// Objeto instanciado e nomeado in, que da entrada a dados
		Scanner in = new Scanner(System.in);

		// Entrada de dados
		Aposentadoria aposentadoria = new Aposentadoria();
		System.out.print("Digite o numero de empregado: ");
		aposentadoria.setCodigo(in.nextInt());
		System.out.print("Digite o ano de seu nascimento: ");
		aposentadoria.setAnoNasc(in.nextInt());
		System.out.print("Digite o ano de ingresso na empresa: ");
		aposentadoria.setAnoIngresso(in.nextInt());

		// Exibe as informações do objeto aposentadoria
		aposentadoria.exibição();

	}

}
