public class VariablesPrimitivas {
    public static void main(String[] args) {
        // variables primitivas
        int numero1 = 23; // asignar un valor a una variable
        int numero2 = numero1; // asigne una variable a otra y se copio el valor
        System.out.println("numero1: " + numero1); // 23
        System.out.println("numero2: " + numero2); // 23

        numero2 = 78;
        numero1 = 29;
        System.out.println("numero1 modificada: " + numero1); // 23
        System.out.println("numero2 modificada: " + numero2); // 78
    }
}
