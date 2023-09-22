public class Libro {
    // variables de instancia son las que definen las propiedades
    // o caracteristicas de los un objeto
    // son las variables que hacen diferente a un objeto de otro
    String titulo;  // estan afuera de los metodos
    String autor;
    int numeroDePaginas;
    int paginaActual;

    //metodos
    public void leerPagina() {
        if(paginaActual < numeroDePaginas) {
            paginaActual++;
        }
    }

    public void marcarPagina(int pagina) {
        // cuerpo del metodo
        paginaActual = pagina;
    }

    public String obtenerResumen() {
        return "Estas leyendo " + titulo + " de " + autor + ", y estas en la pagina " + paginaActual;
    }
}
