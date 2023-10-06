public class Libro {
    private String titulo;
    private Autor autor;
    private int anoPublicacion;
    private String isbn;

    public Libro(String titulo, Autor autor, int anoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.isbn = isbn;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }
    @Override
    public String toString() {
        return titulo + " por " + autor.getNombre() + " (" + anoPublicacion + ")";
    }
}
