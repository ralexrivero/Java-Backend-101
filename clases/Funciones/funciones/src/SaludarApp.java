public class SaludarApp {
    public static void saludar(String nombre) {  // (2) aca recibe los argumentos
        System.out.println("¡Hola " + nombre + "!"); // (3) aca usa los argumentos
    }

    public static int areaRectangulo(int largo, int ancho) {
        return largo * ancho;
    }

    public static void mensajePersonalizado(String nombre, String mensaje) {
        System.out.println("Estimado " + nombre + ", " + mensaje);
    }

    public static void main(String[] args) {
        saludar("Pedro"); // Pedro es el argumento que paso (1)
        saludar("Maria");
        saludar("Sofia");

        int rectangulo1 = areaRectangulo(10, 15);
        System.out.println("El area del rectangulo es: " + rectangulo1);        mensajePersonalizado("Jose", "Feliz cumple");
        mensajePersonalizado("Raul", "Suerte en la prueba");
    }
}
