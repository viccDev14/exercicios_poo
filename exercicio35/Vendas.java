package exercicio.exercicio35;

public class Vendas {
	private double litros;
	private char tipo;
	private double precoLitro;

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = Character.toUpperCase(tipo.charAt(0));

		if (this.tipo == 'A') {
			this.precoLitro = 2.90;
		} else if (this.tipo == 'G') {
			this.precoLitro = 3.30;
		} else {
			this.precoLitro = 0.0;
		}

	}

	public double getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}

	public double calcularValor() {
		double desconto = 0.0;

		if (tipo == 'A') {
			if (litros <= 20) {
				desconto = 0.03;
			} else {
				desconto = 0.05;
			}
		} else if (tipo == 'G') {
			if (litros <= 20) {
				desconto = 0.04;
			} else {
				desconto = 0.06;
			}
		}

		double total = litros * precoLitro;
		double valorComDesconto = total - (total * desconto);
		return valorComDesconto;
	}

	public void imprimirResumo() {
		System.out.printf("Total a pagar: R$ %.2f%n", calcularValor());
	}
}
