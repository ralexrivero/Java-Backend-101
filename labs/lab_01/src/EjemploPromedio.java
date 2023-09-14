public class EjemploPromedio {
    public static void main(String[] args) {
        double[] calificaciones = {90.0, 88.3, 99.5, 77.8, 80.0, 90.1, 79.0}; // arreglo
        double total = 0.0; // variable
        double promedio = 0.0; // variable

        for (double calificacion : calificaciones) {
            total += calificacion;
        }

        promedio = total / calificaciones.length;
        System.out.println("El promedio es: " + promedio);

    }
}
