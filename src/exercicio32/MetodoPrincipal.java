package exercicio.exercicio32;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Partida partida = new Partida();

		System.out.print("Digite o nome do Time 1: ");
		partida.setTime1(in.nextLine());

		System.out.print("Digite o nome do Time 2: ");
		partida.setTime2(in.nextLine());

		System.out.print("Digite os gols do " + partida.getTime1() + ": ");
		partida.setGol1(in.nextInt());

		System.out.print("Digite os gols do " + partida.getTime2() + ": ");
		partida.setGol2(in.nextInt());

		System.out.println(partida.resultado());

	}

}
