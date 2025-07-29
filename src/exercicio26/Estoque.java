package exercicio.exercicio26;

public class Estoque {
	private int quantidadeAtualEstoque;
	private int quantidadeMaxima;
	private int quantidadeMinima;
	
	public int getQuantidadeAtualEstoque() {
		return quantidadeAtualEstoque;
	}
	public void setQuantidadeAtualEstoque(int quantidadeAtualEstoque) {
		this.quantidadeAtualEstoque = quantidadeAtualEstoque;
	}
	public int getQuantidadeMaxima() {
		return quantidadeMaxima;
	}
	public void setQuantidadeMaxima(int quantidadeMaxima) {
		this.quantidadeMaxima = quantidadeMaxima;
	}
	public int getQuantidadeMinima() {
		return quantidadeMinima;
	}
	public void setQuantidadeMinima(int quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}
	
	public int calcularQuantidadeMedia() {
		return (quantidadeMaxima + quantidadeMinima)/2;
	
	}
	
	public String verificarCompra() {

        if (quantidadeAtualEstoque >= calcularQuantidadeMedia()) {
            return "Não efetuar compra";
        } else {
            return "Efetuar compra";
        }
	}
	
}
