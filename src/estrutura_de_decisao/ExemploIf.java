package estrutura_de_decisao;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {	
		
		// variáveis
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada
		System.out.println("Digite a sua média: ");
		media = leia.nextFloat();
		
		// Processamento
		
		if (media >= 6) {
			System.out.println("Você foi aprovado!");
		}
		
		leia.close();
	}

}
