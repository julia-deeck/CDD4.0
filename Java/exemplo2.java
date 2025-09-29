package aula03;

public class exemplo2 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) { // laço que percorre de 1 até 99
			if (i % 3 == 0) { // verifica se o número é múltiplo de 3
				System.out.println(i); // exibe o número que é múltiplo de 3
				break; // interrompe o laço após encontrar o primeiro múltiplo de 3
			}
		}
	}
}
