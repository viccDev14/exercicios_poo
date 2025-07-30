package exercicio58;

public class Main {
	public static void main(String[] args) {
		Contador numero = new Contador();

		while (numero.getNumero() >= 1) {
			System.out.println(numero.getNumero());
			numero.retirar();
		}
	}
}
