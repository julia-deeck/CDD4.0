package atividade;

import java.util.ArrayList;
import java.util.List;

public class Cachorro extends Animal { // classe Cachorro herda de Animal
	public Cachorro(String nome) { // construtor recebe o nome do cachorro
		super(nome); // chama o construtor da superclasse
		System.out.println(nome); // imprime o nome do cachorro
	}

	@Override
	public void emitirSom() { // implementação do som específico do cachorro
		System.out.println("Latir");
	}
	
	public static void main(String[] args) {
		List<Animal> animais = new ArrayList<>(); // lista de animais
		
		animais.add(new Cachorro("Tafarel")); // adiciona um cachorro à lista
		
		for (Animal a : animais) { // percorre a lista de animais
			a.emitirSom(); // chama o som do animal
			a.dormir();    // chama o método dormir da superclasse
		}
	}

}
