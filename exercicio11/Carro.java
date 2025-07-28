package exercicio.exercicio11;

public class Carro {
	private double totalVendas;
	private int vendidos;
	private double salarioFixo;
	private double comissaoPorCarro;
	
	
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	public int getVendidos() {
		return vendidos;
	}
	public void setVendidos(int vendidos) {
		this.vendidos = vendidos;
	}
	public double getSalarioFixo() {
		return salarioFixo;
	}
	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	public double getComissaoPorCarro() {
		return comissaoPorCarro;
	}
	public void setComissaoPorCarro(double comissaoPorCarro) {
		this.comissaoPorCarro = comissaoPorCarro;
	}
	
	public double calcularSalarioFinal() {
		return (salarioFixo + (vendidos * comissaoPorCarro) + (totalVendas * 0.05));
	}
	
}
