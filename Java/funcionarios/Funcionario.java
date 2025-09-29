package funcionarios;

// Classe abstrata que representa um funcionário genérico
public abstract class Funcionario {
    String nome;         // armazena o nome do funcionário
    double salarioBase;  // armazena o salário base do funcionário
    
    // Construtor para inicializar o nome e o salário base
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    // Método abstrato que deve ser implementado pelas subclasses
    // para calcular o salário incluindo o bônus
    public abstract double calcularSalarioBonus();

    // Getters para acessar os atributos privados
    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
