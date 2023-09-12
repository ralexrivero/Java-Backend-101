public class SumaParesImpares {
    public static void main(String[] args) {
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                sumaImpares += i;
            }
        }

        System.out.println("La suma de números pares del 1 al 100: " + sumaPares);
        System.out.println("La suma de números impares del 1 al 100: " + sumaImpares);
    }
}
