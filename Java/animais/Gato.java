package atividade;

import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal { // classe Gato herda de Animal
	public Gato(String nome) { // construtor recebe o nome do gato
		super(nome); // chama o construtor da superclasse
		System.out.println(nome); // imprime o nome do gato
	}

	@Override
	public void emitirSom() { // implementação do som específico do gato
		System.out.println("Miar");
	}
	
	public static void main(String[] args) {
		List<Animal> animais = new ArrayList<>(); // lista de animais
		
		animais.add(new Gato("Kakau")); // adiciona um gato à lista
		
		for (Animal a : animais) { // percorre a lista de animais
			a.emitirSom(); // chama o som do animal
			a.dormir();    // chama o método dormir da superclasse
		}
	}

}
