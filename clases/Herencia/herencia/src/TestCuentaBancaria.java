public class TestCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Steve", 1000);

        System.out.println("Titular de cuenta: " + cuenta.getTitular());
        System.out.println("Saldo: $: " + cuenta.getSaldo());


        cuenta.depositar(5000);
        System.out.println("Luego de depositar: " + cuenta.getSaldo());

        cuenta.retirar(2500);
        System.out.println("Luego de retirar: " + cuenta.getSaldo());

    }
}
