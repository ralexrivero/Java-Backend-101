public class EvaluacionExpresiones {
    public static void main(String[] args) {
        // evaluacion de expresiones
        // las expresiones son combinaciones de variables, valores y operadores
        int a = 5;
        int b = 3;
        int suma = a + b; // la evaluacion que hace java es 5 + 3 y el resultado 8 y se almacena en la variable suma

        String nombre = "Mariana";
        String apellido = "Pereira";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
        // la expresion nombre + " " + apellido concatena(une) las cadenas para formar "Mariana Pereira" y se almacena
        // el valor en la variable nombreCompleto

        // promocion
        // promocion de enteros
        int entero = 5;
        long largo = 10L;
        long resultado = entero + largo;
        System.out.println("5 + 10L = " + resultado);
        // el valor entero se promociona automaticamente a long para que la operacion se realice sin errores
    }
}
