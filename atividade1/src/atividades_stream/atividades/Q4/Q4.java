package steams.atividades.Q4;

import java.util.List;

public class Q4 {
    static void main() {
        maiorQue10();

    }

    static void maiorQue10() {
        List<Integer> numeros = List.of(4,25,32,78,45,13,10,77,58,61,52);

        long maioresQueDez = numeros
                .stream()
                .filter(n-> n > 10).count();

        System.out.println("Quantidade de números maiores que 10: "+maioresQueDez);
    }

}
