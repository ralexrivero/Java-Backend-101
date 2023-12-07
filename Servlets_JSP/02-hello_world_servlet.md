# Lección Mejorada: Creación de un Servlet "Hola Mundo" en IntelliJ IDEA Ultimate con Tomcat

Vamos a crear una aplicación web básica utilizando Servlets en IntelliJ IDEA Ultimate, apoyados por el servidor Apache Tomcat. Esta guía paso a paso te llevará a través del proceso de configuración y desarrollo. Asegúrate de tener instalado IntelliJ IDEA Ultimate y Apache Tomcat 10 antes de comenzar.

## Paso 1: Inicialización del Proyecto

1. **Inicio de IntelliJ IDEA**: Abre IntelliJ IDEA Ultimate para comenzar nuestro proyecto.
2. **Creación de un Nuevo Proyecto**: Navega a `File > New > Project`.
3. **Selección de Plantilla de Proyecto**: En la ventana de nuevo proyecto, escoge `Java Enterprise` y, dentro de este, selecciona `Web Application`. Esta opción incluirá automáticamente componentes esenciales como Servlet, `web.xml` e `index.jsp`.
4. **Nombrar el Proyecto**: Asigna un nombre significativo a tu proyecto, como `HolaMundoServlets`, y elige un directorio para guardarlo.
5. **Configuración del JDK y Apache Tomcat**: Selecciona la versión adecuada del JDK (ejemplo, JDK 21 y JAKARTA EE 9.1). Posteriormente, elige Apache Tomcat como tu servidor de aplicaciones, asegurándote de que esté correctamente configurado en IntelliJ IDEA.

## Paso 2: Desarrollo del Servlet

0. **Integración con Maven**: Asegúrate de cargar el proyecto Maven para una sincronización adecuada.
1. **Preparación del Espacio de Trabajo**: Elimina clases y archivos innecesarios generados por defecto como `index.jsp` y `HelloServlet.java`.
2. **Creación del Servlet**: Dirígete al paquete `com.example.holamundoservlets`, haz clic derecho, selecciona `New > Java Class`, y nombra tu clase como `HolaMundoServlet`.
3. **Implementación del Método doGet**: Escribe el siguiente código en tu clase `HolaMundoServlet`:

```java
package com.example.holamundoservlets;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HolaMundo")
public class HolaMundoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hola Mundo Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola Mundo desde Servlets</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
```

   Este código creará un servlet que responderá a solicitudes GET mostrando un mensaje de "Hola Mundo" en formato HTML.

## Paso 3: Configuración de Archivos

- **Archivo `web.xml`**: Este archivo se encuentra en `WEB-INF` y normalmente se utiliza para configuraciones. Dado que estamos usando anotaciones en el servlet, no necesitarás modificar este archivo.
- **Archivo `pom.xml`**: Actualiza las dependencias para alinearlas con Jakarta EE 9.1:

  ```xml
  <dependency>
      <groupId>jakarta.servlet</groupId>
      <artifactId>jakarta.servlet-api</artifactId>
      <version>5.0.0</version>
      <scope>provided</scope>
  </dependency>
  ```

## Paso 4: Configuración del Servidor Tomcat

En la configuración de Tomcat dentro de IntelliJ:
- **URL del Proyecto**: Configura la URL como `http://localhost:8080/HolaMundoServlets_war_exploded/HolaMundo`.

## Paso 5: Ejecución y Verificación

1. **Compilación del Proyecto**: Usa `Build > Build Project` para compilar tu aplicación.
2. **Ejecución del Proyecto**: Ejecuta el proyecto seleccionando `Run 'Tomcat Server'`. Esto desplegará tu aplicación en el servidor Tomcat.
3. **Verificación en el Navegador**: Abre un navegador y visita `http://localhost:8080/HolaMundoServlets_war_exploded/HolaMundo` para ver tu aplicación en acción.

## Paso 6: Conclusión y Detención del Servidor

- Para detener el servidor Tomcat, utiliza el botón de detención en IntelliJ IDEA o detén el servidor desde el panel de servicios.

Con estos pasos, habrás creado y ejecutado con éxito tu primera aplicación web utilizando Servlets en IntelliJ IDEA Ultimate. ¡Excelente trabajo!
