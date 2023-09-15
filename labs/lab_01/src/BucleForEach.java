public class BucleForEach {
    public static void main(String[] args) {
        // con el bucle quiero recorrer todo el arreglo de enteros y
        // encontrarel valor mas chico y el valor mas grande

        int[] numeros = {4, 8, -6, 128, 64, -36, 73, -5, 44, 8};
        int minimo = numeros[0];
        int maximo = numeros[0];

        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }

            System.out.println("El valor mínimo es: " + minimo);
            System.out.println("El valor máximo es: " + maximo);
        }
    }
}
