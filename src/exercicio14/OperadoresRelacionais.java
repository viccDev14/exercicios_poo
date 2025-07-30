package exercicio14;

public class OperadoresRelacionais {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String maiorOuMenor() {
		if (valor > 10) {
			return "É MAIOR QUE 10!";
		} else {
			return "NÃO É MAIOR QUE 10!";
		}
	}

}
