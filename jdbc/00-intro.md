# Fundamentos de jdbc

**Java Database Connectivity (JDBC):** Es una API de Java que permite la ejecución de operaciones en bases de datos desde Java. JDBC hace posible que las aplicaciones Java se conecten a una base de datos y envíen consultas SQL.

**MySQL:** Es un sistema de gestión de bases de datos relacional (RDBMS) de código abierto basado en SQL. Puede ejecutarse en varios sistemas operativos, incluido Windows.

**IntelliJ IDEA Ultimate:** Es un entorno de desarrollo integrado (IDE) para desarrollar software en varios lenguajes, incluido Java. Proporciona herramientas para trabajar con bases de datos, entre otras muchas funcionalidades.

## Configuración del Entorno

1. **Instalar Java:**
   - Asegúrate de tener Java instalado en tu máquina. Puedes descargarlo desde el [sitio oficial de Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) y seguir las instrucciones para Windows.

2. **Instalar MySQL:**
   - Descarga e instala MySQL desde [MySQL Downloads](https://dev.mysql.com/downloads/). Durante la instalación, configura un usuario y una contraseña, los cuales necesitarás más adelante.

3. **Instalar IntelliJ IDEA Ultimate:**
   - Descarga e instala IntelliJ IDEA Ultimate desde el [sitio oficial](https://www.jetbrains.com/idea/download/). Es una versión paga, pero puedes utilizar la versión de prueba para este tutorial.

4. **Configurar el driver JDBC de MySQL:**
   - Descarga el conector JDBC de MySQL (mysql-connector-java) desde [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/).
   - Añade el JAR a tu proyecto en IntelliJ IDEA. Ve a File > Project Structure > Libraries y añade el JAR como una librería al proyecto.

## Paso a paso

### Importando los Paquetes Necesarios

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
```

- **java.sql.Connection**: Esta interfaz maneja la conexión entre la aplicación Java y la base de datos.
- **java.sql.DriverManager**: Esta clase gestiona la lista de controladores de base de datos disponibles.
- **java.sql.SQLException**: Esta clase maneja cualquier error que ocurra en el contexto de la base de datos.

### Clase y Método Principal

```java
public class Main {
    public static void main(String[] args) {
```

- **public class Main**: Define la clase `Main`.
- **public static void main(String[] args)**: Es el punto de entrada a tu aplicación Java. Todo el código que se ejecuta al inicio va aquí.

### Parámetros de Conexión

```java
String url = "jdbc:mysql://localhost:3306/nombreDeTuBaseDeDatos";
String user = "tuUsuario";
String password = "tuContraseña";
```

- **String url**: Es la URL de conexión a tu base de datos. Incluye el protocolo (`jdbc:mysql:`), el servidor (`localhost`), el puerto (generalmente `3306` para MySQL) y el nombre de tu base de datos.
- **String user**: El nombre de usuario para acceder a tu base de datos.
- **String password**: La contraseña para acceder a tu base de datos.

### Estableciendo la Conexión

```java
try {
    Connection connection = DriverManager.getConnection(url, user, password);
    if (connection != null) {
        System.out.println("Conexión exitosa a la base de datos!");
    }
    connection.close();
} catch (SQLException e) {
    System.out.println("Error al conectarse a la base de datos");
    e.printStackTrace();
}
```

- **try-catch**: Se utiliza para manejar cualquier excepción SQL que pueda surgir. Es una buena práctica manejar las excepciones para evitar que la aplicación falle inesperadamente.
- **Connection connection = DriverManager.getConnection(url, user, password)**: Intenta establecer una conexión con la base de datos usando los parámetros proporcionados. Si tiene éxito, `connection` será una conexión activa que puedes usar para enviar y recibir datos.
- **if (connection != null)**: Verifica si la conexión fue exitosa. Si es así, imprime un mensaje de confirmación.
- **connection.close()**: Es crucial cerrar la conexión una vez que hayas terminado de usarla para liberar recursos en tu base de datos y en tu aplicación.

### Escribiendo el Código completo

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Parámetros de conexión
        String url = "jdbc:mysql://localhost:3306/nombreDeTuBaseDeDatos";
        String user = "tuUsuario";
        String password = "tuContraseña";

        try {
            // Estableciendo la conexión
            Connection connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos!");
                // Aquí puedes agregar tu código para trabajar con la base de datos...
            }

            // Cerrar la conexión
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la base de datos");
            e.printStackTrace();
        }
    }
}
```

### Repaso

- **Importar clases SQL:** Importamos las clases necesarias para manejar conexiones SQL.
- **URL de conexión:** Es la dirección de tu base de datos. 'localhost' significa que la base de datos está en tu máquina local. '3306' es el puerto predeterminado para MySQL. 'nombreDeTuBaseDeDatos' debe ser reemplazado por el nombre real de tu base de datos.
- **Usuario y contraseña:** Las credenciales que configuraste al instalar MySQL.
- **DriverManager:** Es una clase de JDBC que maneja el conjunto de drivers de base de datos. Usamos su método `getConnection` para establecer una conexión con la base de datos.
- **Manejo de excepciones:** `try-catch` se usa para manejar cualquier excepción SQL que pueda ocurrir durante el proceso de conexión.
