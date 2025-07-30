package exercicio43;

//Classe principal
public class Main {

	public static void main(String[] args) {

		// Construtor com parametros
		Teste t1 = new Teste(1, 2, 3);
		Teste t2 = new Teste(3, 4, 5);
		Teste t3 = new Teste(2, 2, 4);
		Teste t4 = new Teste(4, 4, 4);
		Teste t5 = new Teste(5, 3, 3);

		//Exibe o resultado
		t1.exibirTeste();
		t2.exibirTeste();
		t3.exibirTeste();
		t4.exibirTeste();
		t5.exibirTeste();
	}

}
