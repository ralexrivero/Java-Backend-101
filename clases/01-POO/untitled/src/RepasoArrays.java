public class RepasoArrays {
    public static void main(String[] args) {
        // declaracion e inicializacion de un array
        String[] diasDeLaSemana = new String[7];

        // asignacion de valores mediante el indice [0]
        diasDeLaSemana[0] = "Lunes";
        diasDeLaSemana[1] = "Martes";
        diasDeLaSemana[2] = "Miercoles";
        diasDeLaSemana[3] = "Jueves";
        diasDeLaSemana[4] = "Viernes";
        diasDeLaSemana[5] = "Sabado";
        diasDeLaSemana[6] = "Domingo";

        // acceder mediante la posicion [0]
        System.out.println("El primer dia es: " + diasDeLaSemana[0]);

        // inicializar de forma simplificada
        int[] numeros = {8, 9, 85, 25, 14};
        String[] palabras = {"Hola", "Chau", "Bueno", "yo que se"};

        // recorrerel array
        System.out.println("numeros en el array: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero: " + numeros[i]);
        }
    }
}
