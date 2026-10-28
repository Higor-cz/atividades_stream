package steams.atividades.Q10;

import java.util.List;

public class Q10 {

    static void main() {
        somar();
    }

    static void somar() {
        List<Pedido> pedidos = List.of(new Pedido(1001,13.54),new Pedido(1003,4.54),new Pedido(1004,22.13),new Pedido(1005,41.04));

        Double soma = pedidos
                .stream()
                .mapToDouble(n->n.getValor())
                .sum();


        System.out.println("Soma dos pedidos: "+soma);
    }
}
