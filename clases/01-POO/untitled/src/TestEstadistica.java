public class TestEstadistica {
    public static void main(String[] args) {
        Estadistica estadistica = new Estadistica();

        // Test para el metodo calcularPromedio con varios numeros
        double promedio1 = estadistica.calcularPromedio(5.0, 10.0, 15.0, 20.0, 30.0, 2.0);
        System.out.println("El promedio de 5.0, 10.0, 15.0, 20.0, 30.0, 2.0, es: " + promedio1);
        // Test para un solo numero
        double promedio2 = estadistica.calcularPromedio(7.0);
        System.out.println("El promedio de 7.0 es: " +  promedio2);
        double promedio3 = estadistica.calcularPromedio();
        System.out.println("El promedio sin numeros es: " + promedio3);
    }
}
