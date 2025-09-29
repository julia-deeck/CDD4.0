package jogo;

public class TesteJogos {

    public static void main(String[] args) {
        Jogavel jogo1 = new JogoRPG();       // cria uma instância de JogoRPG como Jogavel
        Jogavel jogo2 = new JogoCorrida();   // cria uma instância de JogoCorrida como Jogavel

        jogo1.iniciarJogo();                 // inicia o jogo RPG
        jogo2.iniciarJogo();                 // inicia o jogo Corrida

        jogo1.encerrarJogo();                // encerra o jogo RPG
        jogo2.encerrarJogo();                // encerra o jogo Corrida
    }

}
