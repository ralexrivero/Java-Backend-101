public class Producto {
    // this se refiere al objeto actual en el que se encuentra

    private String nombre; // private indica que estas variables son solo accesibles dentro de la clase Producto
                            // y no desde fuera. Esto encapsula y protege
    private double precio;

    //Constructor que crea e inicializa un objeto del tipo Producto
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void establecerPrecio(double precio) {
        this.precio = precio;
    }

    public double mostrarPrecio() {
        return precio;
    }
}
