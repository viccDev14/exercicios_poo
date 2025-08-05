package exercicio76;

public class Main {
	public static void main(String[] args) {

		int largura = 60;
		int altura = 10;

		for (int linha = 1; linha <= altura; linha++) {
			if (linha == 1 || linha == altura) {
				
				// Linha do topo ou base: só '=' em toda a largura
				for (int col = 1; col <= largura; col++) {
					System.out.print("=");
				}
			} else {
				
				// Linhas do meio: '=' nas pontas e espaços no meio
				System.out.print("="); // primeiro '='
				for (int col = 2; col < largura; col++) {
					System.out.print(" ");
				}
				System.out.print("="); // último '='
			}
			System.out.println();
		}
	}
}
