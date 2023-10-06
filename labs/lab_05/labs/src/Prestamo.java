import java.util.Date;
public class Prestamo {
    private Libro libro;
    private  Persona persona;
    private Date fechaPrestamo;

    public Prestamo(Libro libro, Persona persona) {
        this.libro = libro;
        this.persona = persona;
        this.fechaPrestamo = new Date(); // hora y fecha actuales
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "libro: " + libro +
                ",  persona: " + persona +
                ", fecha prestamo: " + fechaPrestamo +
                '}';
    }
}
