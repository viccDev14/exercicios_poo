package exercicio34;

public class Teste {
	private int x, y, z;
	private String resposta;

	public Teste(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public String getResposta() {
		return resposta;
	}

	public void calcular() {
		z = (x * y) + 5;
		
		if (z <= 0) {
			resposta = "A";
		} else if (z <= 100) {
			resposta = "B";
		} else {
			resposta = "C";
		}
	}
	

}
