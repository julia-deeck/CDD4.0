package imprimivel;

public class Relatorio implements Imprimivel {
    @Override
    public void imprimir() { // implementação do método imprimir da interface Imprimivel
        System.out.println("Imprimindo relatório..."); // exibe mensagem indicando que o relatório está sendo impresso
    }
}
