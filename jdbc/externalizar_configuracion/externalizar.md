# Externalizar configuraciones

Para externalizar la configuración del usuario y la contraseña de la base de datos en una aplicación Java, especialmente en un entorno de servlets y JSP, una buena práctica es utilizar archivos de propiedades o de configuración. Esto no solo mejora la seguridad, al evitar tener credenciales codificadas en el código fuente, sino que también facilita la gestión de diferentes entornos de despliegue (como desarrollo, prueba y producción) sin necesidad de cambiar el código.

Para este ejemplo, puedes crear un archivo de propiedades dentro de la carpeta `META-INF` en tu proyecto. Este archivo contendrá el usuario y la contraseña de la base de datos.

### Paso 1: Crear el archivo de propiedades

1. Crea un archivo llamado `config.properties` dentro de la carpeta `META-INF` de tu proyecto web.
2. Agrega las siguientes propiedades al archivo:

   ```
   db.user=root
   db.password=abcd1234
   ```

   Reemplaza `root` y `abcd1234` con tu usuario y contraseña reales de la base de datos.

### Paso 2: Modificar `DataConnect` para leer el archivo de propiedades

Necesitarás modificar la clase `DataConnect` para que lea las credenciales de la base de datos desde el archivo `config.properties`.

```java
package com.miaplicacion.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DataConnect {
    private static String USER;
    private static String PASSWORD;

    static {
        try (InputStream input = DataConnect.class.getClassLoader().getResourceAsStream("META-INF/config.properties")) {
            Properties prop = new Properties();

            if (input == null) {
                System.err.println("Sorry, unable to find config.properties");
                return;
            }

            // Load a properties file from class path
            prop.load(input);

            // Get the property values
            USER = prop.getProperty("db.user");
            PASSWORD = prop.getProperty("db.password");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/EjemploJava", USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException ex) {
            System.err.println("Error de conexion: " + ex.getMessage());
            return null;
        }
    }
}
```

### Consideraciones

- **Seguridad**: Asegúrate de que el archivo `config.properties` no se incluya en el control de versiones si contiene credenciales sensibles. Utiliza variables de entorno o mecanismos de configuración específicos del entorno de despliegue para gestionar estos valores en producción.
- **Acceso al archivo de propiedades**: La ubicación de `META-INF` y el método para cargar el archivo pueden variar dependiendo del servidor de aplicaciones o contenedor de servlets que estés utilizando, así como de la estructura de tu proyecto. Asegúrate de que la ruta al archivo `config.properties` sea accesible desde el código en tiempo de ejecución.
- **Errores de carga**: Añade manejo adecuado de errores en el bloque estático para asegurar que cualquier problema al cargar las configuraciones se maneje de manera adecuada, posiblemente lanzando una excepción para evitar que la aplicación se ejecute con configuraciones incorrectas o faltantes.
