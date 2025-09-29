package metodos;

public class Calculadora {

	public static void main(String[] args) {
		CalcularMetodos c1 = new CalcularMetodos(); // cria um objeto para acessar os métodos de cálculo
		int r; // variável para armazenar o resultado

		r = c1.somar(5,10); // soma dois números
		System.out.printf("O valor da soma de 2 números é %d \n", r); // exibe o resultado da soma de 2 números

		r = c1.somar(1, 2, 3); // soma três números
		System.out.printf("O valor da soma de 3 números é %d \n", r); // exibe o resultado da soma de 3 números
	}
}
