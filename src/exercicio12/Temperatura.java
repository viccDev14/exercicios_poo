package exercicio.exercicio12;

public class Temperatura {
	private int grausFahrenheit;

	public int getGrausFahrenheit() {
		return grausFahrenheit;
	}

	public void setGrausFahrenheit(int grausFahrenheit) {
		this.grausFahrenheit = grausFahrenheit;
	}

	public int calcularGraus() {
		return (grausFahrenheit - 32) * 5 / 9;

	}
}
