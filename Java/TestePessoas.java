package JavaPOO;

public class TestePessoas {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(); // cria um objeto da classe Pessoa
		p1.nome = "Júlia"; // define o nome do objeto como "Júlia"
		p1.comer("Coxinha"); // chama o método comer, informando o alimento "Coxinha"
		p1.exibirAtributos(); // chama o método que exibe os atributos do objeto
	}
}
