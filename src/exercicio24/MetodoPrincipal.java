package exercicio24;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Salario salario = new Salario();
		System.out.print("Digite o valor de seu salario: ");
		salario.setSalarioFixo(in.nextDouble());
		System.out.print("Digite o valor total de vendas: ");
		salario.setValorVendasEfetuadas(in.nextDouble());
		
		
		System.out.println("O salario total do vendedor é: " + salario.calcularSalarioTot());
	}

}
