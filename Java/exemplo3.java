package aula03;

public class exemplo3 {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) { // laço que percorre de 0 até 99
			if (i > 50 && i < 60) { // verifica se o número está entre 51 e 59
				continue; // pula a iteração atual (não executa o println para esses valores)
			}
			System.out.println(i); // exibe o número se não estiver no intervalo de 51 a 59
		}
	}
}
