public class Informador {
    // sobrecarga de metodos
    public void mostrarPorPantalla(int entero) {
        System.out.println("Mostrando el entero: " + entero);
    }

    public void mostrarPorPantalla(double decimal) {
        System.out.println("Mostar el decimal: " + decimal);
    }

    public void mostrarPorPantalla(String palabra) {
        System.out.println("Mostrar la palabra: " + palabra);
    }

    public void mostrarPorPantalla(String palabra, String color) {
        System.out.println("Palabra y color son " + palabra + " y " + color);
    }
}
