import java.util.Scanner;

public class JuegoAdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroPensado = 18;

        System.out.println("Adivina un numero entre el 1 y el 20");
        int numeroIntroducido = scanner.nextInt();

        if (numeroIntroducido == numeroPensado) {
            System.out.println("\033[0;32mAcertaste el numero elegido");
        } else {
            System.out.println("\033[0;31mSegui participando!");
        }
    }
}
