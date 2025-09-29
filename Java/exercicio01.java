package aula03;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        int qnt = 0, cont = 0; // qnt: quantidade de alunos, cont: contador do laço
        double somaNotas = 0, media = 0; // somaNotas: acumula as notas, media: armazena a média final

        Scanner entrada = new Scanner(System.in); // cria objeto para ler entrada do usuário
        System.out.println("Quantos alunos têm na sala?: ");
        qnt = entrada.nextInt(); // lê a quantidade de alunos

        while (cont < qnt) { // repete enquanto o contador for menor que a quantidade de alunos
            System.out.println("Digite a nota do aluno: ");
            somaNotas += entrada.nextDouble(); // acumula a nota do aluno
            cont++; // incrementa o contador
        }

        media = somaNotas / qnt; // calcula a média das notas
        System.out.println("Média da turma: " + media); // exibe a média
        entrada.close(); // fecha o Scanner
    }
}
