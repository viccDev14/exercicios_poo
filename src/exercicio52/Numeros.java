package exercicio52;

public class Numeros {
	private int quantidade;
	private int numeroInicial = 101;
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void imprimirNumeros() {
		int contador = 0;
		int numero = numeroInicial;
		
		while (contador < quantidade) {
			System.out.println(numero);
			numero++;
			contador++;
		}
	}
}
