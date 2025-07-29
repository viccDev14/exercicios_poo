package exercicio41;

public class Notas {

	private double n1;
	private double n2;
	private double n3;
	private double mediaExercicios;

	// Getters e setters
	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double getMediaExercicios() {
		return mediaExercicios;
	}

	public void setMediaExercicios(double mediaExercicios) {
		this.mediaExercicios = mediaExercicios;
	}

	// Metodo para calcular a media de aproveitamento
	public double calcularMediaAproveitamento() {
		return (n1 + (n2 * 2) + (n3 * 3) + mediaExercicios) / 7;
	}

	// Metodo para determinar o conceito de cada nota
	public String obterConceito() {
		double media = calcularMediaAproveitamento();
		if (media >= 9.0) {
			return "A";
		} else if (media >= 7.5 && media < 9.0) {
			return "B";
		} else if (media >= 6.0 && media < 7.5) {
			return "C";
		} else {
			return "D";
		}
	}

	// Metodo para exibir os dados obtidos
	public void exibirDados() {
		System.out.println("\n--- Dados do Aluno ---");
		System.out.println("Nota 1: " + getN1());
		System.out.println("Nota 2: " + getN2());
		System.out.println("Nota 3: " + getN3());
		System.out.println("Média Exercícios: " + getMediaExercicios());
	}

	// Metodo para exibir o resultado
	public void exibirResultado() {
		System.out.println("\n--- Resultado ---");
		System.out.printf("Média de Aproveitamento: %.2f%n", calcularMediaAproveitamento());
		System.out.println("Conceito: " + obterConceito());

	}

}
