public class EjemploArreglos {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50}; // declaracion e inicializacion

        int numerosTotal = 0;
        for (int numero : numeros) {  // es un bucle para recorrer arreglos
            numerosTotal += numero;
        }

        System.out.println("La suma de los números del arreglo es: " + numerosTotal);
    }
}
