public class OperadoresRelaciones {
    public static void main(String[] args) {
        int numeroUno = 5;
        int numeroDos = 10;

        boolean esMayor = numeroUno > numeroDos; // > mayor que
        boolean esMenor = numeroUno < numeroDos; // < menor que

        System.out.println("5 es mayor que 10? " + esMayor);
        System.out.println("5 es menor que 10? " + esMenor);

        // mayor o igual que y menor o igual que

        int valorUno = 8;
        int valorDos = 8;

        boolean esMayorOIgual = valorUno >= valorDos;
        boolean esMenorOIgual = valorUno <= valorDos;

        System.out.println("8 es mayor o igual a 8 " + esMayorOIgual);
        System.out.println("8 es menor o igual a 8 " + esMenorOIgual);

        // == igual o != diferente

        double valorA = 3.14;
        double valorB = 2.71;

        boolean sonIguales = valorA == valorB;
        boolean sonDiferentes = valorA != valorB;

        System.out.println("3.14 es igual a 2.71: " + sonIguales);
        System.out.println("3.14 es diferente a 2.71: " + sonDiferentes);

        // comparamos Strings

        String cadenaA = "hola";
        String cadenaB = "hola";

        boolean sonIgualesStrings = cadenaA == cadenaB;
        boolean sonDiferentesStrings = cadenaA != cadenaB;

        System.out.println("hola es igual a hola: " + sonIgualesStrings);
        System.out.println("hola es diferente de hola: " + sonDiferentesStrings);

        // ejemplo

        int edad = 17;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad"); // ejecutar solo si es verdadero
        } else {
            System.out.println("Eres menor de edad"); // sino se cumple ninguna condicion se ejecuta este valor
        }
    }
}
