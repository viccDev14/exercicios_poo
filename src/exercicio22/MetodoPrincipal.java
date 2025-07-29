package exercicio22;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		JornadaTrabalho funcionario = new JornadaTrabalho();
		System.out.print("Digite o numero de horas trabalhadas no mes: ");
		funcionario.setHorasTrabalhadas(in.nextInt());
		System.out.print("Digite o valor do salario por hora: ");
		funcionario.setSalarioPorHora(in.nextDouble());
		
		System.out.println("O salario total do funcionario é: R$ " + funcionario.salarioTotal());
	}

}
