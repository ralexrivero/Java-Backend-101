// enumeracion para los dias de la semana
public class Actividad {
    private DiaSemana dia;
    private String tarea;

    public Actividad(DiaSemana dia, String tarea) {
        this.dia = dia;
        this.tarea = tarea;
    }

    public void mostrarActividad() {
        System.out.println("El dia " + dia + ", la actividad es: " + tarea);
    }

    public static void main(String[] args) {
        // crear objetos de clase Actividad
        Actividad actividad1 = new Actividad(DiaSemana.LUNES, " ir al gimnasio");
        Actividad actividad2 = new Actividad(DiaSemana.MIERCOLES, " estudiar JAVA");
        Actividad actividad3 = new Actividad(DiaSemana.VIERNES, " salir a correr por la rambla");
        Actividad actividad4 = new Actividad(DiaSemana.VIERNES, " la ducha despues de correr");

        // mostrar informacion
        actividad1.mostrarActividad();
        actividad2.mostrarActividad();
        actividad3.mostrarActividad();
        actividad4.mostrarActividad();
    }
}
