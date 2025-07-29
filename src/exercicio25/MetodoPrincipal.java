package exercicio25;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Conta c1 = new Conta();
		
		System.out.print("Digite o número da conta: ");
        c1.setNumeroConta(in.nextInt());

        System.out.print("Digite o saldo: R$ ");
        c1.setSaldo(in.nextDouble());

        System.out.print("Digite o valor do débito: R$ ");
        c1.setDebito(in.nextDouble());

        System.out.print("Digite o valor do crédito: R$ ");
        c1.setCredito(in.nextDouble());

        System.out.println("Saldo atual: R$ " + c1.calcularSaldoAtual());
        System.out.println(c1.verificarSituacao());


	}

}
