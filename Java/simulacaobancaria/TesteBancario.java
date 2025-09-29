package simulacaobancaria;

public class TesteBancario {

    public static void main(String[] args) {
        // Cria três contas correntes com saldo inicial de 1000
        Conta conta1 = new ContaCorrente("001", 1000);
        Conta conta2 = new ContaCorrente("002", 1000);
        Conta conta3 = new ContaCorrente("003", 1000);
        
        // Cria um objeto Pagamento para realizar saques
        Pagamento pagamento = new Pagamento();
        
        // Executa saques em diferentes contas
        pagamento.executar(conta1, 200); // saque de 200 na conta1
        pagamento.executar(conta2, 100); // saque de 100 na conta2
        pagamento.executar(conta2, 220); // saque de 220 na conta2
        
        // Exibe os saldos atuais das contas
        System.out.println("\nSaldos:");
        conta1.exibirSaldo();
        conta2.exibirSaldo();
        conta3.exibirSaldo();
    }
}
