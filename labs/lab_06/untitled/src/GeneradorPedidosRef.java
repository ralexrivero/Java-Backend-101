import java.util.ArrayList;
import java.util.Random;

public class GeneradorPedidosRef {
    // generador de pedidos aleatorios
    // Refactorizacion del codigo GeneradorPedidos

    // Constantes para los tipos de pedidos
    private static final int ENTRADA = 1;
    private static final int PLATO_PRINCIPAL = 2;
    private static final int POSTRE = 3;
    private static final int BEBIDA = 4;
    private static final int COMBO = 5;

    // Listas de platos por categoria usando arrays
    private String[] entradas = {"ensalada", "sopa", "tostadas", "degustacion de olivas"};
    private String[] platosPrincipales = {"pollo", "pasta", "hamburguesa", "pizza"};
    private String[] postres = {"pastel", "helado", "flan"};
    private String[] bebidas = {"agua", "refresco", "jugo"};
    private String[] combos = {"Combo pollo + refresco", "Combo pizza + jugo", "Combo hamburguesa + agua"};

    // Metodo auxiliar para obtener el numero aleatorio entre 1 y 5
    private int obtenerIntAleatorio(int min, int max) {
        Random random = new Random(); // creamos una nueva instancia del objto de la clase Random
        return random.nextInt(max - min + 1) + min;
    }

    // Metodo para obtener pedidos
    public ArrayList<String> obtenerPedidos(int numeroPedidos) {
        ArrayList<String> pedidos = new ArrayList<>();

        for (int i = 0; i < numeroPedidos; i++) {
            int tipoPedido = obtenerIntAleatorio(1, 5);
            String descripcionPedido;

            switch (tipoPedido) {
                case ENTRADA:
                    descripcionPedido = "Entrada de " + entradas[obtenerIntAleatorio(0, entradas.length - 1)];
                    break;
                case PLATO_PRINCIPAL:
                    descripcionPedido = "Plato principal de " + platosPrincipales[obtenerIntAleatorio(0, platosPrincipales.length - 1)];
                    break;
                case POSTRE:
                    descripcionPedido = "Postre de " + postres[obtenerIntAleatorio(0, postres.length - 1)];
                    break;
                case BEBIDA:
                    descripcionPedido = "Bebida de " + bebidas[obtenerIntAleatorio(0, bebidas.length - 1)];
                    break;
                default:
                    descripcionPedido = combos[obtenerIntAleatorio(0, combos.length - 1)];
            }
            pedidos.add(descripcionPedido);
        }
        return pedidos;
    }

    // punto de entrada main
    public static void main(String[] args) {
        GeneradorPedidosRef generador = new GeneradorPedidosRef();
        ArrayList<String> listaPedidos = generador.obtenerPedidos(10);
        int aleatorio = generador.obtenerIntAleatorio(5, 15);
        System.out.println(aleatorio);

        for (String pedido : listaPedidos) {
            System.out.println(pedido);
        }
    }
}
