public class Libro {
    // variables de instancia o atributos
    String titulo;
    String autor;
    int paginas;

    // metodos
    void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas" + paginas);
    }

    void leer(int paginasLeidas) {
        System.out.println("Has leido: " + paginasLeidas + " paginas de " + titulo);
    }
}

