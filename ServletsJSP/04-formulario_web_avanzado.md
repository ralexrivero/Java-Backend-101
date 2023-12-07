# Lección: Expansión del Servlet para Manejar Datos Adicionales

Vamos a expandir el servlet "Hola Mundo" para manejar datos adicionales como la edad y el correo electrónico del usuario. Este enfoque nos ayudará a entender cómo procesar múltiples entradas y generar respuestas más detalladas.

### Objetivos de Aprendizaje:
1. Procesar múltiples entradas en un servlet.
2. Generar respuestas personalizadas en base a estas entradas.
3. Experimentar con el diseño de formularios HTML y validaciones básicas.

### Paso 1: Creación de un Formulario HTML Mejorado

1. Modifica el archivo `formulario.html` para incluir campos adicionales:

    ```html
    <!DOCTYPE html>
    <html>
    <head>
        <title>Formulario de Información</title>
    </head>
    <body>
        <form action="HolaMundo" method="POST">
            <label for="nombre">Nombre:</label>
            <input type="text" id="nombre" name="nombre"><br>

            <label for="edad">Edad:</label>
            <input type="number" id="edad" name="edad"><br>

            <label for="email">Correo Electrónico:</label>
            <input type="email" id="email" name="email"><br>

            <input type="submit" value="Enviar">
        </form>
    </body>
    </html>
    ```

### Paso 2: Modificación del Servlet para Procesar Datos Adicionales

1. En la clase `HolaMundoServlet`, amplía el método `doPost` para procesar los nuevos campos:

    ```java
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String email = request.getParameter("email");

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Información del Usuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Detalles del Usuario</h1>");
            out.println("<p>Nombre: " + nombre + "</p>");
            out.println("<p>Edad: " + edad + "</p>");
            out.println("<p>Correo Electrónico: " + email + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    ```

### Paso 3: Ejecución y Prueba

1. **Construye y Ejecuta el Proyecto**: Compila tu proyecto y ejecútalo con Tomcat.
2. **Prueba el Formulario**: Ve a `http://localhost:8080/HolaMundoServlets_war_exploded/formulario.html`, rellena los campos y observa la respuesta generada.

### Paso 4: Tarea para los Alumnos

- **Mejora de Validación**: Añade validaciones del lado del cliente en el formulario HTML utilizando JavaScript para asegurarte de que todos los campos se llenen correctamente antes de enviar.
- **Diseño y Estilo**: Experimenta con CSS para mejorar el diseño del formulario.
- **Funcionalidad Avanzada**: Intenta añadir más campos y procesarlos en el servlet para generar respuestas aún más detalladas.

### Tarea

Agregar validaciones del lado del servidor.
