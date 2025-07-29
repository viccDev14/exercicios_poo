package exercicio.exercicio36;

public class Idades {
	private Pessoa[] homens;
	private Pessoa[] mulheres;

	public Idades(Pessoa[] homens, Pessoa[] mulheres) {
		this.homens = homens;
		this.mulheres = mulheres;
	}

	private Pessoa homemMaisVelho() {
		if (homens[0].getIdade() > homens[1].getIdade()) {
			return homens[0];
		} else {
			return homens[1];
		}
	}

	private Pessoa homemMaisNovo() {
		if (homens[0].getIdade() < homens[1].getIdade()) {
			return homens[0];
		} else {
			return homens[1];
		}
	}

	private Pessoa mulherMaisVelha() {
		if (mulheres[0].getIdade() > mulheres[1].getIdade()) {
			return mulheres[0];
		} else {
			return mulheres[1];
		}
	}

	private Pessoa mulherMaisNova() {
		if (mulheres[0].getIdade() < mulheres[1].getIdade()) {
			return mulheres[0];
		} else {
			return mulheres[1];
		}
	}

	public void calcularEImprimir() {
		int soma = homemMaisVelho().getIdade() + mulherMaisNova().getIdade();
		int produto = homemMaisNovo().getIdade() * mulherMaisVelha().getIdade();

		System.out.println("Soma do homem mais velho com a mulher mais nova: " + soma);
		System.out.println("Produto do homem mais novo com a mulher mais velha: " + produto);
	}
}
