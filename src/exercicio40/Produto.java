package exercicio40;

//Classe Informaçoes
public class Produto {

	// Informaçoes privadas da classe Informaçoes, ainda inutilizavel
	// Com getter e setter, para obter e modificar informaçoes
	private String nomeProduto;
	private int quantidade;
	private double preçoUnitario;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreçoUnitario() {
		return preçoUnitario;
	}

	public void setPreçoUnitario(double preçoUnitario) {
		this.preçoUnitario = preçoUnitario;
	}

	// Metodo para calcular o total
	public double calcularTotal() {
		return quantidade * preçoUnitario;
	}

	// Metodo para calcular o desconto
	public double calcularDesconto() {
		if (quantidade <= 5) {
			return calcularTotal() * 0.02;
		} else if (quantidade > 5 && quantidade <= 10) {
			return calcularTotal() * 0.03;
		} else {
			return calcularTotal() * 0.05;
		}
	}

	// Metodo para calcular o total ja com os descontos
	public double calcularTotalPagar() {
		return calcularTotal() - calcularDesconto();
	}

	//Saida dos dados obtidos
	public void apresentar() {
		System.out.println("\n--- Detalhes da Compra ---");
		System.out.println("Produto: " + getNomeProduto());
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Preço Unitário: R$ " + getPreçoUnitario());
		System.out.println("Total: R$ " + calcularTotal());
		System.out.println("Desconto: R$ " + calcularDesconto());
		System.out.println("Total a Pagar: R$ " + calcularTotalPagar());
	}
}
