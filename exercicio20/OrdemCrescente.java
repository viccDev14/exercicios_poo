package exercicio.exercicio20;

public class OrdemCrescente {
	private int numero1;
	private int numero2;
	
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public void ordem() {
		if (getNumero1() < getNumero2()) {
	        System.out.println("Ordem crescente: " + getNumero1() + ", " + getNumero2());
	    } else if (getNumero2() < getNumero1()) {
	        System.out.println("Ordem crescente: " + getNumero2() + ", " + getNumero1());
	    } else {
	        System.out.println("Os números são iguais, não é permitido");
	    }
	}
	
}
