import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        // implementacion del conversor de euros a dolares
        // realizar la conversion de moneda
        // aplicar una mayor precision

        // solicitar informacion al usuario
        System.out.println("Bienvenido al conversor de euros a dolares");
        System.out.println("Ingresa la cantidad de euros y recibirá la conversión en dolares");

        // leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        double euros = scanner.nextDouble();

        // realizar la conversion
        double tasaDeCambio = 1.07; // tasa de cambio conversion euros a dolares
        double dolares = euros  * tasaDeCambio;

        // mostrar el resultado
        System.out.println("La cantidad de euros: " + euros + " equivalen a " + dolares + " dólares");
        // el resultado tiene problemas de precision, pero funciona
    }
}
