package steams.atividades.Q9;

import java.util.List;

public class Q9 {static void main() {

    String resultado = positivo() ? "TODOS OS NÚMEROS SÃO POSITIVOS" : "TODOS OS NÚMEROS SÃO NEGATIVOS";

    System.out.println(resultado);
}

    static boolean positivo() {
        List<Integer> numeros = List.of(4,14,21,31,51,123,13);

        boolean todosPos = numeros
                .stream()
                .allMatch(n-> n > 0);
        return todosPos;
    }
}
