import java.util.Scanner;

public class CalificacionEnLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la calificacion entre 0 y 100");
        int calificacion = scanner.nextInt();

        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Introduzca una nota valida (entre 0 y 100)");
            return;
        }

        switch (calificacion / 10) {
            case 10:
            case 9:
                System.out.println("Su calificacion es de A");
                break;
            case 8:
                System.out.println("Su calificacion es de B");
                break;
            case 7:
                System.out.println("Su calificacion es de C");
                break;
            case 6:
                System.out.println("Su calificacion es de D");
                break;
            default:
                System.out.println("Su calificacion es de F");
        }
    }
}
