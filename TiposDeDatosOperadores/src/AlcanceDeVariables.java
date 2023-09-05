public class AlcanceDeVariables {
    public static void main(String[] args) {
        int dias = 0; // esta variable es accesible dentro del metodo main

        while (dias < 750) {
            dias = dias + 1; // dias se incrementa a si mismo en 1
            int semanas = dias / 7; // se crea y se destruye en cada ciclo
            System.out.println("dias: " + dias + ", semanas: " + semanas);
        }

        //int anios = semanas / 52; esta fuera del alcance
        int anios = dias / 365;
        System.out.println("Años: " + anios);
    }
}
