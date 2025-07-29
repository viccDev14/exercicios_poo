package exercicio.exercicio9;

public class Salarios {
	private String nome;
	private float salario;
	private int reajuste;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public int getReajuste() {
		return reajuste;
	}
	public void setReajuste(int reajuste) {
		this.reajuste = reajuste;
	}
	
	public double calcularPercentual() {
		return ((salario * reajuste/100)) + salario;
	}
	
}
