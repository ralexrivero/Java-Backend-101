### Ejercicio Final: Proyecto de Cierre - Aplicación de Tareas (To-Do List) - Formato Lab

#### Objetivo del Proyecto
Desarrollar una aplicación web interactiva de gestión de tareas (To-Do List) que integre todos los conceptos aprendidos durante el curso. La aplicación permitirá a los usuarios gestionar sus tareas diarias de manera eficiente y amigable.

#### Funcionalidades Requeridas

1. **Añadir Tareas:**
   - Los usuarios deben poder añadir nuevas tareas a la lista.
   - Cada tarea tendrá un título y, opcionalmente, una descripción.
   - **Pista:** Utiliza un formulario HTML para capturar la entrada del usuario.
   - **Snippet de Código:**
     ```html
     <form id="taskForm">
       <input type="text" id="taskTitle" placeholder="Título de la tarea" required>
       <textarea id="taskDescription" placeholder="Descripción (opcional)"></textarea>
       <button type="submit">Añadir Tarea</button>
     </form>
     ```

2. **Editar y Eliminar Tareas:**
   - Los usuarios deben poder editar el título y la descripción de las tareas.
   - Debe haber una opción para eliminar tareas de la lista.
   - **Pista:** Considera agregar botones de editar y eliminar junto a cada tarea.
   - **Snippet de Código:**
     ```html
     <div id="tasksContainer">
       <!-- Las tareas se mostrarán aquí -->
     </div>
     ```

3. **Marcar Tareas como Completadas:**
   - Los usuarios deben poder marcar tareas como completadas.
   - Las tareas completadas deben diferenciarse visualmente de las pendientes.
   - **Pista:** Usa una casilla de verificación para marcar las tareas completadas.
   - **Snippet de Código:**
     ```html
     <input type="checkbox" class="taskCheckbox">
     ```

4. **Filtrar Tareas por Estado(Opcional):**
   - Los usuarios deben poder filtrar la lista de tareas para mostrar todas, solo las activas o solo las completadas.
   - **Pista:** Implementa botones o enlaces para filtrar las tareas.
   - **Snippet de Código:**
     ```html
     <button id="filterAll">Todas</button>
     <button id="filterActive">Activas</button>
     <button id="filterCompleted">Completadas</button>
     ```

5. **Almacenamiento Local(Opcional):**
   - Las tareas deben persistir entre sesiones utilizando LocalStorage.
   - Al recargar la página, las tareas guardadas deben ser recuperadas y mostradas.
   - **Pista:** Aprende sobre `localStorage.setItem` y `localStorage.getItem`.
   - **Snippet de Código:**
     ```javascript
     localStorage.setItem('tasks', JSON.stringify(tasksArray));
     let storedTasks = JSON.parse(localStorage.getItem('tasks'));
     ```

#### Criterios de Evaluación

1. **Funcionalidad:** La aplicación debe cumplir con todos los requisitos funcionales descritos.
2. **Calidad del Código:** El código debe ser limpio, bien organizado y comentado adecuadamente.
3. **Interfaz de Usuario:** La interfaz debe ser intuitiva, limpia y responsiva.

#### Entrega y Presentación

- **Demostración:** Puedes compartir el trabajo en la clase y mostrar lo logrado.
- **Código:** Se revisará el código fuente para evaluar la calidad y las buenas prácticas implementadas.
- **Ronda de Preguntas:** Después de cada presentación, habrá una ronda de preguntas y comentarios para proporcionar retroalimentación constructiva.

#### Recomendaciones para el Desarrollo

- **Planificación:** Antes de comenzar a codificar, planifica la estructura de tu aplicación y los componentes que necesitarás.
- **Desarrollo Incremental:** Comienza con las funcionalidades básicas y ve añadiendo más características progresivamente.
- **Pruebas:** Prueba cada funcionalidad a medida que la desarrollas para asegurarte de que funciona como se espera.
- **Documentación:** Comenta tu código para explicar la lógica detrás de tus decisiones de programación.

#### Ayuda y Sugerencias

- **Estructura de la Aplicación:** Divide tu aplicación en secciones claras: formulario de entrada, lista de tareas, filtros, etc.
- **Uso de Eventos:** Aprende a manejar eventos como `click`, `submit`, y `change` para interactuar con el usuario.
- **Manipulación del DOM:** Practica cómo crear, modificar y eliminar elementos del DOM para actualizar la interfaz de usuario.
- **Validaciones:** Implementa validaciones en el formulario para garantizar la calidad de los datos ingresados.
- **Estilos:** Usa CSS para mejorar la apariencia de tu aplicación y hacerla más atractiva y fácil de usar.
- **Depuración:** Utiliza las herramientas de desarrollo del navegador para depurar tu código y solucionar problemas.

--

### Anexo: Tips de JavaScript

#### 1. Trabajar con Arrays
- **Uso de `map`, `filter`, y `reduce`:**
  - `map` para transformar elementos de un array.
  - `filter` para seleccionar elementos según una condición.
  - `reduce` para acumular un valor a partir de los elementos.
  - **Snippet:**
    ```javascript
    const numeros = [1, 2, 3, 4, 5];
    const dobles = numeros.map(numero => numero * 2);
    const mayoresQueTres = numeros.filter(numero => numero > 3);
    const suma = numeros.reduce((acumulador, valorActual) => acumulador + valorActual, 0);
    ```

#### 2. Manipulación del DOM
- **Seleccionar elementos:**
  - Usa `document.querySelector` para seleccionar un único elemento.
  - Usa `document.querySelectorAll` para seleccionar múltiples elementos.
  - **Snippet:**
    ```javascript
    const lista = document.querySelector('#miLista');
    const items = document.querySelectorAll('.item');
    ```

#### 3. Eventos
- **Agregar oyentes de eventos:**
  - Usa `addEventListener` para responder a eventos del usuario.
  - **Snippet:**
    ```javascript
    const boton = document.querySelector('#miBoton');
    boton.addEventListener('click', function() {
      console.log('Botón clickeado');
    });
    ```

#### 4. Trabajar con Formularios
- **Obtener valores de entrada:**
  - Usa `document.getElementById` o `querySelector` para obtener valores de los campos de formulario.
  - **Snippet:**
    ```javascript
    const formulario = document.querySelector('#miFormulario');
    formulario.addEventListener('submit', function(evento) {
      evento.preventDefault();
      const nombre = document.querySelector('#nombre').value;
      console.log(nombre);
    });
    ```

#### 5. Almacenamiento Local (LocalStorage)
- **Guardar y recuperar datos:**
  - Usa `localStorage.setItem` y `localStorage.getItem` para persistir datos entre sesiones.
  - **Snippet:**
    ```javascript
    // Guardar datos
    localStorage.setItem('clave', 'valor');

    // Recuperar datos
    const valor = localStorage.getItem('clave');
    ```

#### 6. Expresiones Regulares
- **Validar formatos de texto:**
  - Utiliza expresiones regulares para validar correos electrónicos, contraseñas, etc.
  - **Snippet:**
    ```javascript
    const validarEmail = email => /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/.test(email);
    ```

#### 7. Consejos Generales
- **Depuración:**
  - Usa `console.log` para depurar y entender el flujo de tu código.
- **Comentarios:**
  - Comenta tu código para explicar la lógica y facilitar su comprensión.
- **Pruebas:**
  - Prueba cada funcionalidad por separado antes de integrarla al proyecto.

#### 8. Recursos Adicionales
- **Documentación:**
  - Consulta la documentación de MDN Web Docs para profundizar en temas específicos de JavaScript y desarrollo web.
- **Foros y Comunidades:**
  - Participa en foros como Stack Overflow para resolver dudas y aprender de otros desarrolladores.
