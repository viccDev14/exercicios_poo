package exercicio.exercicio15;

public class PositivoNegativo {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public String positivoNegativo() {
		if(valor >= 0) {
			return "É positivo";
		} else {
			return "É negativo";
		}
	}
	
	
}
