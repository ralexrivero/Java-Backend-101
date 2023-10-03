import java.nio.file.*;
import java.io.*;

public class EscrituraArchivo {
    public static void main(String[] args) {
        Path outputPath = Paths.get("files/ejemplo2.txt");
        try (OutputStream output = Files.newOutputStream(outputPath, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            String mensaje = "Hola, este es el mensaje de escritura.";
            byte[] mensajeBytes = mensaje.getBytes();
            output.write(mensajeBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
