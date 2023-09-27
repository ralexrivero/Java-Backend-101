public class Estadistica {
    // Metodo para calcular el promedio de n numeros
    double calcularPromedio(double... numeros) {
        // ... nos permiten recibir un numero variable de argumentos
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }
}
