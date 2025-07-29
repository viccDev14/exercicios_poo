package exercicio49;

public class Notas {

	// Dados que serao usados
	private double nota1;
	private double nota2;
	private String novoCalculo;

	// Getters e Setters
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public String getNovoCalculo() {
		return novoCalculo;
	}

	public void setNovoCalculo(String novoCalculo) {
		this.novoCalculo = novoCalculo;
	}

	// Metodo para calcular as notas e saber a media
	public double mediaSimples() {
		return (nota1 + nota2) / 2;
	}
}
