import java.util.Random;

public class IntroRandom {
    public static void main(String[] args) {
        // creamos una instancia de Random
        Random random = new Random();
        // nextInt() es un metodo que genera un entero aleatorio
        int numeroAleatorio = random.nextInt(100);
        // genera un numero aleatorio entre 0 y 99
        System.out.println("numero aleatorio generado: " + numeroAleatorio);
    }
}
