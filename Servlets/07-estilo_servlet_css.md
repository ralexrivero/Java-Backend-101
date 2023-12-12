Para agregar estilos CSS a la página HTML generada por tu servlet, tienes varias opciones. Una de ellas es incluir el CSS directamente en el HTML generado por el servlet. Otra opción es vincular a un archivo CSS externo. Te mostraré ambas maneras.

### Opción 1: Incluir CSS Directamente en el HTML Generado por el Servlet

Puedes escribir los estilos CSS directamente dentro de una etiqueta `<style>` en la sección `<head>` del HTML generado por el servlet. Por ejemplo:

```java
// En tu método doGet o doPost
response.setContentType("text/html;charset=UTF-8");
try (PrintWriter out = response.getWriter()) {
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Saludo Personalizado</title>");
    out.println("<style>");
    out.println("body { font-family: Arial, sans-serif; background-color: #f4f4f4; }");
    out.println("h1 { color: #333; }");
    out.println("</style>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Hola, " + nombre + "!</h1>");
    out.println("</body>");
    out.println("</html>");
}
```

### Opción 2: Vincular a un Archivo CSS Externo

Primero, crea un archivo CSS en tu directorio `webapp`. Por ejemplo, `webapp/css/styles.css`:

```css
/* webapp/css/styles.css */
body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
}
h1 {
    color: #333;
}
```

Luego, modifica tu servlet para incluir un enlace a este archivo CSS:

```java
// En tu método doGet o doPost
response.setContentType("text/html;charset=UTF-8");
try (PrintWriter out = response.getWriter()) {
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Saludo Personalizado</title>");
    out.println("<link rel='stylesheet' type='text/css' href='css/styles.css'>"); // Enlace al CSS
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Hola, " + nombre + "!</h1>");
    out.println("</body>");
    out.println("</html>");
}
```

En este caso, el servlet genera HTML que incluye un enlace a un archivo CSS externo. Asegúrate de que la ruta al archivo CSS sea correcta en relación con la ubicación de tu servlet en la estructura del proyecto.

### Nota:

- La primera opción es útil para estilos específicos de una sola página o para aplicaciones más pequeñas y especialmente para pruebas, pero no es una buena práctica para producción.
- La segunda opción es mejor para mantener la coherencia en estilos a través de múltiples páginas y facilita la gestión de cambios en los estilos.