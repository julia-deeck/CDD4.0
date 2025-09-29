package funcionarios;

import java.util.ArrayList;
import java.util.List;

public class TesteFuncionarios {

    public static void main(String[] args) {
        // Cria uma lista para armazenar objetos do tipo Funcionario
        List<Funcionario> funcionarios = new ArrayList<>();

        // Adiciona um gerente e um programador à lista
        funcionarios.add(new Gerente("Alice", 5000));
        funcionarios.add(new Programador("Júlia", 3000));

        // Itera sobre cada funcionário da lista
        for (Funcionario f : funcionarios) {
            // Faz o cast do funcionário para Bonificavel para acessar o método calcularBonus
            Bonificavel b = (Bonificavel) f;

            System.out.println("Nome: " + f.getNome()); // exibe o nome do funcionário
            System.out.println("Salário com bônus: " + f.calcularSalarioBonus()); // exibe salário total
            System.out.println("Valor do bônus: R$" + b.calcularBonus()); // exibe o valor do bônus
        }
    }
}
