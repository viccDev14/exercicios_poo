package exercicio43;

public class Teste {

	// Dados que serão lidos
	private int a;
	private int b;
	private int c;

	// Construtor
	public Teste(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Getters e Setters
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	// Metodo para descobrir se é possivel formar um triangulo
	// Retorna o tipo de triangulo
	public String teste() {
		if ((a < b + c) && (b < a + c) && (c < a + b)) {
			if (a == b && b == c) {
				return "Triangulo Equilatero";
			} else if ((a == b) || (b == c) || (a == c)) {
				return "Triangulo Isosceles";
			} else {
				return "Triangulo Escaleno";
			}
		} else {
			return "Não é possivel formar um triangulo";
		}
	}

	// Metodo para Saida de dados
	public void exibirTeste() {
		System.out.println(teste());
	}
}
