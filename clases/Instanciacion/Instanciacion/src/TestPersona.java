// Clase principal para probar la instancia
public class TestPersona {
    public static void main(String[] args) {
        // Instanciamos dos objetos
        Persona juan = new Persona("Juan", 45);
        Persona luz = new Persona("Luz", 27);

        // llamamos al metodo presentarse
        juan.presentarse();
        luz.presentarse();
    }
}
