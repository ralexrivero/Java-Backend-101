import java.util.Date;

public class TestHotel {
    public static void main(String[] args) {
        // Crear instancias de habitacion
        Habitacion h1 = new Habitacion(101, "simple", 100.0);
        Habitacion h2 = new Habitacion(102, "doble", 150);

        // Crear un cliente
        Cliente c1 = new Cliente("John Doe", "12345678", "24/09/1980");

        // Crear una reserva
        Date fechaEntrada = new Date(); // fecha de hoy, ahora
        Date fechaSalida = new Date(fechaEntrada.getTime() + (1000 * 60 * 60 * 24 * 3)); // milisegundos, segundos, minutos, horas, dias
        Reserva r1 = new Reserva(h1, c1, fechaEntrada, fechaSalida);

        System.out.println("Reserva para: " + r1.getCliente().getNombre() + " en la habitacion: " + r1.getHabitacion().getNumero());
        System.out.println("Costo de la reserva: U$S: " + r1.calcularCosto());
    }
}
