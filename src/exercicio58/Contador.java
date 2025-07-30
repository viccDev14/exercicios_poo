package exercicio58;

public class Contador {
	private int numero;

	public Contador() {
		this.numero = 10;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void retirar() {
		this.numero--;
	}
}
