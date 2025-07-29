package exercicio.exercicio8;

public class Eleitores {
	private double brancos;
	private double nulos;
	private double validos;
	private double totEleitores;
	
	public double getBrancos() {
		return brancos;
	}
	public void setBrancos(int brancos) {
		this.brancos = brancos;
	}
	public double getNulos() {
		return nulos;
	}
	public void setNulos(int nulos) {
		this.nulos = nulos;
	}
	public double getTotEleitores() {
		return totEleitores;
	}
	public void setTotEleitores(int totEleitores) {
		this.totEleitores = totEleitores;
	}
	public double getValidos() {
		return validos;
	}
	public void setValidos(int validos) {
		this.validos = validos;
	}
	
	
	
	public double percentualBrancos() {
		return (brancos/totEleitores) * 100;
	}
	
	public double percentualNulos() {
		return (nulos/totEleitores) * 100;
	}
	
	public double percentualValidos() {
		return (validos/totEleitores) * 100;
	}
}
