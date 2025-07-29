package exercicio.exercicio18;

public class Votaçao {
	private int anoAtual;
	private int anoNasc;
	private int idade;

	public int getAnoAtual() {
		return anoAtual;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String calcularIdade() {
		idade = anoAtual - anoNasc;
		if (idade >= 18) {
			return "Poderá votar";
		} else {
			return "Não poderá votar";
		}
	}
}
