import java.util.Random;

public class LanzamientoDado {
    public static void main(String[] args) {
        Random random = new Random();
        // generar un numero entre 1 y 6
        int resultadoDado = random.nextInt(6) + 1;
        System.out.println("El resultado del lanzamiento de dado es: " + resultadoDado);
    }
}
