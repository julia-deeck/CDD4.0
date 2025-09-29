package operacaomatematica;

// Classe que implementa a interface OperacaoMatematica para realizar a subtração
public class Subtracao implements OperacaoMatematica {
    @Override
    public double calcular(double a, double b) { // retorna a diferença entre dois números
        return a - b;
    }
}
