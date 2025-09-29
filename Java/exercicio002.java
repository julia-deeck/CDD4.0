package aula3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // cria um Scanner para ler dados do usuário
		String linha = entrada.nextLine(); // lê uma linha de texto
		StringTokenizer texto = new StringTokenizer(linha); // quebra a linha em tokens usando espaço como delimitador padrão
		System.out.println(texto.countTokens()); // imprime a quantidade de palavras na linha
		entrada.close(); // fecha o Scanner
	}

}
