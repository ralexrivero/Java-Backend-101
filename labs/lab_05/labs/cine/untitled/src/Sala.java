public class Sala {
    private int numero;
    private int capacidad;
    private Pelicula pelicula;

    // Constructor
    public Sala(int numero, int capacidad, Pelicula pelicula) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.pelicula = pelicula;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
}
