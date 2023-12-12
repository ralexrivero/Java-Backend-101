Para integrar la lógica de un Servlet con JSP, vamos a crear un formulario web simple en un archivo JSP, que enviará datos a un Servlet. El Servlet procesará estos datos (realizando algunas validaciones) y luego enviará los resultados a otro JSP para su visualización.

### Paso 1: Crear Formulario JSP

1. **Crear `formulario.jsp`**:
   - En el directorio `src/main/webapp`, crea un nuevo archivo llamado `formulario.jsp`.
   - Agrega un formulario HTML simple:

     ```jsp
     <%@ page contentType="text/html;charset=UTF-8" language="java" %>
     <html>
     <head>
         <title>Formulario</title>
     </head>
     <body>
     <h2>Introduce tus datos</h2>
     <form action="procesarFormulario" method="POST">
         Nombre: <input type="text" name="nombre"><br>
         Edad: <input type="number" name="edad"><br>
         <input type="submit" value="Enviar">
     </form>
     </body>
     </html>
     ```

### Paso 2: Crear Servlet para Procesar el Formulario

2. **Crear `ProcesarFormularioServlet.java`**:
   - En `src/main/java`, en el paquete `com.example.miprimerajsp`, crea una nueva clase Java llamada `ProcesarFormularioServlet`.
   - Escribe el siguiente código:

     ```java
     package com.example.miprimerajsp;

     import jakarta.servlet.*;
     import jakarta.servlet.http.*;
     import java.io.IOException;

     public class ProcesarFormularioServlet extends HttpServlet {
         @Override
         protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             String nombre = request.getParameter("nombre");
             String edad = request.getParameter("edad");

             // Validaciones simples
             boolean esValido = nombre != null && !nombre.isEmpty() && edad != null && !edad.isEmpty();

             if (esValido) {
                 request.setAttribute("nombre", nombre);
                 request.setAttribute("edad", edad);
                 getServletContext().getRequestDispatcher("/resultado.jsp").forward(request, response);
             } else {
                 getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);
             }
         }
     }
     ```

### Paso 3: Configuración del `web.xml`

3. **Actualizar `web.xml`**:
   - En `WEB-INF`, actualiza el `web.xml` para incluir el nuevo servlet:

     ```xml
     <servlet>
         <servlet-name>ProcesarFormularioServlet</servlet-name>
         <servlet-class>com.example.miprimerajsp.ProcesarFormularioServlet</servlet-class>
     </servlet>
     <servlet-mapping>
         <servlet-name>ProcesarFormularioServlet</servlet-name>
         <url-pattern>/procesarFormulario</url-pattern>
     </servlet-mapping>
     ```

### Paso 4: Crear JSP para Mostrar Resultados

4. **Crear `resultado.jsp` y `error.jsp`**:
   - En `src/main/webapp`, crea `resultado.jsp` y `error.jsp`.
   - En `resultado.jsp`, muestra los datos procesados:

     ```jsp
     <%@ page contentType="text/html;charset=UTF-8" language="java" %>
     <html>
     <head>
         <title>Resultado</title>
     </head>
     <body>
     <h2>Resultado del Formulario</h2>
     <p>Nombre: ${nombre}</p>
     <p>Edad: ${edad}</p>
     </body>
     </html>
     ```

   - En `error.jsp`, muestra un mensaje de error:

     ```jsp
     <%@ page contentType="text/html;charset=UTF-8" language="java" %>
     <html>
     <head>
         <title>Error</title>
     </head>
     <body>
     <h2>Error en el formulario</h2>
     <p>Por favor, introduce todos los datos.</p>
     </body>
     </html>
     ```

### Paso 5: Ejecutar y Probar

5. **Despliega y Prueba la Aplicación**:
   - Ejecuta tu proyecto en Tomcat.
   - Abre `http://localhost:8080/miprimerajsp_war_exploded/formulario.jsp`, completa el formulario y observa el resultado.
