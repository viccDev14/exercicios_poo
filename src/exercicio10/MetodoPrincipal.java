package exercicio.exercicio10;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		CarroNovo carro = new CarroNovo();
		
		System.out.print("Digite o custo de fábrica do carro: ");
        carro.setCustoFabrica(in.nextDouble());

        double custoFinal = carro.calcularCustoFinal();
        System.out.printf("O custo final ao consumidor é: R$ %.2f\n", custoFinal);
		
	}

}
