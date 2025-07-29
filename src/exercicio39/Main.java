package exercicio39;

public class Main {

	public static void main(String[] args) {
		Logica operacoes = new Logica(true, true, false);

        System.out.println("Resultado da expressão a: " + operacoes.avaliarA()); 
        System.out.println("Resultado da expressão b: " + operacoes.avaliarB()); 
        System.out.println("Resultado da expressão c: " + operacoes.avaliarC());
	}

}
