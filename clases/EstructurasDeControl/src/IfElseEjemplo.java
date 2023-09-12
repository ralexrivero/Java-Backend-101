public class IfElseEjemplo {
    public static void main(String[] args) {
        int divisor = 5;

        if (divisor != 0) {
            int resultado = 100 / divisor;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("El divisor no puede ser 0");
        }
    }
}
