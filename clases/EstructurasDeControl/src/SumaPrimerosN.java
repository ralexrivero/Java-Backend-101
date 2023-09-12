public class SumaPrimerosN {
    public static void main(String[] args) {
        // 1.Declaracion de variables
        int n = 100; // hasta que numero vamos a sumar
        int suma = 0; // variable que almacenará la suma

        // 2.Bucle for para sumar los numeros desde el 1 hasta el n

        for (int i = 1; i <= n; i++) {
            suma += i; // Suma el valor acutal de i a la variable suma
        }

        // 3. Mostrar el resultado en consola
        System.out.println("La suma de los primeros " + n + " números es: " + suma);
    }
}
