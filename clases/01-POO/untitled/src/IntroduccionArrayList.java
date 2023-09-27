import java.util.ArrayList;

public class IntroduccionArrayList {

    public static void main(String[] args) {
        // Declarar un ArrayList
        ArrayList<String> listaDeCompras = new ArrayList<>();

        // Agregar elementos a la lista
        listaDeCompras.add("Pan");
        listaDeCompras.add("Huevos");
        listaDeCompras.add("Naranjas");
        System.out.println("Lista de compras: " + listaDeCompras);

        // Crear una lista a partir de otra lista, la lista anterior
        ArrayList<String> listaDeOctubre = new ArrayList<>(listaDeCompras);
        listaDeOctubre.add("Cereales");
        System.out.println("Lista de compras: " + listaDeCompras);
        System.out.println("Lista de compras Octubre: " + listaDeOctubre);

        //Acceder al primer elemento
        System.out.println("Primer elemento de lista de Octubre: " + listaDeOctubre.get(0));

        // Modificar un elemento
        listaDeOctubre.set(1, "Huevos organicos");
        System.out.println("Lista de Octubre despues de modificar: " + listaDeOctubre);

        // Eliminar un elemento por indice
        listaDeOctubre.remove(0);
        System.out.println("Lista de Octubre despue de eliminar el primero: " + listaDeOctubre);

        // Eliminar por elemento
        listaDeOctubre.remove("Naranjas");
        System.out.println("Lista despues de eliminar Naranjas: " + listaDeOctubre);

        // Mostrar el tamaño de la lista
        System.out.println("Numero de elemento en la lista de Octubre: " + listaDeOctubre.size());

        // agrego un elmento
        listaDeOctubre.add("Membrillo");
        listaDeOctubre.add("Harina");

        // Recorrer la lista con un bucle forEach
        System.out.println("Elementos de la lista Octubre");
        for (String item : listaDeOctubre) {
            System.out.println(item);
        }

        // forma manual de hacer el forEach
        System.out.println(listaDeOctubre.get(0));
        System.out.println(listaDeOctubre.get(1));
        System.out.println(listaDeOctubre.get(2));
        System.out.println(listaDeOctubre.get(3));


    }
}
