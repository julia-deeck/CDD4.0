package aula03;

public class exemplo4 {

	public static void main(String[] args) {
		int numeros[] = {2,5,3,8,7}; // cria um array de inteiros com valores iniciais
		double notas[] = new double[4]; // cria um array de 4 números decimais, inicializados com 0.0 por padrão
		for(int x = 0; x < notas.length; x++) { // percorre cada posição do array 'notas'
			System.out.println(notas[x]); // exibe o valor da posição atual (será 0.0 inicialmente)
		}
	}
}
