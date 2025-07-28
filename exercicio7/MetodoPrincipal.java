package exercicio.exercicio7;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Idade id = new Idade();
		
		System.out.print("Digite o ano em que nasceu: ");
		id.setAno(in.nextInt());
		System.out.print("Digite o mes em que nasceu: ");
		id.setMes(in.nextInt());
		System.out.print("Digite o dia em que nasceu: ");
		id.setDia(in.nextInt());
		
		int idade = id.calcular();
		System.out.println("Sua idade é " + id.getAno() + " anos, " + id.getMes() + " meses e " + id.getDia() + " dias.");
		System.out.println("Convertendo essa idade para dias, irá para " + idade + " dias.");
		
	}

}
