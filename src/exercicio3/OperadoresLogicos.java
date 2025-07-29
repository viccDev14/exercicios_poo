package exercicio.exercicio3;

public class OperadoresLogicos {
	private double resultadoA1;
	private double resultadoA2;
	private double resultadoB1;
	private double resultadoB2;
	private double resultadoC1;
	private double resultadoC2;

	public double getResultadoA1() {
		return resultadoA1;
	}

	public void setResultadoA1(double resultadoA1) {
		this.resultadoA1 = resultadoA1;
	}

	public double getResultadoA2() {
		return resultadoA2;
	}

	public void setResultadoA2(double resultadoA2) {
		this.resultadoA2 = resultadoA2;
	}

	public double getResultadoB1() {
		return resultadoB1;
	}

	public void setResultadoB1(double resultadoB1) {
		this.resultadoB1 = resultadoB1;
	}

	public double getResultadoB2() {
		return resultadoB2;
	}

	public void setResultadoB2(double resultadoB2) {
		this.resultadoB2 = resultadoB2;
	}

	public double getResultadoC1() {
		return resultadoC1;
	}

	public void setResultadoC1(double resultadoC1) {
		this.resultadoC1 = resultadoC1;
	}

	public double getResultadoC2() {
		return resultadoC2;
	}

	public void setResultadoC2(double resultadoC2) {
		this.resultadoC2 = resultadoC2;
	}

	public void calcularA() {
		setResultadoA1((4.0 / 2) + (2.0 / 4));
		setResultadoA2(4.0 / 2 + 2.0 / 4);
	}

	public void calcularB() {
		setResultadoB1((4.0 / (2 + 2) / 4));
		setResultadoB2(4.0 / 2 + 2.0 / 4);
	}

	public void calcularC() {
		setResultadoC1((4 + 2) * 2 - 4);
		setResultadoC2(4 + 2 * 2 - 4);
	}
}
