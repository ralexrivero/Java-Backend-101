import java.nio.file.*;
import java.io.*;

public class LecturaArchivo {
    public static void main(String[] args) {
        Path inputPath = Paths.get("files/ejemplo.txt");
        try (InputStream input = Files.newInputStream(inputPath, StandardOpenOption.READ)){
            int i;
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
