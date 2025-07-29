package exercicio.exercicio7;

public class Idade {
	private int ano;
	private int mes;
	private int dia;
	
	public int getAno() {
		return 2025 - ano - 1;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return 12 + 7 - mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia - 4;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int calcular() {
		return getAno() * 365;
	}
}
