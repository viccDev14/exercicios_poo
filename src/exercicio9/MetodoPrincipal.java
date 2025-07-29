package exercicio.exercicio9;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Salarios salario = new Salarios();
		
		System.out.print("Digite seu nome: ");
		salario.setNome(in.next());
		System.out.print("Digite o valor de seu salario atual: ");
		salario.setSalario(in.nextFloat());
		System.out.print("Digite o valor do reajuste: ");
		salario.setReajuste(in.nextInt());
		
		double novoSalario = salario.calcularPercentual();
	
		System.out.print("O seu novo salário será de " + novoSalario + " reais.");
	}

}
