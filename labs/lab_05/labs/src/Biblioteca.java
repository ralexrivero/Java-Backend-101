import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void prestarLibro(Libro libro, Persona persona) {
        Prestamo prestamo = new Prestamo(libro, persona);
        prestamos.add(prestamo);
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }
}
