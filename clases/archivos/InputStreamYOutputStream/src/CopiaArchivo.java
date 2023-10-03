import java.nio.file.*;
import java.io.*;
public class CopiaArchivo {
    public static void main(String[] args) {
        // definimos los paths de los archivos de origen y destino
        Path inputPath = Paths.get("files/ejemplo.txt");
        Path outputPath = Paths.get("files/copia_ejemplo3.txt");

        // try para manejar los streams (flujos)
        // leemos el archivo de origen y creamos un archivo de destino
        try (InputStream input = Files.newInputStream(inputPath, StandardOpenOption.READ);
            OutputStream output = Files.newOutputStream(outputPath, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            // leemos el archivo en bloques y escribimos los bloques en el archivo de destino

            // los arrays de bytes se usan habitualmente como buffer para leer y escribir.
            byte[] buffer = new byte[1024]; // new byte[1024] es un buffer de 1024 bytes. Es comun y es 2^10, ademas es eficiente

            // variable tipo int, que se usa para almacenar el numero de bytes que se leen del InputStream, en cada iteracion.
            // tambien me sirve para saber cuando llegue al final, cuando vale -1 se termino el stream
            int bytesRead;

            // while inicia un bucle, que se ejecuta mientras la condicion sea true, osea que sea diferente de -1
            //(bytesRead = input.read(buffer) ===> hace dos cosas a la vez, leyendo y asignando al mismo tiempo
            // input.read(buffer) lee bytes del InputStream y los almacena en el buffer
            // bytesRead =   ===> el numero bytes leidos se asigna aca
            while ((bytesRead = input.read(buffer)) != -1) {

                // escribe los bytes leidos del InputStream al OutputStream
                // buffer el array que contiene los datos a escribir
                // 0 es donde empieza el array buffer, desde que posicion empiezo a escribir
                // bytesRead es la cantidad de bytes a escribir en el OutputStream
                // asi me aseguro de no escribir todo el array sino lo que me interesa, lo que leo
                output.write(buffer, 5, bytesRead -5);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
