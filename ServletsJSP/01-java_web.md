# Introducción a las Aplicaciones Web con Java Servlets y JSP

Enesta primera lección, exploraremos los fundamentos de la World Wide Web (WWW) y su relevancia en el desarrollo de aplicaciones web modernas. Nuestro enfoque se centrará en cómo Java Servlets y JSP (JavaServer Pages) juegan un papel crucial en este ámbito. Prepárense para sumergirse en un viaje de aprendizaje que les abrirá las puertas al emocionante mundo del desarrollo web con Java.

## La Evolución de la Web: De Sitios Estáticos a Aplicaciones Dinámicas

Inicialmente, la web estaba compuesta principalmente por sitios estáticos, donde el contenido debía actualizarse manualmente. Sin embargo, con el advenimiento de las aplicaciones web, esta dinámica cambió radicalmente. Ahora, la información puede recuperarse y actualizarse de manera dinámica, lo que ha revolucionado la forma en que interactuamos con internet.

### El Papel de JavaScript y sus Limitaciones

Aunque JavaScript añade interactividad en el lado del cliente (navegador), tiene limitaciones, especialmente en lo que respecta a la interacción con bases de datos y otras fuentes de datos externas. Aquí es donde entran en juego las aplicaciones web del lado del servidor, como las que desarrollaremos con Java Servlets y JSP.

## Arquitectura de una Aplicación Web en Java

En el corazón de una aplicación web en Java, encontramos varias capas lógicas, cada una con su función específica:

1. **Capa de Cliente:** Aquí, el navegador web es el encargado de realizar peticiones al servidor y mostrar la información al usuario. Utiliza tecnologías como HTML, CSS y JavaScript.

2. **Capa Web del Servidor:** Es donde los Servlets y JSP entran en acción. Estas tecnologías nos permiten procesar peticiones HTTP, interactuar con otras capas y generar respuestas dinámicas.

3. **Capa de Negocio:** Aquí se manejan las reglas de negocio mediante objetos Java, conocidos como JavaBeans o POJOs (Plain Old Java Objects). También se pueden utilizar frameworks como Spring para gestionar aspectos como la seguridad y la transaccionalidad.

4. **Capa de Acceso a Datos:** Tratada en otros cursos, como JDBC y JPA, esta capa se encarga de la interacción con bases de datos y otras fuentes de datos.

## Procesamiento de una Petición HTTP

El flujo típico en una aplicación web sigue el modelo cliente-servidor a través del protocolo HTTP:

1. **Petición del Cliente:** Un usuario, a través de un navegador, realiza una petición HTTP al servidor (por ejemplo, Tomcat, GlassFish, etc.).

2. **Procesamiento en el Servidor:** El servidor procesa esta petición, interactuando con las capas necesarias (negocio, acceso a datos).

3. **Respuesta al Cliente:** Finalmente, el servidor envía una respuesta al cliente, que se visualiza en el navegador.

Este proceso subraya la importancia del protocolo HTTP como medio de comunicación entre el navegador y el servidor.

## Objetivos del modulo

En este capitulo, nos enfocaremos en:

- Crear y entender la capa web utilizando Servlets y JSP.
- Aplicar las mejores prácticas y patrones de diseño para desarrollar aplicaciones web robustas, extensibles y escalables.
- Explorar el ciclo completo de desarrollo, desde la recepción de la petición HTTP hasta la generación de la respuesta.
