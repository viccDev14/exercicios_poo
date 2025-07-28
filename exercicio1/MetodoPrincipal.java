package exercicio.exercicio1;

public class MetodoPrincipal {

	public static void main(String[] args) {
		

		TrocaDeValores troca = new TrocaDeValores(10, 20);

        System.out.println("Antes da troca:");
        troca.exibirValores();

      
        troca.trocar();

        System.out.println("Após a troca:");
        troca.exibirValores();
	}

}
