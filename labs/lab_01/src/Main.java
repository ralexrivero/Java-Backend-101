public class Main {
    public static void main(String[] args) {
        // crear una instancia de miLibro
        Libro miLibro = new Libro();

        // inicializarlas variables de instancia de miLibro
        miLibro.titulo = "Don Quijote de la Mancha";
        miLibro.autor = "Miguel de Cervantes";
        miLibro.numeroDePaginas = 1000;
        miLibro.paginaActual = 0;

        //usar los metodos
        miLibro.leerPagina();
        miLibro.marcarPagina(50);
        System.out.println(miLibro.obtenerResumen());


        Libro otroLibro = new Libro();

        otroLibro.titulo = "La selva";
        otroLibro.autor = "Horacio Quiroga";
        otroLibro.numeroDePaginas = 250;
        otroLibro.paginaActual = 0;

        otroLibro.leerPagina();
        System.out.println(otroLibro.obtenerResumen());
    }
}
