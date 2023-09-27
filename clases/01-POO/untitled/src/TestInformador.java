public class TestInformador {
    public static void main(String[] args) {
        // Crear una instancia de la clase informador
        Informador informador = new Informador();

        // probar un entero
        informador.mostrarPorPantalla(1);

        // probar un decimal
        informador.mostrarPorPantalla(55.55);

        //probar una palabra
        informador.mostrarPorPantalla("Hello!");

        // probar dos palabras
        informador.mostrarPorPantalla("Hola", "verde");
    }
}
