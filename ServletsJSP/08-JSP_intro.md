### Introducción Teórica a JSP (JavaServer Pages)

#### ¿Qué es JSP?
JavaServer Pages (JSP) es una tecnología del lado del servidor que permite a los desarrolladores crear páginas web dinámicas y ricas en contenido. JSP es parte de la familia de tecnologías Java EE (Enterprise Edition) y proporciona una forma efectiva de insertar lógica de servidor en páginas HTML.

#### Características Principales de JSP
- **Facilidad de Uso**: JSP es similar a HTML, lo que hace que sea más accesible para desarrolladores con experiencia en tecnologías web.
- **Incorporación de Código Java**: Permite incrustar fragmentos de código Java en el HTML a través de etiquetas especiales.
- **Soporte de Tag Libraries**: JSP admite el uso de bibliotecas de etiquetas (tag libraries), que son conjuntos de acciones personalizadas definidas por el usuario que extienden la funcionalidad de las páginas JSP.

#### Ventajas de JSP
- **Separación de Lógica y Presentación**: JSP promueve una clara separación entre la lógica de la aplicación y la interfaz de usuario, facilitando el mantenimiento y la escalabilidad de las aplicaciones web.
- **Integración con Servlets**: JSP puede usarse en combinación con Servlets, donde los Servlets manejan la lógica de negocios y las páginas JSP se encargan de la presentación.

---

### Lección Práctica: Creación de una Página JSP Básica

#### Entorno y Herramientas
- **IDE**: IntelliJ IDEA Ultimate
- **JDK**: OpenJDK 21
- **Java EE Version**: Jakarta EE 9.1
- **Group ID en Maven**: `com.example`

#### Paso 1: Configuración del Proyecto
1. **Abrir IntelliJ IDEA Ultimate** y seleccionar `File > New > Project`.
2. En el panel lateral, seleccionar `Java Enterprise`. En el panel central, asegurarse de que `Web Application` esté marcado.
3. **Configurar JDK y Servidor de Aplicaciones**: Elegir OpenJDK 21 y configurar el servidor Apache Tomcat seleccionándolo de la lista.
4. **Nombrar el Proyecto**: Por ejemplo, `MiPrimeraJSP`.
5. **Group ID**: Introducir `com.example`.
6. Finalizar la creación del proyecto haciendo clic en `Next` y luego en `Finish`.

#### Paso 2: Creación de una Página JSP
1. En el árbol del proyecto, navegar a `src > main > webapp`.
2. Hacer clic derecho en el directorio `webapp` y seleccionar `New > JSP`.
3. Nombrar el archivo JSP. Por ejemplo, `saludo.jsp`.
4. Escribir el siguiente código básico en `saludo.jsp`:

   ```jsp
   <%@ page contentType="text/html;charset=UTF-8" language="java" %>
   <html>
   <head>
       <title>Mi Primera Página JSP</title>
   </head>
   <body>
       <h1>¡Hola, mundo desde JSP!</h1>
   </body>
   </html>
   ```

   Este código crea una estructura básica HTML con un título y un mensaje.

#### Paso 3: Ejecución y Prueba
1. **Construir el Proyecto**: Ir a `Build > Build Project`.
2. **Desplegar la Aplicación**: Hacer clic derecho en el proyecto y seleccionar `Run 'Tomcat Server'`.
3. **Verificar en el Navegador**: Una vez que el servidor esté funcionando, abrir un navegador y visitar `http://localhost:8080/MiPrimeraJSP_war_exploded/saludo.jsp`. Deberías ver el mensaje "¡Hola, mundo desde JSP!".
