import java.util.ArrayList;

public class Producto {
    private String nombre; // atributo nombre del producto
    private double precio; // atributo del precio del producto

    // constructor de la clase
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Metodo para mostrar la info del producto
    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " - Precio $" + precio);
    }
}

// Clase Tienda

class Tienda {
    private String nombreTienda; // nombre de la tienda
    private ArrayList<Producto> productos; // Lista para guardar los productos

    // constructor de la clase
    public Tienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
        this.productos = new ArrayList<>();
    }
    // metodo para agregar un producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // metodo para mostrar los productos de la tienda
    public void mostrarProductos() {
        System.out.println("Productos en " + nombreTienda + ":");
        for (Producto producto : productos) {
            producto.mostrarProducto();
        }
    }
}
