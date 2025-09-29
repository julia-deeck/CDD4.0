package jogo;

public class JogoCorrida implements Jogavel {

    @Override
    public void iniciarJogo() {
        System.out.println("Jogo de Corrida iniciado!"); // implementa o início do jogo
    }

    @Override
    public void encerrarJogo() {
        System.out.println("Jogo de Corrida encerrado!"); // implementa o encerramento do jogo
    }
}
