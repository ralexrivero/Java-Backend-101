public class MezclarArreglos {
    public static void main(String[] args) {
        char[] letras = {'a', 'b', 'c'};
        char[] numeros = {'1', '2', '3'};
        char[] mix = new char[letras.length + numeros.length];

        for(int i = 0, j = 0, k = 0; i < letras.length && j < numeros.length; k+=2) {
            mix[k] = letras[i++];
            mix[k+1] = numeros[j++];
        }

        for (char c : mix) {
            System.out.println(c);
        }
    }
}
