Para desarrollar un ejercicio que integre un Servlet con JSP en Java, siguiendo un enfoque paso a paso, te guiaré a través de la creación de un proyecto sencillo que permita al usuario ingresar su nombre en un formulario HTML. El Servlet procesará esta información y la enviará a una página JSP para mostrar un saludo personalizado. A continuación, encontrarás una explicación detallada con todo el código necesario.

### Ejemplo: Integración de Servlet con JSP

#### Paso 1: Crear el Servlet (`SaludoServlet.java`)

1. **Creación de la Clase Servlet**:
   - En tu IDE (IntelliJ IDEA), crea una nueva clase Java en el directorio 'src' llamada `SaludoServlet`.
   - Escribe el siguiente código:

     ```java
     package com.miapp.servlet;

     import javax.servlet.*;
     import javax.servlet.http.*;
     import java.io.IOException;

     public class SaludoServlet extends HttpServlet {
         protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             String nombre = request.getParameter("nombre");
             request.setAttribute("nombreUsuario", nombre);
             RequestDispatcher dispatcher = request.getRequestDispatcher("saludo.jsp");
             dispatcher.forward(request, response);
         }
     }
     ```

   - **Explicación**:
     - El Servlet extiende `HttpServlet` y sobrescribe el método `doPost`.
     - Recupera el nombre del usuario del formulario y lo pasa a `saludo.jsp` usando `RequestDispatcher`.

#### Paso 2: Configuración en `web.xml`

1. **Editar `web.xml`**:
   - En `src/main/webapp/WEB-INF`, edita o crea un archivo `web.xml`.
   - Agrega la siguiente configuración:

     ```xml
     <web-app>
         <servlet>
             <servlet-name>SaludoServlet</servlet-name>
             <servlet-class>com.miapp.servlet.SaludoServlet</servlet-class>
         </servlet>
         <servlet-mapping>
             <servlet-name>SaludoServlet</servlet-name>
             <url-pattern>/saludar</url-pattern>
         </servlet-mapping>
     </web-app>
     ```

   - **Explicación**:
     - Configura el servlet y su mapeo de URL. El servlet se activará cuando se acceda a la URL `/saludar`.

#### Paso 3: Crear la Página JSP (`saludo.jsp`)

1. **Crear el Archivo JSP**:
   - En el directorio `src/main/webapp`, crea un archivo llamado `saludo.jsp`.
   - Añade el siguiente código:

     ```jsp
     <%@ page contentType="text/html;charset=UTF-8" language="java" %>
     <html>
     <head>
         <title>Saludo</title>
     </head>
     <body>
         <h1>Hola, <%= request.getAttribute("nombreUsuario") %>!</h1>
     </body>
     </html>
     ```

   - **Explicación**:
     - El JSP recibe el nombre del usuario del Servlet y lo muestra en un mensaje de saludo.

#### Paso 4: Crear un Formulario HTML para Enviar Datos (`index.html`)

1. **Crear el Archivo HTML**:
   - En `src/main/webapp`, crea un archivo `index.html`.
   - Escribe el siguiente HTML:

     ```html
     <html>
     <head>
         <title>Introduce tu nombre</title>
     </head>
     <body>
         <form action="saludar" method="POST">
             Introduce tu nombre: <input type="text" name="nombre">
             <input type="submit" value="Saludar">
         </form>
     </body>
     </html>
     ```

   - **Explicación**:
     - Un formulario HTML simple que envía una solicitud POST al Servlet cuando se presiona "Saludar".

#### Paso 5: Ejecutar y Probar la Aplicación

1. **Despliegue y Pruebas**:
   - Despliega la aplicación en Tomcat usando IntelliJ IDEA.
   - Accede a `http://localhost:8080/nombreDelProyecto` y deberías ver el formulario HTML.
   - Ingresa un nombre, haz clic en "Saludar" y serás redirigido a `saludo.jsp` con un mensaje personalizado.

#### Conclusión

En esta lección, has aprendido a integrar un Servlet con una página JSP en una aplicación Java. Este patrón de diseño es común en aplicaciones web, donde un Servlet maneja la lógica del negocio y los JSP se utilizan

 para la presentación.

#### Tarea para los Alumnos

Como ejercicio adicional, intenta modificar el proyecto para incluir más funcionalidades. Por ejemplo, podrías agregar más campos al formulario y modificar el Servlet y el JSP para manejar estos nuevos datos. Esto reforzará tu comprensión de cómo los Servlets y JSP trabajan juntos en aplicaciones web dinámicas.
