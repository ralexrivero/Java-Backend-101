import java.util.Scanner;

public class EvaluarHorarios2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un dia de la semana para ver disponibilidad");
        String dia = scanner.nextLine().toLowerCase(); // convertimos todo a minusculas

        switch (dia) {
            case "lunes":
            case "martes":
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
            case "domingo":
                System.out.println("El " + dia + " esta cerrado");
                break;
            default:
                System.out.println(dia + " No es un dia valido"); // cuando no se cumple ninguna condicion dentro de los
                // casos se ejecuta el default
        }
    }
}
