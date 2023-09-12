import java.util.Scanner;

public class RaizConDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        // do-while garantiza que el bloque de codigo se ejecuta al menos una vez
        /*
            do {
                // codigo a ejecutar una vez
            } while (condicion) {
                // codigo a ejecutar segun la condicion
            }
         */

        do {
            System.out.println("Introducí el número y te muestro la raiz cuadrada: ");
            System.out.println("Para salir ingresa 0");
            numero = scanner.nextDouble();

            if (numero == 0) {
                System.out.println("Saliendo... ");
            } else {
                System.out.println("La raiz cuadrada de " + numero + " = " + Math.sqrt(numero));
            }
        } while (numero != 0);
    }
}
