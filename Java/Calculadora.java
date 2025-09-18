package metodos; // define o pacote onde a classe está localizada

public class Calculadora { // declaração da classe Calculadora

    public static void main(String[] args) { // método principal, ponto de entrada do programa
        CalcularMetodos c1 = new CalcularMetodos(); // cria um objeto da classe CalcularMetodos
        int r; // variável para armazenar o resultado das somas

        r = c1.somar(5,10); // chama o método somar com 2 argumentos e armazena o resultado em 'r'
        System.out.printf("O valor da soma de 2 números é %d \n", r); // exibe o resultado da soma de 2 números

        r = c1.somar(1, 2, 3); // chama o método somar com 3 argumentos e armazena o resultado em 'r'
        System.out.printf("O valor da soma de 3 números é %d \n", r); // exibe o resultado da soma de 3 números
    }
}
