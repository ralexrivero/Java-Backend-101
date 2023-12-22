import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/EjemploJava";
        String user= "root";
        String password = "abcd1234";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nPor favor, elige una opcion:");
                System.out.println("1. Agregar un usuario");
                System.out.println("2. Mostrar usuarios");
                System.out.println("3. Salir");
                System.out.print("Elige una opcion: ");
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el nombre del usuario: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingresa el email del usuario: ");
                        String email = scanner.nextLine();
                        agregarUsuario(connection, nombre, email);
                        break;
                    case 2:
                        mostrarUsuarios(connection);
                        break;
                    case 3:
                        System.out.println("Saliendo...");
                        connection.close();
                        scanner.close();
                        return;
                    default:
                        System.out.println("Ingresa una opcion valida");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al conectarse a la base de datos");
            e.printStackTrace();
        }
    }

    public static void agregarUsuario(Connection connection, String nombre, String email) throws SQLException {
        String sql = "INSERT INTO Usuarios (nombre, email) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nombre);
            statement.setString(2, email);
            int filasInsertadas = statement.executeUpdate(); // insert, update, delete
            if (filasInsertadas > 0 ) {
                System.out.println("Registro exitoso");  // solo para verificar que se ingresaron datos
            }

        }
    }

    public static void mostrarUsuarios(Connection connection) throws SQLException {
        String sql = "SELECT id, nombre, email FROM Usuarios";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery(); // Es el conjunto de resultados de la consulta SQL

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", email: " + email);
            }
        }
    }
}
