import java.util.Scanner;

public class EvaluarHorarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un dia de la semana para ver disponibilidad");
        String dia = scanner.nextLine().toLowerCase(); // convertimos todo a minusculas

        switch (dia) {
            case "lunes":
                System.out.println("El " + dia + " esta disponible de mañana");
                break;
            case "martes":
                System.out.println("El " + dia + " esta disponible de mañana");
                break;
            case "miercoles":
                System.out.println("El " + dia + " esta disponible de mañana");
                break;
            case "jueves":
                System.out.println("El " + dia + " esta disponible de tarde");
                break;
            case "viernes":
                System.out.println("El " + dia + " esta disponible de tarde y de noche");
                break;
            case "sabado":
                System.out.println("El " + dia + " esta cerrado");
                break;
            case "domingo":
                System.out.println("El " + dia + " esta cerrado");
                break;
        }
    }
}
