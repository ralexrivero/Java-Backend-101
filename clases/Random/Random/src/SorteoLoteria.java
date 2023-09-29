import java.util.Random;

public class SorteoLoteria {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Numeros de loteria: ");

        for (int i = 0; i < 5; i++) {
            int numero = random.nextInt(48) + 1;
            System.out.println(numero);
        }

        int bolillaExtra = random.nextInt(48) + 1;
        System.out.println("\nBolilla extra: " + bolillaExtra);
    }
}
