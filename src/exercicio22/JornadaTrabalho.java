package exercicio.exercicio22;

public class JornadaTrabalho {
	private double salarioPorHora;
	private int horasTrabalhadas;

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double salarioTotal() {
		int horasNormais = 40 * 4;
		double salarioTotal;
		if (horasTrabalhadas <= horasNormais) {
			salarioTotal = horasTrabalhadas * salarioPorHora;
		} else {
			int horasExtras = horasTrabalhadas - horasNormais;
			double valorHoraExtra = salarioPorHora * 1.5;
			salarioTotal = (horasNormais * salarioPorHora) + (horasExtras * valorHoraExtra);

		}
		return salarioTotal;
	}

}
