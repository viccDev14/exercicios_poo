package exercicio.exercicio55;

public class Tabuada {
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void imprimirTabuada() {
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
		}
	}
}
