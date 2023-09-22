public class TestLibro {
    public static void main(String[] args) {
        // Creo la instancia de la clase Libro
        Libro libroHarryPotter = new Libro();
        libroHarryPotter.titulo = "Harry Potter y la piedra Filosofal";
        libroHarryPotter.autor = "J.K. Rowling";
        libroHarryPotter.paginas = 320;

        // uso metodos del objeto
        libroHarryPotter.mostrarInfo();
        libroHarryPotter.leer(50);
    }
}
