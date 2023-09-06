public class OperadoresLogicos {
    public static void main(String[] args) {
        // and &&
        // and devuelve true solo si ambas expresiones booleanas son verdaderas
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        boolean a = true;
        boolean b = false;
        boolean resultado = a && b; // a y b
        System.out.println("a && b es: " + resultado);

        // OR ||
        // O logico, devulve true si almenos una expresion booleana es verdadera
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false
        boolean resultadoOr = a || b;
        System.out.println("a || b es: " + resultadoOr );

        // NOT !
        // No logico, convierte el valor de una expresion booleana. si originalmente es true, NOT la convierte en false

        boolean resultadoNot = !a;
        System.out.println("a es: " + a + " !a es: " + resultadoNot);

        // Operador XOR ^
        // el O exclusivo devuleve true si exactamente una de las expresiones booleanas a su izquierda o deracha es verdadera

        boolean resultadoXor = a ^ b;
        System.out.println("a ^ b: " + resultadoXor);

        boolean resultadoXor2 = true ^ true;
        System.out.println("true ^ true: " + resultadoXor2);
    }
}
