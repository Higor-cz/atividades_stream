package steams.atividades.Q3;

import java.util.ArrayList;
import java.util.List;

public class Q3 {

    static void main() {
        dobro();

    }

    static void dobro() {
        List<Integer> numeros = List.of(4,25,32,78,45,13,10,77,58,61,52);

        numeros.forEach(n -> System.out.println(n*2));


    }

}
