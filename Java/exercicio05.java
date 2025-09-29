package aula03;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		int qnt = 0, cont = 0; // qnt: quantidade de alunos, cont: contador do laço
		double somaNotas = 0, media = 0; // somaNotas: acumula as notas, media: armazena a média final
		
		Scanner entrada = new Scanner(System.in); // cria objeto para ler entrada do usuário
		System.out.println("Quantos alunos têm na sala? ");
		qnt = entrada.nextInt(); // lê a quantidade de alunos
		
		for (cont = 0; cont < qnt; cont++) { // laço que repete para cada aluno
			System.out.println("Digite a nota do aluno: ");
			somaNotas = entrada.nextDouble(); // lê a nota do aluno (ATENÇÃO: sobrescreve somaNotas em vez de acumular)
		}
		
		media = somaNotas / qnt; // calcula a média das notas
		System.out.println(media); // exibe a média
		entrada.close(); // fecha o Scanner
	}
}
