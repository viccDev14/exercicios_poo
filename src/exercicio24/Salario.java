package exercicio24;

public class Salario {
	private double salarioFixo;
	private double valorVendasEfetuadas;

	public double getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	public double getValorVendasEfetuadas() {
		return valorVendasEfetuadas;
	}
	public void setValorVendasEfetuadas(double valorVendasEfetuadas) {
		this.valorVendasEfetuadas = valorVendasEfetuadas;
	}
	
	public double calcularSalarioTot() {
		double comissao;
		if (valorVendasEfetuadas <= 1500) {
			comissao = valorVendasEfetuadas * 0.03;
		} else {
			comissao = 1500 * 0.03 + (valorVendasEfetuadas - 1500) * 0.05;
		}
		
		return salarioFixo + comissao;
	}
	
}
