public class Arreglos {
    // un arreglo es una estructura de datos que nos deja guardar varios valores
    // []
    public static void main(String[] args) {
        int[] numeros; // declaro el arreglo, tipo, [] y nombre
        numeros = new int[7]; // le asigno el espacio, reservo espacio
        numeros[0] = 10;
        numeros[1]= 20;
        numeros[2] = 40;
        int[] numeros2 = {1, 2, 3, 4, 5}; // inicializo con los valores especificos

        // Los strings son secuencias de caracteres
        // en especial tienen sus métodos

        String saludo = "Hola, como estás";

        int largoDeSaludo = saludo.length();
        System.out.println("El largo de la variable saludo es de: " + largoDeSaludo);

        String enMayusculas = saludo.toUpperCase();
        System.out.println(enMayusculas);
        System.out.println(saludo);
        System.out.println(saludo.toUpperCase());

        String frase = "Lo barato sale caro";
        String fraseModificada = frase.replace("caro", "bueno");
        System.out.println(fraseModificada);
    }
}
