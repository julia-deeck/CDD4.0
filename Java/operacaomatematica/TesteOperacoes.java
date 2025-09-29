package operacaomatematica;

public class TesteOperacoes {

    public static void main(String[] args) {
        // Cria objetos das operações matemáticas usando polimorfismo
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica sub = new Subtracao();
        OperacaoMatematica mult = new Multiplicacao();
        OperacaoMatematica div = new Divisao();

        double a = 10;
        double b = 5;

        // Exibe os resultados das operações
        System.out.println("Soma: " + soma.calcular(a, b));
        System.out.println("Subtração: " + sub.calcular(a, b));
        System.out.println("Multiplicação: " + mult.calcular(a, b));
        System.out.println("Divisão: " + div.calcular(a, b));
    }

}
