public class Literales {
    public static void main(String[] args) {
        int enteroDecimal = 100; // en sistema decimal
        int enteroOctal = 0100; // es 64 en sistema decimal
        int enteroHexadecimal = 0x100; // es ... en decimal

        System.out.println("0100 es: " + enteroOctal + " en sistema decimal");
        System.out.println("0x100 es: " + enteroHexadecimal + " en sistema decimal");

        long numeroLong = 100L; // entero de 64bit, es un rango muy grande de numeros

        double numeroDouble = 5.4; // doble precision, 64 bits, con 15 a 17 decimales
        float numeroFloat = 5.4F; // tiene 32 bits, aproximadamente 7 digitos

        int numeroConGuiones = 12_345_678; // para mejorar la legibilidad 12345678

        System.out.println(numeroConGuiones);

        char unChar = 'A'; // un solo caracter
        char unCharUnicode = '\u00a9'; // simbolo de copy en unicode
        System.out.println("Caracter unicode: " + unCharUnicode);

        char comillaSimple = '\'';

        String stringLiteral = "Esto es un string literal";

        boolean booleanoVerdadero = true; //

        String stringNulo = null; // esta variable no contiene ningun objeto, no se puede asignar a un tipo primitivo
    }
}
