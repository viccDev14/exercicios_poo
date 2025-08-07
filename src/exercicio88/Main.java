package exercicio88;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		
		 for (int i = 0; i < 20; i++) {
	            System.out.print("Digite o número " + (i + 1) + ": ");
	            lista.add(in.nextInt());
		 }
		 
		 System.out.print("\nDigite um número: ");
	        int num = in.nextInt();
	        
	        boolean encontrado = false;
	        for (int i = 0; i < lista.size(); i++) {
	            if (lista.get(i) == num) {
	                lista.remove(i);
	                encontrado = true;
	                break;
	            }
	        }
	        if (encontrado) {
	            System.out.println("\nLista após remover o número " + num + ":");
	            for (int i = 0; i < lista.size(); i++) {
	                System.out.print(lista.get(i) + " ");
	            }
	        } else {
	            System.out.println("Número não existe na lista.");
	        }  
	}
}
