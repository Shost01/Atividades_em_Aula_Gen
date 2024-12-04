package estrutura_de_decisao;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

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
		} else if (media >= 4 && media < 6) {
			System.out.println("Você está de recuperação!");
		} else {
			System.out.println("Você foi reprovado!");
		}

		leia.close();

	}

}
