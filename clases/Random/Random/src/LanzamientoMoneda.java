import java.util.Random;

public class LanzamientoMoneda {
    public static void main(String[] args) {
        Random random = new Random();
        boolean esCara = random.nextBoolean();
        if (esCara) {
            System.out.println("Es cara");
        } else {
            System.out.println("Es cruz");
        }
    }
}
