package aula03;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // cria objeto para ler entrada do usuário
		double notas[] = new double[5]; // array para armazenar 5 notas
		double soma = 0, media = 0; // soma acumula as notas, media armazenará a média final
		
		for(int x = 0; x < notas.length; x++) { // percorre cada posição do array
			System.out.println("Digite a nota: ");
			notas[x] = entrada.nextDouble(); // lê a nota do usuário
		}
		
		for(double i : notas) { // percorre cada nota do array
			soma += 1; // ATENÇÃO: está somando 1 a cada nota, não os valores reais
		}
		
		media = soma / notas.length; // calcula a média
		System.out.printf("A média da turma é %.2f", media); // exibe a média formatada
		entrada.close(); // fecha o Scanner
	}
}
