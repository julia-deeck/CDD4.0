package imprimivel;

import java.util.ArrayList;
import java.util.List;

public class TesteImprimivel {
    
    public static void main(String[] args) {
        List<Imprimivel> documentos = new ArrayList<>(); // cria uma lista de objetos que implementam Imprimivel
        
        documentos.add(new Relatorio()); // adiciona um relatório à lista
        documentos.add(new Contrato());  // adiciona um contrato à lista
        documentos.add(new Curriculo()); // adiciona um currículo à lista
        
        for (Imprimivel doc : documentos) { // percorre todos os documentos na lista
            doc.imprimir(); // chama o método imprimir de cada documento
        }
    }
}
