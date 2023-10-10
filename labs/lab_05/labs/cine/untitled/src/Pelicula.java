import java.util.List;

public class Pelicula {
    private String titulo;
    private int duracion; // en minutos
    private String clasificacion;
    private List<String> horarios;

    // Constructor
    public Pelicula(String titulo, int duracion, String clasificacion, List<String> horarios) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.horarios = horarios;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public List<String> getHorarios() {
        return horarios;
    }
}
