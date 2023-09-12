import java.util.Scanner;

public class RaizCuadradaAproximada {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Por favor, ingrese el numero a calcular la raiz cuadrada: ");

        double numero = scanner.nextDouble();
        double candidato = 0.0;
        int i = 0; // contador

        while (candidato * candidato <= numero) {
            System.out.println("el cuadrado de: " + candidato + " es " + (candidato * candidato));
            candidato += 0.001;
            i++;
        }

        candidato -= 0.001;
        System.out.println("La raiz aproximada es: " + candidato);
        System.out.println("La raiz verdadera: " + Math.sqrt(numero));
        System.out.println("Iteramos " + i + " veces");
    }
}
