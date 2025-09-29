package aula3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String linha = entrada.nextLine();
		StringTokenizer texto = new StringTokenizer(linha);
		System.out.println(texto.countTokens());
		entrada.close();
	}

}
