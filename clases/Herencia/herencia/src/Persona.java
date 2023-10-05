/*
    Modificadores de acceso
    Private: miembro accesible solo dentro de su propia clase
    Default: miembro accesible por cualquier clase dentro del mismo paquete
    Protected: miembro accesible dentro de su propia clase, sub clases y clases en el mismo paquete
    Public: miembro accesible desde cualquier otra clase
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad > 0) {
            this.edad = edad;
        }
    }
}
