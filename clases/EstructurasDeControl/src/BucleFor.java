import java.util.Scanner;

public class BucleFor {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero: ");
        Scanner scanner = new Scanner(System.in);
        int repeticiones = scanner.nextInt();

        for (int i = 1; i <= repeticiones; i++) {
            System.out.println("Esta es la repeticion numero: " + i);
        }

    }
}
