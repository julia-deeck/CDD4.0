package simulacaobancaria;

public class ContaCorrente extends Conta {

    // Construtor da ContaCorrente que chama o construtor da classe pai (Conta)
    public ContaCorrente(String numero, double saldo) {
        super(numero, saldo); // inicializa o número da conta e o saldo
    }
    
    // Esta classe herda os métodos depositar, sacar e exibirSaldo da classe Conta
}
