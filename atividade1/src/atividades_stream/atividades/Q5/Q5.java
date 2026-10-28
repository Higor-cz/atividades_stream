package steams.atividades.Q5;

import java.util.List;

public class Q5 {
    static void main() {
        alfa();
    }

    static void alfa() {
        List<String> nomes = List.of("Pedro","Ana","Maria","José","Antonia","Augusto","Carlos","Francisco");

        List<String> ordem = nomes
                .stream()
                .filter(n -> n.startsWith("A"))
                .sorted()
                .toList();
        System.out.println("Nomes com A em ordem: "+ordem);
    }

}
