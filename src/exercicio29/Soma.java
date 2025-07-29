package exercicio29;

public class Soma {
	private int numero1, numero2, numero3;

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getNumero3() {
		return numero3;
	}

	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}
	 
	public int somaMaiores() {
		if (numero1 < numero2 && numero1 < numero3) {
			return numero2 + numero3;
		} else if (numero2 < numero1 && numero2 < numero3) {
			return numero1 + numero3;
		} else {
			return numero1 + numero2;
		}
	}
}
