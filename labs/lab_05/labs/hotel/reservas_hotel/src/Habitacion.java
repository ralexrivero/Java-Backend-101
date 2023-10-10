public class Habitacion {
    // variables de instancia
    private int numero;
    private String tipo;
    private boolean estaOcupada;
    private double precioPorNoche;

    // contstrucor
    public Habitacion(int numero, String tipo, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.estaOcupada = false;
        this.precioPorNoche = precioPorNoche;
    }

    // getters y setters
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

}
