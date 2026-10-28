package steams.atividades.Q8;

import java.util.List;

public class Q8 {static void main() {
    maior();
}

    static void maior() {
        List<Pessoa> pessoas = List.of(new Pessoa("Pedro",19),new Pessoa("Caio", 18),new Pessoa("Eric", 23),new Pessoa("Higor",27),new Pessoa("Lara",21),new Pessoa("Maria",17));

        List<Pessoa> maiores = pessoas
                .stream()
                .filter(n -> n.getIdade()>=18)
                .toList();
        System.out.println("Maiores de Idade: "+maiores);
    }
}
