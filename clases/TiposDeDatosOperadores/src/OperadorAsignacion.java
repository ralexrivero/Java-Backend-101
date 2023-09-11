public class OperadorAsignacion {
    public static void main(String[] args) {
        // = asignacion se utiliza para asignar un valor a una variable
        // variable = valor

        int numero; // declaracion
        numero = 5; // asignacion

        // asignar una expresion

        int resultado = 8 * 9 + 99 - 85; // resultado de una expresion

        // asignacion en cadena

        int a, b, c;
        a = b = c = 8; // asignacion en cadena

        System.out.println("a, b, y c valen: " + a + b + c);

        // valor de una asignacion

        int valorDec = (c = 8);

        // Asignacion abreviada
        // realizamos operaciones y asignaciones en una sola linea
        // += suma y asignacion
        // -= resta y asignacion
        // *= multiplicacion y asignacion
        // /= division y asignacion
        // %= modulo y asignacion

        int x = 10;
        x += 1; // x = x + 1, incrementamos en 1 el valor de x
        System.out.println("X despues de incrementar vale: " + x);
        // es mas eficiente, de la otra forma se genera una copia de la variable y se vuelve a asignar
    }
}
