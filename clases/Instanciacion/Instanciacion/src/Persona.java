// Definir la clase Persona
public class Persona {
    // atributos
    String nombre;
    int edad;

    // contructor de la clase
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, me llamo " + nombre + " y tengo " + edad + " años.");
    }
}
