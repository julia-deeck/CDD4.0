package simulacaobancaria;

// Interface que define uma transação bancária
public interface Transacao {
    // Método que executa a transação em uma conta com um determinado valor
    void executar(Conta conta, double valor);
}
