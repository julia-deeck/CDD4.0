package operacaomatematica;

public class Multiplicacao implements OperacaoMatematica {

    @Override
    public double calcular(double a, double b) {
        // Retorna o resultado da multiplicação de 'a' por 'b'
        return a * b;
    }
}
