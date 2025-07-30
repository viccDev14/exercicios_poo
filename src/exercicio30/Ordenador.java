package exercicio30;

public class Ordenador {
	private int valor1, valor2, valor3;

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

	public int getValor3() {
		return valor3;
	}

	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}

	public void exibirOrdem() {
		int menor, medio, maior;

		if (valor1 < valor2 && valor1 < valor3) {
			menor = valor1;
			if (valor2 < valor3) {
				medio = valor2;
				maior = valor3;
			} else {
				medio = valor3;
				maior = valor2;
			}
		} else if (valor2 < valor1 && valor2 < valor3) {
			menor = valor2;
			if (valor1 < valor3) {
				medio = valor1;
				maior = valor3;
			} else {
				medio = valor3;
				maior = valor1;
			}
		} else {
			menor = valor3;
			if (valor1 < valor2) {
				medio = valor1;
				maior = valor2;
			} else {
				medio = valor2;
				maior = valor1;
			}
		}
		System.out.println("Valores em ordem crescente: " + menor + ", " + medio + ", " + maior);

	}

}
