package exercicio.exercicio26;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Estoque produto = new Estoque();

        System.out.print("Digite a quantidade atual em estoque: ");
        produto.setQuantidadeAtualEstoque(in.nextInt());

        System.out.print("Digite a quantidade máxima em estoque: ");
        produto.setQuantidadeMaxima(in.nextInt());

        System.out.print("Digite a quantidade mínima em estoque: ");
        produto.setQuantidadeMinima(in.nextInt());

    
        System.out.println("Quantidade média: " + produto.calcularQuantidadeMedia());
        System.out.println(produto.verificarCompra());
	}

}
