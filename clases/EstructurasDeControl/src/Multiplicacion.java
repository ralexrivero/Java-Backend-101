import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int primerNumero = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int segundoNumero = scanner.nextInt();

        int resultado = 0;

        /*
            for:
            inicializacion: es la variable inicial (i)
            condicion: lo que se tiene que cumplir para continuar iterando (repitiendo el ciclo)
            incremento/decremento: como cambia la variable de control despues de iterar
         */

        for (int i = 0; i < segundoNumero; i++) {
            resultado += primerNumero;
        }

        System.out.println("El resultado de multiplicar " + primerNumero + " por " + segundoNumero + " = " + resultado);
    }
}
