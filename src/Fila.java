public class Fila {

    private final Pedido[] pedidos;
    private int tamanho;

    public Fila(int capacidade) {
        pedidos = new Pedido[capacidade];
        tamanho = 0;
    }

    public boolean cadastrar(Pedido pedido) {
        if (tamanho >= pedidos.length) {
            System.out.println(" a fila de pedidos está cheia (capacidade = " + pedidos.length + ")");
            return false;
        }
        pedidos[tamanho++] = pedido;
        return true;
    }

    public Pedido descadastrar() {
        if (tamanho == 0) {
            return null;
        }

        Pedido removerPedido = pedidos[0];

        for (int i = 0; i < tamanho - 1; i++) {
            pedidos[i] = pedidos[i + 1];
        }

        pedidos[--tamanho] = null;
        
        return removerPedido;
    }

    public void verFila() {
        if (tamanho == 0) {
            System.out.println("    a fila de pedidos está vazia.");
            return;
        }
        System.out.println("--------------------- fila de pedidos (" + tamanho + " pedidos) ---------------------");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("posição: [" + i + "] | " + pedidos[i].toString());
        }
        System.out.println("------------------------------------------------------------------");
    }
}