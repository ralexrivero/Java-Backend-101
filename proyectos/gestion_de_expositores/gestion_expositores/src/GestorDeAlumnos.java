import java.io.*;
import java.util.ArrayList;
import java.util.Random;

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
        Random rand = new Random();

        // solo pasa si ya expusieron todos
        if (alumnosSinExponer.isEmpty()) {
            alumnosSinExponer = new ArrayList<>(alumnos);
            for (Alumno a : alumnos) {
                a.setHaSidoSeleccionado(false);
            }
        }

        // elegir un alumno de la lista de alumnos sin exponer
        Alumno expositor = alumnosSinExponer.get(rand.nextInt(alumnosSinExponer.size()));
        // lo saco de lista
        alumnosSinExponer.remove(expositor);
        expositor.setHaSidoSeleccionado(true);
        expositor.incrementarContador();
        return expositor;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void guardarAlumnos() {
        //outpustream
        // Creo el objeto de flujo de salida de datos 'oos'
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(alumnos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<Alumno> cargarAlumnos() {
        // inputstream
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            return (ArrayList<Alumno>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
