package funcionarios;

// Classe Gerente que herda Funcionario e implementa Bonificavel
public class Gerente extends Funcionario implements Bonificavel {

    // Construtor que inicializa o nome e o salário base do gerente
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // Implementa o cálculo do bônus (20% do salário base)
    @Override
    public double calcularBonus() {
        return salarioBase * 0.20;
    }

    // Calcula o salário total incluindo o bônus
    @Override
    public double calcularSalarioBonus() {
        return salarioBase + calcularBonus();
    }
}
