package simulacaobancaria;

public class ContaPoupanca extends Conta {

    // Construtor da ContaPoupanca que chama o construtor da classe pai (Conta)
    public ContaPoupanca(String numero, double saldo) {
        super(numero, saldo); // inicializa o número da conta e o saldo
    }
    
    // Esta classe herda os métodos depositar, sacar e exibirSaldo da classe Conta
}
