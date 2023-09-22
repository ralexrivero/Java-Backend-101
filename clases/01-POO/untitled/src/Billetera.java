public class Billetera {
    // Variables por referencia
    double saldo;

    public static void main(String[] args) {
        Billetera billeteraDeJuan = new Billetera();
        billeteraDeJuan.saldo = 23500;

        Billetera billeteraDeAna = billeteraDeJuan; // solo guarda la referencia a billeteraDeJuan
        billeteraDeAna.saldo = 25000; // es una variable que almacena solo una referencia

        billeteraDeJuan.saldo = 3000;

        System.out.println("Saldo Juan: " + billeteraDeJuan.saldo); // 25000 porque cambio por referencia
        System.out.println("Saldo Ana: " + billeteraDeAna.saldo); // 25000

    }
}
