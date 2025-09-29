package funcionarios;

// Classe Programador que herda Funcionario e implementa Bonificavel
public class Programador extends Funcionario implements Bonificavel {

    // Construtor que inicializa o nome e o salário base do programador
    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // Implementa o cálculo do bônus (10% do salário base)
    @Override
    public double calcularBonus() {
        return salarioBase * 0.10;
    }

    // Calcula o salário total incluindo o bônus
    @Override
    public double calcularSalarioBonus() {
        return salarioBase + calcularBonus();
    }
}
