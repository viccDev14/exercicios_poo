package exercicio35;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Vendas v = new Vendas();

		System.out.print("Informe o tipo de combustível (A para Álcool, G para Gasolina): ");
		v.setTipo(in.next());

		System.out.print("Informe a quantidade de litros: ");
		v.setLitros(in.nextDouble());

		v.imprimirResumo();

	}

}
