package exercicio23;

public class PesoIdeal {
	private String nome;
	private double altura;
	private String sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public double calcularPeso() {
		if (sexo == "M") {
			return (72.7 * altura) - 58;
		} else {
			return (62.1 * altura) - 44.7;
		}
	}
	
}
