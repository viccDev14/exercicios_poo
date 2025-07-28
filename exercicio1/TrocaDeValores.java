package exercicio.exercicio1;

public class TrocaDeValores {
	private int a;
	private int b;
	private int c;

	public TrocaDeValores(int a, int b) {
		this.a = a;
		this.b = b;

	}

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

	public void trocar() {
		c = a;
		a = b;
		b = c;

	}

	public void exibirValores() {
		System.out.println("Valor de A: " + getA());
		System.out.println("Valor de B: " + getB());
	}
}
