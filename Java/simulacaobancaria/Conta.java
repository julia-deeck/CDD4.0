package simulacaobancaria;

public abstract class Conta {
	protected String numero; // número da conta
	protected double saldo;   // saldo atual da conta
	
	public Conta(String numero, double saldo) { // construtor que inicializa número e saldo
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) { // método para depositar valores na conta
		if (valor > 0) { // verifica se o valor é positivo
			saldo += valor; // adiciona o valor ao saldo
			System.out.println("Depósito no valor de R$" + valor + " realizado com sucesso");
		} else {
			System.out.println("Valor inválido para depósito"); // mensagem caso valor seja negativo ou zero
		}
	}
	
	public void sacar(double valor) { // método para sacar valores da conta
		if (valor > 0 && valor <= saldo) { // verifica se o valor é positivo e suficiente no saldo
			saldo -= valor; // subtrai o valor do saldo
			System.out.println("Saque de R$" + valor + " realizado com sucesso");
		} else {
			System.out.println("Saldo insuficiente ou valor inválido para saque"); // mensagem em caso de erro
		}
	}
	
	public void exibirSaldo() { // método para exibir saldo e número da conta
		System.out.println("Conta: " + numero + " | Saldo atual: R$" + saldo);
	}
	
	// getters
	public String getNumero() {
		return numero; // retorna o número da conta
	}
	
	public double getSaldo() {
		return saldo; // retorna o saldo atual
	}
}
