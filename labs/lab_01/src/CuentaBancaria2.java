public class CuentaBancaria2 {
    // variables de instancia
    String titular;
    String tipo_de_cuenta;
    double saldo;

    // metodos: encapsulan comportamientos y operaciones
    // metodo para sacar dinero
    public void sacarDinero(double cantidad) {
        
        saldo -= cantidad;
    }

    public void ingresarDinero(double cantidad){
        saldo += cantidad;
    }

    public void cambiarTipoDeCuenta(String nuevoTipo) {
        tipo_de_cuenta = nuevoTipo;
    }

    public static void main(String[] args) {
        // crear una instancia, crear un objeto
        CuentaBancaria2 cuentaDeJose = new CuentaBancaria2();
        cuentaDeJose.titular = "Jose";
        cuentaDeJose.tipo_de_cuenta = "Ahorro";
        cuentaDeJose.saldo = 25000;

        // usar los metodos

        cuentaDeJose.sacarDinero(5000);
        cuentaDeJose.ingresarDinero(1000);
        cuentaDeJose.cambiarTipoDeCuenta("Corriente");
        System.out.println("El nuevo tipo de cuenta es: " + cuentaDeJose.tipo_de_cuenta);
    }
}
