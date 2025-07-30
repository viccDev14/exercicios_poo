package exercicio37;

import java.util.Scanner;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Fruteira f = new Fruteira();
        
        f.apresentar();

        System.out.print("Informe os Kg de morango: ");
        f.setQuilosMorango(in.nextDouble());

        System.out.print("Informe os Kg de maçã: ");
        f.setQuilosMaça(in.nextDouble());

        f.imprimirResumo();

	}

}
