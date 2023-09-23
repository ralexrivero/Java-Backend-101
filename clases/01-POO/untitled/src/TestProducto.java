public class TestProducto {
    public static void main(String[] args) {
        // Crear una instancia
        Producto laptop = new Producto("Laptop Acer", 1200.0);

        //Mostrar detalles del producto
        laptop.establecerPrecio(1000.0);
        System.out.println("Nuevo precio es: U$S: " + laptop.mostrarPrecio());
    }
}
