public class EjemploCadena {
    public static void main(String[] args) {
        String frase = "Aprender Java es muy facil";

        // demostracion de metodos del tipo String

        String fraseMayus = frase.toUpperCase();
        System.out.println(fraseMayus);
        String fraseRemplazo = fraseMayus.replace("FACIL", "DIVERTIDO" );
        System.out.println("Original: " + frase);
        System.out.println("Modificado: " + fraseRemplazo);
    }
}
