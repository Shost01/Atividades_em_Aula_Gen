package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {

		// Cria a Collection ArrayList, do tipo Double, chamada notas
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner leia = new Scanner(System.in);

		// Cria um Objeto da Classe Wrapper Double
		Double y = Double.valueOf(9);
		Double valor;
		
		//System.out.println("Adicione um valor: ");
		//valor = leia.nextDouble();
		/**
		 * Adiciona algumas Notas. 
		 * Observe que a primeira nota é o Objeto Wrapper Double.
		 */

		//notas.add(valor);
		notas.add(y);
		notas.add(7.0);
		notas.add(5.5);
		notas.add(4.3);
		notas.add(10.0);
		notas.add(4.1);

		/**
		 * Mostra na tela todas as notas adicionadas. 
		 * Observe que a nota duplicada foi adicionada duas vezes.
		 */
		System.out.printf("\nNotas cadastradas: %.1f", notas);
		
		System.out.println("\nNotas cadastradas - Laço for...Each: " + notas);	
		
		for(Double nota : notas) {
			System.out.println(nota);
			
		}

	}

}
