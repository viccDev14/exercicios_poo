package exercicio57;

public class Main {

	public static void main(String[] args) {
		Contador numero = new Contador();
		
		do {
			System.out.println(numero.getNumero());
			numero.acrescentar();
		} while(numero.getNumero() <= 10);
	}
}
