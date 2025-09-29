package imprimivel;

public class Contrato implements Imprimivel {
    @Override
    public void imprimir() { // implementação do método imprimir da interface Imprimivel
        System.out.println("Imprimindo contrato..."); // exibe mensagem ao imprimir
    }
}
