package steams.atividades.Q7;

import java.util.List;

public class Q7 {
    static void main() {
        contandoNomes();
    }

    static void contandoNomes() {
        List<String> nomes = List.of("Pedro","Ana","Maria","José","Antonia","Augusto","Carlos","Francisco");

        long contNomes = nomes
                .stream()
                .filter(n -> n.length()> 5)
                .count();
        System.out.println("Quantos nomes são maiores que 5: "+contNomes);
    }
}
