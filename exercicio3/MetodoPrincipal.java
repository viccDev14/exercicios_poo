package exercicio.exercicio3;

public class MetodoPrincipal {

	public static void main(String[] args) {
		OperadoresLogicos op = new OperadoresLogicos();

		op.calcularA();
		op.calcularB();
		op.calcularC();
		
		System.out.println("Resultado A1: " + op.getResultadoA1());
		System.out.println("Resultado A2: " + op.getResultadoA2());
		System.out.println("A1 == A2? " + (op.getResultadoA1() == op.getResultadoA2()));
		System.out.println();

		System.out.println("Resultado B1: " + op.getResultadoB1());
		System.out.println("Resultado B2: " + op.getResultadoB2());
		System.out.println("B1 == B2? " + (op.getResultadoB1() == op.getResultadoB2()));
		System.out.println();

		System.out.println("Resultado C1: " + op.getResultadoC1());
		System.out.println("Resultado C2: " + op.getResultadoC2());
		System.out.println("C1 == C2? " + (op.getResultadoC1() == op.getResultadoC2()));

	}

}
