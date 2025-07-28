package exercicio.exercicio16;

public class Maças {
	private int maçasCompradas;
	private double custo;

	private final double custoMenosDuzia = 1.30;
	private final double custoMaisDuzia = 1.00;

	public int getMaçasCompradas() {
		return maçasCompradas;

	}

	public void setMaçasCompradas(int maçasCompradas) {
		this.maçasCompradas = maçasCompradas;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double custoTotal() {
		if (maçasCompradas >= 12) {
			return maçasCompradas * custoMaisDuzia;

		} else {
			return maçasCompradas * custoMenosDuzia;
		}
	}
}
