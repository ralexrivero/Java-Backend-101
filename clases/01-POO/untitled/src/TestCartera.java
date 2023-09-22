public class TestCartera {
    public static void main(String[] args) {
        Cartera carteraDeLuis = new Cartera();
        carteraDeLuis.saldo = 23500;

        // usar los metodos
        carteraDeLuis.retirarDinero(500);
        System.out.println("Luego de retirar, Luis tiene $: " + carteraDeLuis.saldo);

        carteraDeLuis.depositarDinero(2000);
        System.out.println("Luego de depositar, Luis tiene $: " + carteraDeLuis.saldo);

        carteraDeLuis.cambiarTipo("Cartera de Ahorro en $U");
        System.out.println("La cartera de Luis es del tipo: " + carteraDeLuis.tipo);
    }
}
