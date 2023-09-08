import java.util.Scanner;

public class AnalizarUnNumero {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que escriba un numero
        System.out.println("Ingresá un número y recibiras información sobre el: ");

        // leer el numero
        int numeroIngresado = scanner.nextInt();

        // comprobar las condiciones con if-else-if
        if (numeroIngresado < 3) {
            System.out.println("En numero es menor a tres");
        } else if (numeroIngresado < 5){
            System.out.println("En numero esta en 3 y 5");
        } else if (numeroIngresado < 7) {
            System.out.println("En numero esta entre 5 y 7");
        } else {
            System.out.println("En numero es mayor o igual que 7");
        }
    }
}
