import java.util.ArrayList;
import java.util.Random;
public class GeneradorPedidos {

    // Constantes para los tipos de pedidos
    // private es un modificador de acceso que dice que la constante es accesible solo dentro de la clase donde se define
    // static indica que pertenece a la clase y no a una instancia en particular. Se puede acceder sin crear una instancia o un objeto.
    // final significa que no se puede cambiar su valor
    private static final String ENTRADA = "Entrada de";
    private static final String PLATO_PRINCIPAL = "Plato principal de";
    private static final String POSTRE = "Postre de";
    private static final String BEBIDA = "Bebida de";
    private static final String COMBO = "Combo de";

    // Metodo auxiliar para obtener el numero aleatorio
    private int obtenerIntAleatorio(int min, int max) {
        Random random = new Random(); // creamos una nueva instancia del objto de la clase Random
        return random.nextInt(max - min + 1) + min;
    }

    // Metodo principal para obtener pedidos
    public ArrayList<String> obtenerPedidos(int numeroPedidos) {
        ArrayList<String> pedidos = new ArrayList<>();
        String[] platos = {"pollo", "pasta", "ensalada", "sopa", "hamburguesas", "pizza"};

        for (int i = 0; i < numeroPedidos; i++) {
            int tipoPedido = obtenerIntAleatorio(1, 5);
            String descipcionPedido;

            switch (tipoPedido) {
                case 1:
                    descipcionPedido = ENTRADA;
                    break;
                case 2:
                    descipcionPedido = PLATO_PRINCIPAL;
                    break;
                case 3:
                    descipcionPedido = POSTRE;
                    break;
                case 4:
                    descipcionPedido = BEBIDA;
                    break;
                default:
                    descipcionPedido = COMBO;
            }

            int platoAleatorio = obtenerIntAleatorio(0, platos.length -1);
            String pedido = descipcionPedido + " " + platos[platoAleatorio];
            pedidos.add(pedido);
        }
        return pedidos;
    }

    public static void main(String[] args) {
        GeneradorPedidos generador = new GeneradorPedidos();
        ArrayList<String> listaPedidos = generador.obtenerPedidos(5);
        for (String pedido : listaPedidos) {
            System.out.println(pedido);
        }
        System.out.println(listaPedidos);
    }
}
