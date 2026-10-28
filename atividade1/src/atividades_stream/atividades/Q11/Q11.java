package steams.atividades.Q11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q11 {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Java", "Python", "C", "HTML","CSS", "Stream", "API", "Java"
        );

        Map<Integer, List<String>> grupos = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        grupos.forEach((tamanho, lista) ->
                System.out.println(
                        "Tamanho " + tamanho + ": " + lista
                )
        );
    }
}