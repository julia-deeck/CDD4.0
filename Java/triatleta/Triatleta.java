package triatleta;

public class Triatleta implements Nadador, Corredor {

    @Override
    public void nadar() { // implementação do método da interface Nadador
        System.out.println("O triatleta está nadando!");
    }

    @Override
    public void correr() { // implementação do método da interface Corredor
        System.out.println("O triatleta está correndo!");
    }

    public void competir() { // método que combina as habilidades de nadar e correr
        System.out.println("O atleta está competindo");
        nadar(); // chama o método nadar
        correr(); // chama o método correr
    }

    public static void main(String[] args) { // método principal para testar a classe
        Triatleta t = new Triatleta(); // cria um objeto Triatleta
        t.competir(); // executa a competição
    }
}
