package exercicio.exercicio27;

public class PositivoOuNegativo {
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	 public String verificarSinal() {
	        if (valor > 0) {
	            return "Positivo";
	        } else if (valor < 0) {
	            return "Negativo";
	        } else {
	            return "Zero";
	        }
	    }
}
