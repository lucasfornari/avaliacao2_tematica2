public class Pedido {
    private final int id;
    private final String nomePedido;

    public Pedido(int id, String nomePedido) {
        this.id = id;
        this.nomePedido = nomePedido;
    }

    public int getId() {
        return id;
    }

    public String getnomePedido() {
        return nomePedido;
    }

    @Override
    public String toString() {
        return "pedido [id: " + id + ", nome: " + nomePedido + "]";
    }
}