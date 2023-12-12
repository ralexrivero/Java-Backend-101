### Lección Avanzada: Ampliación del Servlet "Hola Mundo"

#### Objetivo de la Lección
Expandiremos el servlet "Hola Mundo" para incluir un formulario HTML que reciba datos del usuario, procesar estos datos en el servlet y luego mostrar una respuesta personalizada. Esto ayudará a comprender cómo los servlets pueden interactuar con el usuario y procesar la información.

#### Paso 1: Preparación del Proyecto

1. Asegúrate de que tu proyecto `HolaMundoServlets` esté abierto en IntelliJ IDEA.
2. Verifica que el servidor Tomcat y todas las configuraciones previas estén intactas.

#### Paso 2: Creación de un Formulario HTML

1. En el directorio `src/main/webapp`, crea un nuevo archivo llamado `formulario.html`.
2. Escribe el siguiente código HTML para un formulario básico:

   ```html
   <!DOCTYPE html>
   <html>
   <head>
       <title>Formulario de Saludo</title>
   </head>
   <body>
       <form action="HolaMundo" method="POST">
           <label for="nombre">Introduce tu nombre:</label>
           <input type="text" id="nombre" name="nombre">
           <input type="submit" value="Enviar">
       </form>
   </body>
   </html>
   ```

   Este formulario enviará los datos a nuestro servlet existente.

#### Paso 3: Modificación del Servlet para Manejar POST

1. Abre la clase `HolaMundoServlet`.
2. Modifica el servlet para incluir el método `doPost`:

   ```java
   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String nombre = request.getParameter("nombre");
       response.setContentType("text/html;charset=UTF-8");
       try (PrintWriter out = response.getWriter()) {
           out.println("<!DOCTYPE html>");
           out.println("<html>");
           out.println("<head>");
           out.println("<title>Saludo Personalizado</title>");
           out.println("</head>");
           out.println("<body>");
           out.println("<h1>Hola, " + nombre + "!</h1>");
           out.println("</body>");
           out.println("</html>");
       }
   }
   ```

   Este método recogerá el nombre introducido en el formulario y responderá con un saludo personalizado.

#### Paso 4: Ejecución y Prueba

1. Compila y construye el proyecto.
2. Ejecuta la aplicación con Tomcat.
3. En un navegador, visita `http://localhost:8080/HolaMundoServlets_war_exploded/formulario.html`.
4. Introduce un nombre en el formulario y haz clic en enviar. Deberías ver un saludo personalizado basado en la entrada proporcionada.

#### Tarea

Expandir el servlet para manejar diferentes tipos de datos (como edad o correo electrónico) y mostrar respuestas más complejas basadas en esas entradas. También pueden experimentar con el diseño del formulario HTML y agregar validaciones en el lado del cliente.
