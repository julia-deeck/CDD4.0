package aula03;

public class exercicio06 {

	public static void main(String[] args) {
		int soma3 = 0, soma5 = 0, somatotal = 0; // variáveis para acumular múltiplos de 3, 5 e a soma total
		
		for (int i = 1; i <= 20; i++) { // percorre números de 1 a 20
			soma3 += i % 3 == 0 ? i : 0; // se i for múltiplo de 3, adiciona a soma3
			soma5 += i % 5 == 0 ? i : 0; // se i for múltiplo de 5, adiciona a soma5
		}
		
		somatotal = soma3 + soma5; // calcula a soma total de múltiplos de 3 e 5
		System.out.println(soma3 + " " + soma5 + " " + somatotal); // exibe os resultados
	}
}
