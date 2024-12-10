package metodos;

public class ExemplosMetodos {

	public static void main(String[] args) {

		int resultado = somar(2, 5);
		
		falar("O primeiro resultado é: " + resultado);
		falar("O segundo resultado é: " + somar(8,3));
		
		ExemploMetodoExterno.mensagem();

	}
	
	// Definição do Método Somar - Método Com Retorno e Com Parâmetro
	public static int somar(int x, int y) {
		return x + y; // 2 + 5		
		
	}
	
	// Definição do Método Falar - Método Sem Retorno e Com Parâmetro
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}

}
