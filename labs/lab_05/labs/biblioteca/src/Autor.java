public class Autor {
    private String nombre;
    private String fechaNacimiento;
    private String nacionalidad;

    public Autor(String nombre, String fechaNacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ", nacido el " + fechaNacimiento + ") ";
    }
}
