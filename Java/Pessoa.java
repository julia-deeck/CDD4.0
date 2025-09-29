package JavaPOO;

public class Pessoa {
	String nome;    // armazena o nome da pessoa
	int idade;      // armazena a idade da pessoa
	double altura;  // armazena a altura da pessoa
	String genero;  // armazena o gênero da pessoa
	
	public void comer(String comida) { // método que recebe o nome de um alimento
		System.out.printf("%s começou a comer %s", nome, comida); // exibe no console quem começou a comer o alimento
	}
}
