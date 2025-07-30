package exercicio58;

public class Main {
	public static void main(String[] args) {
		Contador numero = new Contador();

		while (numero.getNumero() >= 1) {
			numero.retirar();
			System.out.println(numero.getNumero());

		}
	}
}
