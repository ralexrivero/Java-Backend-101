public class TestPersona {
    public static void main(String[] args) {
        Persona raul = new Persona("Raul", 25);

        // con get y con set accedemos a leer y modificar los atributos
        // no podemos acceder o modificar nombre o edad porque estan encapsulados
        System.out.println(raul.getClass());
        System.out.println("Nombre: " + raul.getNombre());
        System.out.println("Edad: " + raul.getEdad());

        raul.setEdad(-10);
        System.out.println("Edad actualizada: " + raul.getEdad());
    }
}
