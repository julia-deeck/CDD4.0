package operacaomatematica;

public class Divisao implements OperacaoMatematica {

    @Override
    public double calcular(double a, double b) {
        // Retorna o resultado da divisão de 'a' por 'b'
        return a / b;
    }
}
