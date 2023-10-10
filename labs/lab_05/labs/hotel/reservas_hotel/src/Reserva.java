import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Habitacion habitacion;
    private Cliente cliente;
    private Date fechaEntrada;
    private Date fechaSalida;

    public Reserva(Habitacion habitacion, Cliente cliente, Date fechaEntrada, Date fechaSalida) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public double calcularCosto() {
        long diferencia = fechaSalida.getTime() - fechaEntrada.getTime(); // milisegundo
        long dias = TimeUnit.DAYS.convert(diferencia, TimeUnit.MILLISECONDS);
        return dias * habitacion.getPrecioPorNoche();
    }
}
