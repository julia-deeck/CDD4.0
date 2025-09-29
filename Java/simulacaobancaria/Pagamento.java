package simulacaobancaria;

public class Pagamento implements Transacao {

    // Implementa o método executar da interface Transacao
    @Override
    public void executar(Conta conta, double valor) {
        System.out.println("Saque de R$" + valor); // exibe a operação de saque
        conta.sacar(valor); // realiza o saque na conta passada como parâmetro
    }
}
