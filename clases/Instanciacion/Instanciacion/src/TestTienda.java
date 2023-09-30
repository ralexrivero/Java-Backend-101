// clase Tienda para probar la funcionlidad
public class TestTienda {
    public static void main(String[] args) {
        // Crear instancia de tienda
        Tienda tiendaCentral = new Tienda("Supermercado Central");

        // crear instancias de producto
        Producto producto1 = new Producto("Manzana", 25);
        Producto producto2 = new Producto("Pan", 15);
        Producto producto3 = new Producto("Leche", 34);

        tiendaCentral.agregarProducto(producto1);
        tiendaCentral.agregarProducto(producto2);
        tiendaCentral.agregarProducto(producto3);

        tiendaCentral.mostrarProductos();
    }
}

