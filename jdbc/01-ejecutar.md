# Pasos para ejecutar el código

1. **Crear una base de datos en MySQL:** Usa la línea de comandos de MySQL o cualquier interfaz gráfica para crear una base de datos y captura su nombre para usarlo en el código.
2. **Actualizar el código:** Cambia los valores de `url`, `user` y `password` según tu configuración.
3. **Ejecutar el programa:** Ejecuta el programa en IntelliJ IDEA. Si todo está configurado correctamente, deberías ver un mensaje que indica que la conexión fue exitosa.

Necesitarás un poco de código SQL para configurar tu base de datos antes de intentar conectarte a ella. Aquí tienes un escenario simple con SQL necesario para crear una base de datos, una tabla, y algunos datos de ejemplo. Este código SQL se ejecutaría en tu cliente MySQL antes de ejecutar tu aplicación Java.

```sql
-- 1. Crear una nueva base de datos
CREATE DATABASE EjemploJava;

-- 2. Usar la base de datos creada
USE EjemploJava;

-- 3. Crear una tabla simple llamada 'Usuarios'
CREATE TABLE Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL
);

-- 4. Insertar datos de ejemplo en la tabla 'Usuarios'
INSERT INTO Usuarios (nombre, email) VALUES ('Juan Perez', 'juanperez@example.com');
INSERT INTO Usuarios (nombre, email) VALUES ('Laura Martinez', 'lauramartinez@example.com');
```

## Explicaciones

- **CREATE DATABASE**: Este comando crea una nueva base de datos llamada `EjemploJava`. Deberás asegurarte de que no exista previamente una base de datos con el mismo nombre.
- **USE**: Selecciona la base de datos que acabas de crear para realizar operaciones en ella.
- **CREATE TABLE**: Crea una nueva tabla llamada `Usuarios` con tres columnas: `id`, `nombre`, y `email`. El `id` es un número que se incrementa automáticamente cada vez que se añade un nuevo usuario, `nombre` y `email` son cadenas de texto.
- **INSERT INTO**: Añade filas a la tabla con información de ejemplo. Estos son los datos que intentarás recuperar o modificar desde tu aplicación Java.

Antes de ejecutar tu aplicación Java, asegúrate de que:

1. MySQL está en ejecución y accesible.
2. Has ejecutado este script SQL en tu entorno MySQL para tener la base de datos y la tabla configuradas.
3. La URL de conexión, el nombre de usuario y la contraseña en tu código Java coinciden con tu configuración de MySQL.

Con esta base de datos y tabla configuradas, podrás realizar operaciones como consultas, inserciones, actualizaciones y eliminaciones desde tu aplicación Java usando JDBC.

## Gestión de dependencias

Para poder usar el conector de MySQL en tu aplicación Java, necesitarás agregar la dependencia correspondiente a tu archivo `pom.xml`. Puedes encontrar la última versión del conector en [Maven Central](https://mvnrepository.com/).

## pom.xml

```xml
<!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
<dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.1.0</version>
</dependency>
```
