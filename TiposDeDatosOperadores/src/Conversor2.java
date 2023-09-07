import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor2 {
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

        // realizar la conversion con duble
        double tasaDeCambio = 1.07; // tasa de cambio conversion euros a dolares
        double dolares = euros  * tasaDeCambio;
        System.out.println("La cantidad de euros: " + euros + " equivalen a " + dolares + " dólares");

        // convertir la tasa de cambio a BigDecimal para mejorar la precision
        String euroString = Double.toString(euros);
        BigDecimal eurosBigDecimal = new BigDecimal(euroString);

        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCAmbioBigDecimal = new BigDecimal(tasaDeCambioString);

        BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCAmbioBigDecimal);
        System.out.println("La cantidad de euros: " + euros + " equivalen a " + dolaresBigDecimal.toString() + " dólares");

    }
}
