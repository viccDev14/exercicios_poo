package exercicio33;

public class Valores {
	private int valor1, valor2;

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	
	public void verificar() {
		if (valor1 == valor2) {
			System.out.println("Numeros iguais");
		} else if (valor1 > valor2) {
			System.out.println("Primeiro é maior");
		} else {
			System.out.println("Segundo maior");
		}
	}
}
