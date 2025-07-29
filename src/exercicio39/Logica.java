package exercicio.exercicio39;

public class Logica {
	private boolean a;
	private boolean b;
	private boolean c;

	public Logica(boolean a, boolean b, boolean c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public boolean avaliarA() {
		return (a && b) || (a ^ b);
	}

	public boolean avaliarB() {
		return (a || b) && (a && c);

	}

	public boolean avaliarC() {
		return a || ((c && b) ^ (a && !b));
	}
}
