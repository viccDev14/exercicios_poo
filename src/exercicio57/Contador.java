package exercicio57;

public class Contador {
	private int numero;

	public Contador() {
		this.numero = 1;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void acrescentar() {
		this.numero++;
	}
}
