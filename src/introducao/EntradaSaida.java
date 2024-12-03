package introducao;

import java.util.Scanner; // Importando Scanner para a classe

public class EntradaSaida {

	public static void main(String[] args) {
		// Váriaveis
		String nome;
		float temperatura;
		float fahrenheit;
		
		Scanner leia = new Scanner(System.in);
		
		// Pedir que insira nome e temperatura
		System.out.println("Insira o seu nome: ");
		nome = leia.next();
		
		System.out.println("Insira a temperatura em Celsius: ");
		temperatura = leia.nextFloat();
				
		// Processamento
		fahrenheit = temperatura * 1.8f + 32;
		
		// Saida dos dados
		System.out.println("Bom dia!, " + nome);
		System.out.printf("A temperatura em Fahrenheit é %.1f F.", fahrenheit);
		
	}

}
