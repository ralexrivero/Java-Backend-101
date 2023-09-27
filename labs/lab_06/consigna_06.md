**Lab 06: Generador automático de pedidos de restaurante**

---

**Objetivo:**
Desarrollar una aplicación en Java que emule un sistema de restaurante generando automáticamente una lista de pedidos recientes.

---

**Especificaciones:**

1. **Clase GeneradorPedidos:**
    - Debe contener las siguientes constantes para representar los tipos de pedidos:
        - ENTRADA
        - PLATO_PRINCIPAL
        - POSTRE
        - BEBIDA
        - COMBO
    - Debe contener un método auxiliar `obtenerIntAleatorio(int min, int max)` que retorne un número entero aleatorio entre `min` y `max`.
    - Debe contener un método principal `obtenerPedidos(int numeroPedidos)` que retorne una lista de pedidos generados aleatoriamente.
    - Debe contener un método `main` para probar la funcionalidad de la clase.

2. **Funcionamiento esperado:**
    - La aplicación debe ser capaz de generar una lista de pedidos aleatorios basados en las constantes definidas.
    - Cada pedido debe consistir en un tipo (entrada, plato principal, etc.) seguido de un plato específico (pollo, pasta, ensalada, etc.).
    - La lista generada debe ser mostrada en la consola.

---

**Consigna:**

1. Cree una nueva clase llamada `GeneradorPedidos`.
2. Defina las constantes para representar los tipos de pedidos.
3. Implemente el método auxiliar `obtenerIntAleatorio` que retorne un número aleatorio.
4. Implemente el método `obtenerPedidos`:
    - Inicialice una lista vacía para almacenar los pedidos.
    - Utilice un bucle para generar el número deseado de pedidos.
    - Para cada pedido, seleccione aleatoriamente un tipo y un plato.
    - Construya una cadena de texto para el pedido y añádala a la lista.
    - Retorne la lista de pedidos al final del método.
5. En el método `main`, cree una instancia de `GeneradorPedidos`, genere una lista de pedidos y muéstrelos en la consola.
6. Compile y ejecute su programa para asegurarse de que funcione correctamente.

---

**Criterios de evaluación:**

- Correcta implementación de las constantes y métodos en la clase `GeneradorPedidos`.
- Correcta generación de pedidos aleatorios.
- Correcta visualización de la lista de pedidos en la consola.
- Uso adecuado de estructuras de control y bucles.
- Claridad y limpieza del código.

---

**Entregables:**
Archivo `.java` con la implementación de la clase `GeneradorPedidos`.

---

**Consejos adicionales:**
- Asegurate de probar diferentes números de pedidos para verificar la correcta funcionalidad de su programa.
- Utiliza comentarios en su código para explicar cualquier parte que pueda ser confusa para otros desarrolladores.
- Revise las especificaciones y la consigna cuidadosamente para asegurarse de que ha cumplido con todos los requisitos.
