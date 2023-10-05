public class TestCaja {
    public static void main(String[] args) {
        Caja<String> caja1 = new Caja<>("Hola");
        Caja<Integer> caja2 = new Caja<>(5);

        System.out.println("Caja1 contiene: " + caja1.obtenerElemento());
        System.out.println("Caja2 contiene: " + caja2.obtenerElemento());

        String otroObjeto = "Gato";

        System.out.println("Comparacion caja1 y otroObjeto: " + caja1.esMismaClase(otroObjeto));
        System.out.println("Comparacion caja2 y otroObjeto: " + caja2.esMismaClase(otroObjeto));
    }
}
