public class TestLibroConRetorno {
    public static void main(String[] args) {
        LibroConRetorno LibroHarryPotter2 = new LibroConRetorno();
        LibroHarryPotter2.titulo = "Harry Potter y la piedra Filosofal";
        LibroHarryPotter2.paginas = 320;

        // Acceder al titulo usando el metodo
        System.out.println("El titulo es: " + LibroHarryPotter2.obtenerTitulo());
    }
}
