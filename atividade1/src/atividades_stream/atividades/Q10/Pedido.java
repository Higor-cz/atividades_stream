package steams.atividades.Q10;

public class Pedido {
    private int id;
    private Double valor;

    public Pedido(){

    }

    public Pedido(int id, Double valor) {
        this.id = id;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", valor=" + valor +
                '}';
    }
}
