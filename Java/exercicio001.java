package aula3;

public class exercicio1 {

    public static void main(String[] args) {
        String str = "   texto para retirar espaços no início e fim  "; // string com espaços extras no início e no fim
        String resultado = str.trim(); // remove os espaços em branco no início e no fim da string
        System.out.println(resultado); // exibe a string resultante sem os espaços
    }

}
