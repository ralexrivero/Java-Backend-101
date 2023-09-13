import java.util.Scanner;

public class Lab_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Seleccion de figura
        System.out.println("Selecciona la figura (circulo, rectangulo, triangulo: ");
        String figura = scanner.nextLine().toLowerCase();

        // Variables para calcular el area
        double radio, base, altura;

        // Calculo de area segun la figura

        switch (figura) {
            case "circulo":
                System.out.println("Ingrese el radio del circulo: ");
                radio = scanner.nextDouble();
                System.out.println("El area del circulo es: " + Math.PI * radio * radio);
                break;

            case "rectangulo":
                System.out.println("Introduzca la base y la altura: ");
                base = scanner.nextDouble();
                altura = scanner.nextDouble();
                System.out.println("El area del rectangulo es: " + base * altura);
                break;

            case "triangulo":
                System.out.println("Introduzca la base y la altura del triangulo: ");
                base = scanner.nextDouble();
                altura = scanner.nextDouble();
                System.out.println("El area del tringulo es: " + 0.5 * base * altura);
                break;

            default:
                System.out.println("Esta figura no existe o no esta ingresada");
                return;
        }

        // Calculo de descuentos

        System.out.println("¿Qué día es hoy? (lunes, martes, ...:" );
        String dia = scanner.next().toLowerCase();

        System.out.println("¿Cuántas láminas desea comprar? (1, 2, 3,...):");
        int cantidad = scanner.nextInt();

        System.out.println("¿Es cliente frecuente? (si/no):");
        // equalsIgnoreCase (Si, si, SI es lo mismo)
        // ademas nos devuelve true si ambas cadenas son iguales
        boolean esFrecuente = scanner.next().equalsIgnoreCase("si");

        double descuento = 0;

        // Descuentos (se deben cumplir las dos condiciones, con un AND, Y):
        // circulo/s en un dia lunes, 10% de descuento
        // cliente frecuente compra un triangulo, tiene un 5% de descuento
        // rectangulos tienen 3% si se compran mas de 5

        if (figura.equals("circulo") && dia.equals("lunes")) {
            descuento = 10;
        } else if (figura.equals("triangulo") && esFrecuente) {
            descuento = 5;
        } else if (figura.equals("rectangulo") && cantidad > 5) {
            descuento = 3;
        }

        System.out.println("Descuento aplicable: " + descuento + "%");
    }
}
