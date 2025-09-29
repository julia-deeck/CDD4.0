package atividade;

public abstract class Animal { // classe abstrata que representa um animal genérico
	String nome; // atributo para armazenar o nome do animal
	
	public Animal(String nome) { // construtor que inicializa o nome do animal
		this.nome = nome;
	}

	public abstract void emitirSom(); // método abstrato: cada animal implementará seu som
	
	public void dormir() { // método concreto que pode ser usado por todas as subclasses
		System.out.println("O animal está dormindo");
	}
}
