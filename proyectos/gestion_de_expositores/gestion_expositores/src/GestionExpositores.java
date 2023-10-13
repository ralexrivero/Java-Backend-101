import java.util.Scanner;

public class GestionExpositores {
    /*
        Interactua con el usuario a traves de la linea de comandos y se relaciona con la otras clases
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorDeAlumnos gestor = new GestorDeAlumnos();
        Alumno ultimoExpositor = null;

        // linea de comandos
        while (true) {
            System.out.println("1. Agregar alumno");
            System.out.println("2. Seleccionar expositor");
            System.out.println("3. Agregar notal al último expositor");
            System.out.println("4. Ver lista de alumnos");
            System.out.println("5. Modificar nombre de un alumno");
            System.out.println("6. Salir");

            int opcion;
            while (true) {
                try {
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } catch (Exception e) {
                    scanner.nextLine();
                    System.out.println("Por favor, ingrese una opción válida");
                }
            }

            switch (opcion) {
                case 1:
                    // agregar alumno
                    System.out.println("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    // crear un nuevo alumno
                    gestor.agregarAlumno(new Alumno(nombre));
                    gestor.guardarAlumnos();
                    break;
                case 2:
                    // seleccionar expositor
                    ultimoExpositor = gestor.seleccionarExpositor();
                    System.out.println("Se selecciono exitosamente el expositor: " + ultimoExpositor.getNombre());
                    break;
                case 3:
                    // agregar nota al ultimo
                    if (ultimoExpositor == null) {
                        System.out.println("Primero debes seleccionar un expositor");
                    } else {
                        System.out.print("Ingresa la nota para: " + ultimoExpositor.getNombre() + ": ");
                        double nota;
                        while (true) {
                            try {
                                nota = scanner.nextDouble();
                                scanner.nextLine();
                                break;
                            } catch (Exception e) {
                                scanner.nextLine(); // consumo el input incorrecto
                                System.out.print("Intente nuevamente con un numero valido para la nota: ");
                            }
                        }
                        ultimoExpositor.agregarNota(nota);
                        System.out.println("Nota agregada correctamente");
                    }
                    break;
                case 4:
                    // ver lista de alumnos
                    System.out.println("Listado de alumnos:");
                    for (Alumno alumno : gestor.getAlumnos()) {
                        System.out.println(alumno);
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el nombre actual del alumno: ");
                    String nombreAntiguo = scanner.nextLine();
                    System.out.print("Ingrese el nuevo nombre del alumno: ");
                    String nuevoNombre = scanner.nextLine();
                    gestor.modificarNombreAlumno(nombreAntiguo, nuevoNombre);
                    gestor.guardarAlumnos();  // Guardar alumnos después de modificar el nombre
                    System.out.println("Nombre modificado correctamente.");
                    break;
                case 6:
                    // salir
                    System.out.println("Programa finalizado...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
