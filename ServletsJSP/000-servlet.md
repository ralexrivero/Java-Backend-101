### Servlet000: Creación de un Servlet Básico en Java

#### Introducción

En esta lección creamos un servlet básico utilizando Java y lo configuramos para su ejecución. Un servlet es un componente clave en el desarrollo de aplicaciones web Java, que permite manejar solicitudes y respuestas HTTP.

#### Parte 1: Configuración del Proyecto Maven

1. **`pom.xml` - Configuración de Maven**:
   - **Archivo POM**: El archivo `pom.xml` es el corazón de un proyecto Maven. Define la estructura del proyecto, sus dependencias y su configuración de compilación.
   - **Dependencias**: Específicamente, agregamos la dependencia de `jakarta.servlet-api` para trabajar con Servlets en Java. La dependencia está marcada como `provided` porque el servidor de aplicaciones (como Tomcat) ya proporciona estas clases en tiempo de ejecución.
   - **Versión de Java**: Se especifica que el proyecto utiliza Java 11 (`<maven.compiler.target>11</maven.compiler.target>`).

#### Parte 2: Creación del Servlet

2. **Clase `MiPrimerServlet.java`**:
   - **Paquete y Clase**: La clase `MiPrimerServlet` se encuentra dentro del paquete `com.example.servlet000`. Es importante mantener una estructura de paquetes organizada para una mejor mantenibilidad del código.
   - **Extensión de `HttpServlet`**: Al extender `HttpServlet`, nuestra clase puede manejar solicitudes HTTP. `HttpServlet` es una clase abstracta que proporciona métodos para manejar diferentes tipos de solicitudes HTTP (GET, POST, etc.).
   - **Método `doGet`**:
     - Se sobrescribe el método `doGet` para manejar solicitudes GET.
     - `HttpServletRequest` y `HttpServletResponse` son interfaces que proporcionan métodos para manejar la solicitud y la respuesta, respectivamente.
     - **Escritura de HTML**: Utilizamos `PrintWriter` para escribir contenido HTML en la respuesta.

#### Parte 3: Configuración en `web.xml`

3. **Archivo `web.xml`**:
   - **Servlet y Mapeo de Servlet**: Configuramos nuestro `MiPrimerServlet` y su mapeo de URL. Esto vincula una URL específica (`/saludo`) con el servlet, de modo que cuando se accede a esta URL, se invoca `MiPrimerServlet`.

#### Parte 4: Despliegue y Prueba

4. **Ejecución y Pruebas**:
   - Con el entorno configurado y el código escrito, el proyecto se puede compilar y desplegar en un servidor de aplicaciones como Tomcat.
   - Para probar, navega a la URL correspondiente (por ejemplo, `http://localhost:8080/servlet000/saludo`) y deberías ver el mensaje "Hola! Este es mi primer Servlet" en tu navegador.
