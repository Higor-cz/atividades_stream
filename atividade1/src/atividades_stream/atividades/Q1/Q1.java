package steams.atividades.Q1;

import java.util.List;

public class Q1 {
    static void main() {
        pares();

    }

    static void pares() {
        List<Integer> numeros = List.of(4,25,32,78,45,13,10,77,58,61,52);

        List<Integer> pares = numeros
                .stream()
                .filter(n-> n%2 == 0)
                .toList();
        System.out.println("Números Pares: "+pares);
    }
}
