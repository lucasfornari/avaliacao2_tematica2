import java.util.Scanner;

public class App {

    private static int proximoIdPedido = 1;

    public static void main(String[] args) {
        Fila filaPedidos = new Fila(10); 

        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;

            do {
                System.out.println("\n============== sistema de gerenciamento de pedidos ==============");
                System.out.println("1. fazer um novo pedido (enqueue)");
                System.out.println("2. remover pedido mais antigo (deque)");
                System.out.println("3. ver todos os pedidos na fila");
                System.out.println("0. encerrar o programa");
                System.out.println("=================================================================");
                System.out.print("escolha uma opção: ");

                
                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    System.out.println("opcao invalida, digite um número de 0 a 3.");
                    scanner.nextLine();
                    opcao = -1;
                    continue;
                }

                switch (opcao) {
                    case 1 -> {
                        System.out.print("digite os detalhes do novo pedido: ");
                        String descricao = scanner.nextLine();
                        Pedido novoPedido = new Pedido(proximoIdPedido, descricao);
                        
                        if (filaPedidos.cadastrar(novoPedido)) {
                            System.out.println("pedido " + novoPedido.getId() + " adicionado a fila com sucesso.");
                            proximoIdPedido++;
                        }
                    }
                    case 2 -> {
                        System.out.println("\nprocessando o pedido...");
                        Pedido pedidoProcessado = filaPedidos.descadastrar();
                        
                        if (pedidoProcessado != null) {
                            System.out.println("pedido removido com sucesso: " + pedidoProcessado.toString());
                        } else {
                            System.out.println("a fila está vazia.");
                        }
                    }
                    case 3 -> {
                        filaPedidos.verFila();
                    }
                    case 0 -> {
                        System.out.println("programa finalizado.");
                    }
                    default -> {
                        System.out.println("opcao invalida, digite um número de 0 a 3.");
                    }
                }

            } while (opcao != 0);

        }
    }
}