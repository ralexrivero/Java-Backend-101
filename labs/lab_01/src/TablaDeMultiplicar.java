public class TablaDeMultiplicar {
    // ciclo anidado: cuando tengo un bucle dentro de otro bucle
    public static void main(String[] args) {
        // ciclo externo para los numeros del 1 al 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Tabla del: " + i);
            // ciclo interno para multiplicar el nmro i por los numeros del 1 al 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
