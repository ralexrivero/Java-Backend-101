

// clase Autor

class Autor {
    String nombre;
    String fechaNacimiento;
    String nacionalidad;

    public Autor(String nombre, String fechaNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }
}

// clase libro

class Libro {
    String titulo;
    Autor autor;

    int anioPublicacion;
    String ISBN;

    public Libro (String titulo, )
        this.titulo = titulo;
}

// Biblioteca

class Biblioteca {
    lista de libros;

    public Biblioteca() {
        crear la lista de la biblioteca
    }

    public void agregarLibro(Libro libro) {

    }

    public void eliminarLibro(Libro libro) {
        libros remover
    }

    public Libro buscarLibro(String ISBN)
        for

    if para controlar si lo encuentro y hacer algo
}


// clase para testear

public class TestBiblioteca {
    main P
            Autor autor1 = new Autor("Jose", "24/09/1980", "Uruguaya");
            Autor autor2 = new Autor("Maria", "24/09/1980", "Uruguaya");

            Libro libro1 = new Libro("Intro a Java", autor1, ;

            Biblioteca biblioteca = new Biblioteca();
            biblioteca.agregarLibro(libro1)
}