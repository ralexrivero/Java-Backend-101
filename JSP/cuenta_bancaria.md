### Lección sobre Desarrollo de Aplicaciones Web con Java: "Manejando una Cuenta Bancaria"

Bienvenidos a esta clase donde aprenderemos a desarrollar una aplicación web en Java que maneje una cuenta bancaria. Usaremos tecnologías como JSP, Servlets y Jakarta EE. Vamos a comenzar con una explicación paso a paso del ejercicio que desarrollamos.

---

#### Parte 1: Introducción al Escenario y Objetivos

**Objetivo del Ejercicio**: Crear una aplicación web que permita a los usuarios depositar y retirar dinero de una cuenta bancaria después de verificar sus credenciales.

**Herramientas y Tecnologías Utilizadas**:
- **Java**: Lenguaje de programación.
- **Jakarta EE (anteriormente Java EE)**: Plataforma para aplicaciones empresariales.
- **Servlets**: Usados para manejar solicitudes y respuestas en aplicaciones web.
- **JSP (JavaServer Pages)**: Tecnología para crear páginas web dinámicas.
- **Tomcat**: Servidor web que soporta aplicaciones Java.
- **IntelliJ IDEA**: IDE para desarrollo en Java.

---

#### Parte 2: Creación de la Clase `CuentaBanco`

**Archivo**: `CuentaBanco.java`

**Ubicación**: Dentro del paquete `com.banco.logica`.

**Contenido y Explicación**:

1. **Declaración de la Clase y Atributos**:
   - `private String usuario;` - Nombre de usuario de la cuenta.
   - `private String contrasenia;` - Contraseña de la cuenta.
   - `private double saldo;` - Saldo actual en la cuenta.

2. **Constructor de la Clase**:
   - Inicializa una nueva cuenta bancaria con un usuario, contraseña y saldo iniciales.

3. **Métodos `depositar` y `retirar`**:
   - `depositar`: Agrega dinero al saldo si las credenciales son correctas.
   - `retirar`: Retira dinero del saldo si las credenciales son correctas y hay suficiente saldo.

4. **Getters y Setters**:
   - Métodos para obtener y establecer los valores de los atributos.

**Código**: [Mostrar el código `CuentaBanco.java`]

---

#### Parte 3: Creación del Servlet `CuentaServlet`

**Archivo**: `CuentaServlet.java`

**Ubicación**: Dentro del paquete `com.banco.servlet`.

**Contenido y Explicación**:

1. **Definición del Servlet**:
   - Extiende `HttpServlet` y se anota con `@WebServlet` para definir la URL del servlet.

2. **Instancia de `CuentaBanco`**:
   - Crea una instancia de `CuentaBanco` con datos predeterminados.

3. **Método `doPost`**:
   - Obtiene datos del formulario (usuario, contraseña, cantidad).
   - Realiza operaciones de depósito o retiro basadas en la acción seleccionada.
   - Configura el saldo resultante como un atributo de solicitud para mostrarlo en una página JSP.

**Código**: [Mostrar el código `CuentaServlet.java`]

---

#### Parte 4: Diseño de la Interfaz de Usuario con JSP

1. **`cuentaBanco.jsp`**:
   - Formulario para ingresar usuario, contraseña y cantidad.
   - Botones para depositar y retirar.

2. **`resultado.jsp`**:
   - Muestra el resultado de la operación (saldo actualizado).

**Explicación**:
- Estas páginas JSP permiten a los usuarios interactuar con la aplicación web.

**Código**: [Mostrar el código de las páginas JSP]

---

#### Parte 5: Demostración y Práctica

**Actividad**:
- Realizar una demostración en vivo de la aplicación, ejecutando el servidor Tomcat y mostrando cómo la aplicación funciona en un navegador web.
- Invitar a los estudiantes a probar el código en sus propios entornos de desarrollo.

**Preguntas y Respuestas**:
- Responder preguntas de los estudiantes y aclarar dudas.

---

#### Conclusión y Tareas

**Resumen**:
- Repaso de los conceptos clave aprendidos.
- Importancia de separar la lógica de negocio (Java) de la presentación (JSP) y el control (Servlets).

**Tarea**:
- Modificar la aplicación para añadir nuevas características como la generación de estados de cuenta.

