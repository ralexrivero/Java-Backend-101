import java.util.Scanner;

public class DivisionConTernario {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitar numero
        System.out.println("Introduce el dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.println("Introduce el divisor: ");
        int divisor = scanner.nextInt();

        /*
        double resultado;
        if (divisor == 0) {
            resultado = 0;
        } else {
            resultado = dividendo / divisor;
        }
        */

        double resultado = divisor == 0 ? 0: (double) dividendo / divisor;

        System.out.println("resultado: " + dividendo + " entre " + divisor + " : " + resultado);

    }
}
