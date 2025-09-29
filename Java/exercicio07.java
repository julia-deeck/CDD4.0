package aula03;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // cria objeto para ler entrada do usuário
		int A[] = new int[4]; // cria array A com 4 posições
		int B[] = new int[4]; // cria array B com 4 posições
		int C[] = new int[4]; // cria array C com 4 posições
		int D[] = new int[4]; // cria array D com 4 posições
		
		for(int x = 0; x < A.length; x++) { // percorre cada posição dos arrays
			System.out.printf("Digite o %d número array A: ", x+1);
			A[x] = entrada.nextInt(); // lê o valor para o array A

			System.out.printf("Digite o %d número array B: ", x+1);
			B[x] = entrada.nextInt(); // lê o valor para o array B

			System.out.printf("Digite o %d número array C: ", x+1);
			C[x] = entrada.nextInt(); // lê o valor para o array C

			System.out.printf("Digite o %d número array D: ", x+1);
			D[x] = entrada.nextInt(); // lê o valor para o array D
		}
		
		System.out.println(Arrays.toString(A)); // exibe os valores do array A
		System.out.println(Arrays.toString(B)); // exibe os valores do array B
		System.out.println(Arrays.toString(C)); // exibe os valores do array C
		System.out.println(Arrays.toString(D)); // exibe os valores do array D
		
		entrada.close(); // fecha o Scanner
	}
}
