package exercicio77;

public class Main {
	public static void main(String[] args) {
		int[] V = {0, 5, 1, 4, 2, 7, 8, 3, 6};

        // Loop: i de 8 até 5 passo -1
        for (int i = 8; i >= 5; i--) {
            int aux = V[i];
            V[i] = V[8 - i + 1];
            V[8 - i + 1] = aux;
        }

        // v[3] = v[1]
        V[3] = V[1];

        // v[v[3]] = v[v[2]]
        V[V[3]] = V[V[2]];

        // Exibir resultado
        for (int i = 1; i <= 8; i++) {
            System.out.print(V[i] + " ");
        }
	}
}
