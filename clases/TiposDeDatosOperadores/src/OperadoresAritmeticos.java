public class OperadoresAritmeticos {
    public static void main(String[] args) {
        // operadores aritmeticos
        // + - * / %

        int a = 2;
        int b = 3;
        int resSuma = a + b;
        int resResta = a - b;
        double resMultiplicacion = b * 3.5;
        int resDivision = a / b;
        int resModulo = b % a;

        System.out.println("Suma:" + resSuma);
        System.out.println("Resta:" + resResta);
        System.out.println("Multiplicacion:" + resMultiplicacion);
        System.out.println("Division:" + resDivision);
        System.out.println("Modulo:" + resModulo);

        // operadores unarios y el Casting de tipo primitivo

        int cambioSigno = -a; //
        System.out.println("Cambio de signo: " + cambioSigno);

        double resDivision2 = (double) 2 / 3;
        System.out.println("Division con decimal: " + resDivision2);

        double numeroDouble = 3.1415;
        int numeroEntero = (int) numeroDouble; // Casting de double a int
        System.out.println("De double a int, antes: " + numeroDouble + " despues: " + numeroEntero);
    }
}
