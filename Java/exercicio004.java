package aula3;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // cria um Scanner para leitura de dados
        String text = entrada.nextLine(); // lê uma linha de texto digitada pelo usuário
        String resultado = text.toUpperCase(); // converte o texto para letras maiúsculas
        System.out.println(resultado); // imprime o texto convertido
        entrada.close(); // fecha o Scanner
    }

}
