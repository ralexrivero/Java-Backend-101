public class InferenciaTiposDemo {
    // inferencia de tipos de datos
    static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        public String mostrarDatos() {
            return " Persona {" +
                    "nombre= " + nombre + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }
    public static void main(String[] args) {
        // usar var para variables inicializadas
        var nombre = "Juan"; // Inferido un String
        var edad = 25; // inferir el tipo int
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        var numero = 3.4;

        // usarlo para un tipo personalizado
        var persona = new Persona("Ana", 30); // infiere a Persona
    }

    // usar var para un bucle
//    var inicio = 0; // infiere como int
//    var fin = 3; // infiere como int
//    for (int i = inicio; i < fin; i++) { // infiere todo como int
//        System.out.println("Iteracion: " + i);
//    }

}
