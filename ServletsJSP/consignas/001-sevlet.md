Para desarrollar un servlet avanzado que maneje tanto solicitudes GET como POST en IntelliJ IDEA, y responda con un saludo personalizado, seguirás los pasos detallados a continuación. Esta lección cubre todo, desde la configuración del proyecto hasta la escritura y prueba del código.

### Lección: Creación y Despliegue de un Servlet Avanzado en IntelliJ IDEA

#### Paso 1: Preparación del Proyecto

1. **Crear un Proyecto Java Web**:
   - En IntelliJ IDEA, crea un nuevo proyecto seleccionando "Java Enterprise".
   - Asegúrate de que "Web Application" esté seleccionado en las tecnologías del proyecto.
   - Define el nombre del proyecto, por ejemplo, `MiServletApp`.

2. **Configurar Tomcat**:
   - Configura Tomcat como servidor local en IntelliJ IDEA, especificando el `Tomcat Home` que corresponde a la ubicación donde instalaste Tomcat.

#### Paso 2: Crear el Servlet `SaludoServlet`

1. **Crear la Clase del Servlet**:
   - Navega al directorio `src/main/java`.
   - Crea un nuevo paquete, por ejemplo, `com.miservletapp`.
   - Dentro del paquete, crea una nueva clase Java y nómbrala `SaludoServlet`.

2. **Escribir el Código del Servlet**:
   - En `SaludoServlet.java`, escribe el siguiente código:

     ```java
     package com.miservletapp;

     import javax.servlet.*;
     import javax.servlet.http.*;
     import java.io.IOException;
     import java.io.PrintWriter;

     public class SaludoServlet extends HttpServlet {

         @Override
         protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             response.setContentType("text/html");
             PrintWriter out = response.getWriter();
             out.println("<html><body>");
             out.println("<form action='saludo' method='POST'>");
             out.println("Ingrese su nombre: <input type='text' name='nombre'><br>");
             out.println("<input type='submit' value='Saludar'>");
             out.println("</form>");
             out.println("</body></html>");
         }

         @Override
         protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             String nombre = request.getParameter("nombre");
             response.setContentType("text/html");
             PrintWriter out = response.getWriter();
             out.println("<html><body>");
             out.println("<h1>Hola, " + nombre + "!</h1>");
             out.println("</body></html>");
         }
     }
     ```

#### Paso 3: Configuración en `web.xml`

1. **Editar `web.xml`**:
   - Navega a `src/main/webapp/WEB-INF`.
   - Edita el archivo `web.xml` y agrega la configuración del servlet:

     ```xml
     <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
              http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
              version="4.0">

         <servlet>
             <servlet-name>SaludoServlet</servlet-name>
             <servlet-class>com.miservletapp.SaludoServlet</servlet-class>
         </servlet>
         <servlet-mapping>
             <servlet-name>SaludoServlet</servlet-name>
             <url-pattern>/saludo</url-pattern>
         </servlet-mapping>
     </web-app>
     ```

#### Paso 4: Configurar `pom.xml`

1. **Editar `pom.xml`**:
   - Asegúrate de que las dependencias necesarias están presentes en tu archivo `pom.xml`. Aquí hay un ejemplo de cómo debería verse:

     ```xml
     <?xml version="1.0" encoding="UTF-8"?>
     <project xmlns="http://maven.apache.org/POM/4.0.0"
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
         <modelVersion>4.0.0</modelVersion>

         <groupId>com.miservletapp</groupId>
         <artifactId>MiServletApp</artifactId>
         <version>1.0-SNAPSHOT</version>
         <packaging>war</packaging>

         <dependencies>
             <!-- Servlet API -->
             <dependency>
                 <groupId>jakarta.servlet</groupId>
                 <artifactId>

jakarta.servlet-api</artifactId>
                 <version>4.0.4</version>
                 <scope>provided</scope>
             </dependency>
         </dependencies>
     </project>
     ```

#### Paso 5: Despliegue y Prueba del Servlet

1. **Ejecución y Pruebas**:
   - Despliega tu aplicación haciendo clic en `Run` en IntelliJ IDEA.
   - Abre un navegador y ve a `http://localhost:8080/MiServletApp/saludo`.
   - Deberías ver el formulario. Introduce tu nombre, envíalo y observa el saludo personalizado.


#### Tarea para los Alumnos

Como tarea, modifica el servlet para que realice alguna otra función interesante con los datos del formulario. Por ejemplo, podrías calcular la edad de una persona basándose en una fecha de nacimiento proporcionada, o generar respuestas diferentes según la entrada recibida. Esto ayudará a reforzar tu comprensión del manejo de datos y lógica en los servlets.
