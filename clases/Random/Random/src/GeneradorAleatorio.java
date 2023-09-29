import java.util.Random;
import java.util.Scanner;

public class GeneradorAleatorio {

    // metodo que genera un numero aleatorio en un rango dado
    public int generarNumeroEnRango(int min, int max) {
        Random random = new Random();
        // min = 3 y max = 7, max - min = 4
        // ajustar el rango + 1 para que incluya el maximo
        // + min desplaza el rango completamente
        // (max - min + 1) + min desplaza el rango
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GeneradorAleatorio generador = new GeneradorAleatorio();

        System.out.println("Ingresa el valor minimo: ");
        int min = scanner.nextInt();

        System.out.println("Ingresa el valor maximo; ");
        int max = scanner.nextInt();

        int numeroAleatorio = generador.generarNumeroEnRango(min, max);
        System.out.println("Numero aleatorio en el rango: " + min + " - " + max + " : " + numeroAleatorio);
    }
}
