public class Calculadora {
    // Calculadora que divide dos numeros
    double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        return dividendo / divisor;
    }
}
