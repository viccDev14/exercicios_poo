package exercicio.exercicio21;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		JogoXadrez jogo = new JogoXadrez();
		
		System.out.print("Digite a hora de início do jogo (0 a 23): ");
        jogo.setHorasInicio(in.nextInt());

        System.out.print("Digite a hora de fim do jogo (0 a 23): ");
        jogo.setHorasFinal(in.nextInt());

        System.out.println("A duração do jogo foi de " + jogo.duraçao() + " hora(s).");
	}

}
