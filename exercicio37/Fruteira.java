package exercicio.exercicio37;

public class Fruteira {
	private double quilosMaça;
	private double quilosMorango;

	public double getQuilosMaça() {
		return quilosMaça;
	}

	public void setQuilosMaça(double quilosMaça) {
		this.quilosMaça = quilosMaça;
	}

	public double getQuilosMorango() {
		return quilosMorango;
	}

	public void setQuilosMorango(double quilosMorango) {
		this.quilosMorango = quilosMorango;
	}

	public void apresentar() {
		 System.out.println("TABELA DE PREÇOS");
		    System.out.println("------------------------------");
		    System.out.println("MORANGO:");
		    System.out.println("  Até 5Kg      -> R$ 2,50 por Kg");
		    System.out.println("  Acima de 5Kg -> R$ 2,20 por Kg");
		    System.out.println();
		    System.out.println("MAÇÃ:");
		    System.out.println("  Até 5Kg      -> R$ 1,80 por Kg");
		    System.out.println("  Acima de 5Kg -> R$ 1,50 por Kg");
		    System.out.println("------------------------------");
	}
	public double calcularPrecoMorango() {
        if (quilosMorango <= 5) {
            return quilosMorango * 2.50;
        } else {
            return quilosMorango * 2.20;
        }
    }

    public double calcularPrecoMaca() {
        if (quilosMaça <= 5) {
            return quilosMaça * 1.80;
        } else {
            return quilosMaça * 1.50;
        }
    }
    public double calcularValorTotal() {
        double total = calcularPrecoMorango() + calcularPrecoMaca();
        double pesoTotal = quilosMorango + quilosMaça;

        if (pesoTotal > 8 || total > 25.0) {
            total = total - (total * 0.10); 
        }

        return total;
    }

    public void imprimirResumo() {
        System.out.printf("Total a pagar: R$ %.2f%n", calcularValorTotal());
    }

}
