package exercicio.exercicio40;

import java.util.Scanner;

//Classe principal
public class Main {

	public static void main(String[] args) {
		
		//Objeto Scanner nomeado in que agora tem vida, é usado para dar entrada a dados
		Scanner in = new Scanner(System.in); 

		//Criando objeto Produto
		Produto produto = new Produto();
		
		//Le todos os dados necessarios
		System.out.print("Digite o nome do produto: ");
		produto.setNomeProduto(in.next());
		System.out.print("Digite a quantidade adquirida: ");
		produto.setQuantidade(in.nextInt());
		System.out.print("Digite o preço unitario: ");
		produto.setPreçoUnitario(in.nextDouble());
		
		//Apresenta os dados
		produto.apresentar();
		
	}

}
