package exercicio.exercicio10;

public class CarroNovo {
	private double custoFabrica;
	
	private final double percentualDistribuidor = 0.28;
	private final double percentualImpostos = 0.45;

	public double getCustoFabrica() {
		return custoFabrica;
	}

	public void setCustoFabrica(double custoFabrica) {
		this.custoFabrica = custoFabrica;
	}
	
	public double calcularCustoFinal() {
		double valorDistribuidor = custoFabrica * percentualDistribuidor;
		double valorImpostos = custoFabrica * percentualImpostos;
		return custoFabrica + valorDistribuidor + valorImpostos;
	}
}
