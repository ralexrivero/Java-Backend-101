import java.util.ArrayList;

public class GestorDeAlumnos {
    /*
        maneja la logica de seleccionar expositores y la lista de alumnos
     */
    private ArrayList<Alumno> alumnos;
    private ArrayList<Alumno> alumnosSinExponer;
    private static final String FILENAME = "alumnos.dat";

    public GestorDeAlumnos() {
        this.alumnos = cargarAlumnos();
        this.alumnosSinExponer = new ArrayList<>(alumnos);
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
        alumnosSinExponer.add(alumno);
    }

    public Alumno seleccionarExpositor() {

    }

    public ArrayList<Alumno> getAlumnos() {

    }

    public void guardarAlumnos() {

    }

    private ArrayList<Alumno> cargarAlumnos() {

    }
}
