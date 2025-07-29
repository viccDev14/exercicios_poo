package exercicio17;

public class Notas {
	private double avaliaçao1;
	private double avaliaçao2;
	private double media;

	public double getAvaliaçao1() {
		return avaliaçao1;
	}

	public void setAvaliaçao1(double avaliaçao1) {
		this.avaliaçao1 = avaliaçao1;
	}

	public double getAvaliaçao2() {
		return avaliaçao2;
	}

	public void setAvaliaçao2(double avaliaçao2) {
		this.avaliaçao2 = avaliaçao2;
	}

	public double getMedia() {
		return (avaliaçao1 + avaliaçao2)/2;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String calcularMedia() {
		if (getMedia() >= 6) {
			return "Aluno Aprovado";
		} else {
			return "Aluno Reprovado";
		}
	}
}
