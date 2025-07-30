package exercicio11;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Carro vendedor = new Carro();

		System.out.print("Digite o numero de carros vendidos: ");
		vendedor.setVendidos(in.nextInt());
		System.out.print("Digite o valor total das vendas: R$ ");
		vendedor.setTotalVendas(in.nextDouble());
		System.out.print("Digite o salario fixo: R$ ");
		vendedor.setSalarioFixo(in.nextDouble());
		System.out.print("Digite o valor da comissao por carro vendido: R$ ");
		vendedor.setComissaoPorCarro(in.nextDouble());
		
		System.out.printf("O salario final do vendedor é: R$ %.2f%n", vendedor.calcularSalarioFinal() );
		
	}

}
