public class TestBiblioteca {
    public static void main(String[] args) {
        // Crear autores
        Autor autor1 = new Autor("J.K. Rowling", "31/07/1965", "Britanica");
        Autor autor2 = new Autor("J.R.R. Tolkien", "03/01/1892", "Britanica");

        // Crear libros
        Libro libro1 = new Libro("Harry Potter", autor1, 1997, "9787074753274");
        Libro libro2 = new Libro("El Señor de los Anillos", autor2, 1954, "9780007525546");

        // Crear personas
        Persona persona1 = new Persona("Mustafa", "P001");
        Persona persona2 = new Persona("Any", "P002");

        // Crear biblioteca y agregar libros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Mostrar los libros de la biblioteca
        System.out.println("Catalogo de libros:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro);
        }

        // Buscar libro
        String tituloBuscado = "Harry Potter";
        Libro libroBuscado = biblioteca.buscarLibroPorTitulo(tituloBuscado);
        if (libroBuscado != null) {
            System.out.println("Libro encontrado: " + libroBuscado);
        } else {
            System.out.println("Libro no encontrado: " + libroBuscado);
        }

        // Prestar libros
        biblioteca.prestarLibro(libro1, persona1);
        biblioteca.prestarLibro(libro2, persona2);

        // Prestamos actuales
        System.out.println("\nPréstamos actuales:");
        for (Prestamo prestamo : biblioteca.getPrestamos()) {
            System.out.println(prestamo);
        }
    }
}
