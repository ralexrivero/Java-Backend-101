public class CuentaBancaria {
    // Variables de instancia

    String titular;
    String tipoDeCuenta;
    double saldo;

    // Constructor
    public CuentaBancaria(String titular, String tipoDeCuenta, double saldo) {
        this.titular = titular;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
    }

    // metodo para depositar dinero
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }

    // metodo para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("El saldo de " + titular + " es: " + saldo);
    }

    public static void main(String[] args) {
        // Crear una cuenta bancaria para Juan

        CuentaBancaria cuentaJuan = new CuentaBancaria("Juan", "Caja de Ahorros", 10000.0);
        cuentaJuan.mostrarSaldo();

        // crear una  referencia a la cuentaJuan
        CuentaBancaria referenciaACuentaJuan = cuentaJuan;

        // Depositar dinero usando la referencia
        referenciaACuentaJuan.depositar(500.0);
        referenciaACuentaJuan.mostrarSaldo();

        // mostrar el saldo de la cuenta original
        cuentaJuan.mostrarSaldo();
    }
}
