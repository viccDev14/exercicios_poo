package exercicio41;

import java.util.Scanner;

//
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Criando Objeto Notas, dando vida a ele
		Notas aluno = new Notas();

		//Entrada de dados
		System.out.print("Digite a 1° nota: ");
		aluno.setN1(in.nextDouble());
		System.out.print("Digite a 2° nota: ");
		aluno.setN2(in.nextDouble());
		System.out.print("Digite a 3° nota: ");
		aluno.setN3(in.nextDouble());
		System.out.print("Digite a media de exercicios: ");
		aluno.setMediaExercicios(in.nextDouble());

		aluno.exibirDados();
		aluno.exibirResultado();
	}

}
