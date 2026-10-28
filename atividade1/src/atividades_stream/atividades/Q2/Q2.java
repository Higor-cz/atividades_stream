package steams.atividades.Q2;

import java.util.List;

public class Q2 {

    static void main() {
        uppercase();


    }

    static void uppercase() {
        List<String> nomes = List.of("higor","eric","caio","lara vivian");

        List<String> maiusculo = nomes
                .stream()
                .map(n -> n.toUpperCase())
                .toList();
        System.out.println("Números Pares: "+maiusculo);
    }
}
