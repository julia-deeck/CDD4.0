package aula3;

public class exercicio5 {

    public static void main(String[] args) {
        String palavras[] = {"a", "vida", "é", "bela"}; // array com as palavras da frase
        String fraseYoda = ""; // string que armazenará a frase invertida

        // percorre o array de trás para frente
        for (int i = palavras.length - 1; i >= 0; i--) {
            fraseYoda += palavras[i].toUpperCase(); // adiciona a palavra em maiúsculas
            if (i != 0) {
                fraseYoda += " "; // adiciona espaço entre palavras, exceto após a última
            }
        }

        System.out.println(fraseYoda); // exibe a frase invertida
    }

}
