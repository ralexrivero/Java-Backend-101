import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero a calcualr la raiz cuadrada: ");

        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextInt();
        double candidato = 0.0;
        int i = 0;

        while (candidato * candidato <= numero) {
            candidato += 0.0001;
            i++;
        }
//        candidato -= 0.001;
        System.out.println("La raiz cuadrada de " + numero + " es " + candidato);
        System.out.println("Esta operacion llevo " + i + " iteraciones");
    }
}
