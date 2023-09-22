public class Cartera {
    String propietario;
    String tipo;
    double saldo;

    // metodo para retirar dinero
    void retirarDinero(double cantidad) {
        saldo -= cantidad;
    }

    // metodo para depositar dinero
    void depositarDinero(double cantidad) {
        saldo += cantidad;
    }

    void cambiarTipo(String nuevoTipo) {
        tipo = nuevoTipo;
    }
}
