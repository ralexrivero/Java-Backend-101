Para mejorar el diseño de tu proyecto con CSS y agregar interacción con JavaScript, puedes seguir estos pasos. Primero, mejoraremos el aspecto visual del formulario y de los mensajes de error o éxito utilizando CSS. Luego, agregaremos un poco de interacción con JavaScript, como validaciones del lado del cliente.

### Paso 1: Agregar CSS para Mejorar el Diseño

Puedes agregar un archivo CSS para darle estilo al formulario y a los mensajes. Por ejemplo, crea un archivo llamado `styles.css` dentro de la carpeta `webapp` (puedes crear una subcarpeta `css` si prefieres organizar los archivos).

```css
/* styles.css */
body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    margin: 0;
    padding: 20px;
}

h1 {
    color: #333;
}

form {
    background: #fff;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

input[type="text"],
input[type="number"],
input[type="email"] {
    padding: 10px;
    margin: 10px 0;
    border: 1px solid #ddd;
    border-radius: 4px;
    width: calc(100% - 22px);
}

input[type="submit"] {
    background: #5cb85c;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type="submit"]:hover {
    background: #4cae4c;
}

.error-message {
    color: red;
}
```

Incluye este archivo CSS en tus páginas HTML agregando la siguiente línea dentro de la etiqueta `<head>`:

```html
<link rel="stylesheet" href="css/styles.css">
```

### Paso 2: Agregar JavaScript para Validación del Lado del Cliente

Puedes agregar un archivo JavaScript para realizar validaciones básicas antes de enviar el formulario. Por ejemplo, crea un archivo llamado `script.js` dentro de una carpeta `js` en `webapp`.

```javascript
// script.js
document.addEventListener("DOMContentLoaded", function() {
    const formulario = document.querySelector("form");

    formulario.addEventListener("submit", function(event) {
        let tieneErrores = false;
        const nombre = document.getElementById("nombre").value;
        const edad = document.getElementById("edad").value;
        const email = document.getElementById("email").value;

        if (!nombre.trim()) {
            alert("El nombre es obligatorio.");
            tieneErrores = true;
        }

        if (!edad || isNaN(edad) || edad <= 0) {
            alert("Ingrese una edad válida.");
            tieneErrores = true;
        }

        if (!email.match(/^[A-Za-z0-9+_.-]+@(.+)$/)) {
            alert("El email no es válido.");
            tieneErrores = true;
        }

        if (tieneErrores) {
            event.preventDefault(); // Evitar que el formulario se envíe
        }
    });
});
```

Incluye este archivo JavaScript en tus páginas HTML agregando la siguiente línea antes del cierre de la etiqueta `</body>`:

```html
<script src="js/script.js"></script>
```

### Explicación:

1. **CSS**: Los estilos CSS mejoran la apariencia del formulario y los mensajes de error o éxito, haciéndolos más amigables y profesionales.

2. **JavaScript**: El script añade validaciones simples en el lado del cliente. Si los datos no son válidos, se muestra un mensaje de alerta y se impide el envío del formulario.

Estas adiciones harán que tu aplicación web no solo sea funcional, sino también más atractiva y amigable para el usuario.
