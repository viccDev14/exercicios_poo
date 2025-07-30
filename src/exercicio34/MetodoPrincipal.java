package exercicio34;

public class MetodoPrincipal {

	public static void main(String[] args) {
		Teste c1 = new Teste(3, 2);
		Teste c2 = new Teste(150, 3);
		Teste c3 = new Teste(7, -1);
		Teste c4 = new Teste(-2, 5);
		Teste c5 = new Teste(50, 3);
		

		c1.calcular();
		c2.calcular();
		c3.calcular();
		c4.calcular();
		c5.calcular();

		System.out.println("Valor de z: " + c1.getZ());
		System.out.println("Resposta: " + c1.getResposta());
		System.out.println();
		System.out.println("Valor de z: " + c2.getZ());
		System.out.println("Resposta: " + c2.getResposta());
		System.out.println();
		System.out.println("Valor de z: " + c3.getZ());
		System.out.println("Resposta: " + c3.getResposta());
		System.out.println();
		System.out.println("Valor de z: " + c4.getZ());
		System.out.println("Resposta: " + c4.getResposta());
		System.out.println();
		System.out.println("Valor de z: " + c5.getZ());
		System.out.println("Resposta: " + c5.getResposta());
		System.out.println();
	}

}
