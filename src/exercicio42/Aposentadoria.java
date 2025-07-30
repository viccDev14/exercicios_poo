package exercicio42;

public class Aposentadoria {

	// Dados que serão lidos
	private int codigo;
	private int anoNasc;
	private int anoIngresso;

	// Getters e Setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	// Metodo para descobrir a idade
	public int idade() {
		return 2025 - anoNasc;
	}

	// Metodo para descobrir o tempo de trabalho
	public int tempoTrabalhado() {
		return 2025 - anoIngresso;
	}

	// Metodo para verificar se será ou não preciso aposentadoria
	public String verificarAposento() {
		if (idade() >= 65) {
			return "Requerer aposentadoria";
		} else if (tempoTrabalhado() >= 30) {
			return "Requerer aposentadoria";
		} else if (idade() >= 60 && tempoTrabalhado() >= 25) {
			return "Requerer aposentario";
		} else {
			return "Não requerer";
		}
	}

	//Saida de dados
	public void exibição() {
		System.out.println("Idade: " + idade() + " anos");
		System.out.println("Tempo trabalhado: " + tempoTrabalhado() + " ano(s)");
		System.out.println(verificarAposento());
	}
}
