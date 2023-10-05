// <T> la notacion de diamante
public class Caja<T> {
    // T es un parmetro de tipo que va a ser reemplazado por un tipo real cuando se crea
    // un objeto de tipo Caja
    private T elemento;

    // contructor que acepta un elemento de tipo T
    public Caja(T elemento) {
        this.elemento = elemento;
    }

    // metodo que devuelve el elemento almacenado en la caja
    public T obtenerElemento() {
        return elemento;
    }

    // metodo que compara si el elemento y otroObjeto son del mismo tipo
    public <V> boolean esMismaClase(V otroObjeto) {
        return elemento.getClass() == otroObjeto.getClass();
    }
}
