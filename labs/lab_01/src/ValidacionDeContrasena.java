public class ValidacionDeContrasena {
    // 8 caracteres
    // Una letra mayuscula
    // Un numero
    public static void main(String[] args) {
        String contrasena = "Password20";

        if (esContrasenaValida(contrasena)) {  // llamo al metodo esContrasenaValida
            System.out.println("La contraseña es valida");
        } else {
            System.out.println("La contraseña no es valida");
        }
    }

    // metodo esContrasenaValida
    public static boolean esContrasenaValida(String contrasena) {
        if (contrasena.length() < 8) return false; // lo evaluo como un String
        boolean tieneMayuscula = false, tieneNumero = false;
        for (char c : contrasena.toCharArray()) { // lo convierto a un arreglo, lo trato de forma individual a cada char
            if (Character.isUpperCase(c)) tieneMayuscula = true;
            if (Character.isDigit(c)) tieneNumero = true;
        }
        return tieneMayuscula && tieneNumero; // tiene implicitoun valor True del largo
    }
}
