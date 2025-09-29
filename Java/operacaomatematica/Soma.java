package operacaomatematica;

// Classe que implementa a interface OperacaoMatematica para realizar a soma
public class Soma implements OperacaoMatematica {
    @Override
    public double calcular(double a, double b) { // retorna a soma de dois números
        return a + b;
    }
}
