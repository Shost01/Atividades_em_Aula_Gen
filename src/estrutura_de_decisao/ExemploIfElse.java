package estrutura_de_decisao;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
	
		// variáveis
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();
		
		// Processamento
		
		
		if (media >= 6 && media <= 10) {
			System.out.println("Você foi aprovado!");
		}
		else if (media >= 0 && media < 6 ) {
			System.out.println("Você está reprovado!");
		}
		else {
			System.out.println("Você colocou uma media invalida!");
		}

		leia.close();
	}

}
