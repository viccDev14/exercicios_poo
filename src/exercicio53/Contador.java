package exercicio.exercicio53;

public class Contador {

	// Dado que sera utilizado posteriormente
	private int valorN;

	// Getter e Setter
	public int getValorN() {
		return valorN;
	}

	public void setValorN(int valorN) {
		this.valorN = valorN;
	}

	// Metodo que ira mostrar na tela os numeros entre 1 ao numero N
	// valor que foi definido anteriormente
	public void imprimir() {
		for (int i = 1; i <= valorN; i++) {
			System.out.println(i);
		}
	}
}
