package exercicio.exercicio25;

public class Conta {
	private int numeroConta;
	private double saldo;
	private double debito;
	private double credito;
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getDebito() {
		return debito;
	}
	public void setDebito(double debito) {
		this.debito = debito;
	}
	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	public double calcularSaldoAtual() {
		return saldo - debito + credito;
	
	}
	
	public String verificarSituacao() {
        double saldoAtual = calcularSaldoAtual();
        if (saldoAtual >= 0) {
            return "Saldo Positivo";
        } else {
            return "Saldo Negativo";
        }
}
}
