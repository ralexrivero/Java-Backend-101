# Lección: Creación de un "Hola Mundo" con Servlets en IntelliJ IDEA Ultimate usando Tomcat

En esta lección donde aprenderemos a crear una aplicación web simple "Hola Mundo" utilizando Servlets en IntelliJ IDEA Ultimate con el servidor Apache Tomcat. Asegúrate de tener instalado IntelliJ IDEA Ultimate y Apache Tomcat para seguir este tutorial.

## Paso 1: Configuración del Proyecto

1. **Abrir IntelliJ IDEA Ultimate**: Inicia IntelliJ IDEA.

2. **Crear Nuevo Proyecto**: Ve a `File > New > Project`.

3. **Seleccionar Plantilla de Proyecto**: En la ventana de nuevo proyecto, selecciona `Java Enterprise` en el panel lateral. En el panel central, elige `Web Application`. Esto incluirá automáticamente Servlet, `web.xml`, e `index.jsp` en tu proyecto.

4. **Nombrar el Proyecto**: Nombra tu proyecto como `HolaMundoServlets` y elige una ubicación adecuada para guardarlo.

5. **Configurar el JDK y el Servidor de Aplicaciones**: Asegúrate de seleccionar el JDK correcto (por ejemplo, JDK 1.8). Luego, en el apartado de `Application Server`, selecciona tu instalación de Apache Tomcat. Si no has configurado Tomcat en IntelliJ IDEA, haz clic en `New...` y navega hasta la carpeta de instalación de Tomcat.

6. **Finalizar la Configuración**: Haz clic en `Next` y luego en `Finish`. IntelliJ IDEA creará el proyecto para ti.

## Paso 2: Creación del Servlet

1. **Eliminar Clases Innecesarias**: Si IntelliJ IDEA ha generado alguna clase de ejemplo, puedes eliminarlas.

2. **Crear la Clase Servlet**: Haz clic derecho en el directorio `src` y selecciona `New > Java Class`. Nombra la clase como `HolaMundoServlet`.

3. **Extender HttpServlet y Sobrescribir doGet**: En tu clase `HolaMundoServlet`, escribe el siguiente código:

    ```java
    import javax.servlet.*;
    import javax.servlet.http.*;
    import java.io.IOException;

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

    Este código define un servlet básico que responde a las peticiones GET con un simple "Hola Mundo" en formato HTML.

## Paso 3: Configuración del `web.xml`

Aunque estamos utilizando anotaciones para definir nuestro servlet, es bueno conocer el archivo `web.xml`, que se encuentra en `WEB-INF`. Por ahora, puedes dejar este archivo como está, ya que las anotaciones en nuestro servlet son suficientes para su configuración.

## Paso 4: Ejecutar la Aplicación

1. **Construir el Proyecto**: Ve a `Build > Build Project` para compilar tu proyecto.

2. **Ejecutar el Proyecto**: Haz clic derecho en el proyecto y selecciona `Run 'Tomcat Server'`. Esto iniciará el servidor Tomcat y desplegará tu aplicación.

3. **Verificar la Aplicación**: Abre un navegador web y ve a `http://localhost:8080/HolaMundoServlets/HolaMundo`. Deberías ver el mensaje "Hola Mundo desde Servlets" en tu navegador.

## Paso 5: Detener el Servidor

Para detener el servidor Tomcat, puedes hacer clic en el botón de detener (stop) en la consola de IntelliJ IDEA o ir al panel de servicios y detener el servidor desde allí.
