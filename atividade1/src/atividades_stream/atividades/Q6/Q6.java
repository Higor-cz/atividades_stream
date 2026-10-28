package steams.atividades.Q6;

import java.util.List;

public class Q6 {

    static void main() {
        maximo();

    }

    static void maximo() {
        List<Integer> numeros = List.of(4,25,32,78,45,13,10,77,58,61,52);

        int maior = numeros.stream().mapToInt(n->n).max().orElse(0);
        System.out.println("Maior número: "+maior);
    }
}
