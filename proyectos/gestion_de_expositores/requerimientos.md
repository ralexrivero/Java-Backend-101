# Gestion de Expositores

#### **Objetivo del Proyecto:**
Desarrollar un sistema en Java que permita gestionar una lista de alumnos y, cada día, seleccionar uno al azar como el expositor del día siguiente. Además, el sistema debe permitir asignar notas a cada participación y calcular el promedio de las mismas.

---

#### **Requisitos:**
- El sistema debe ser completamente ejecutable desde la línea de comandos.
- La información de los alumnos y sus exposiciones debe persistir entre ejecuciones utilizando archivos de texto.

---

#### **Consignas:**

1. **Modelado de Alumno:**
   - Crear una clase `Alumno` que contenga la información relevante del estudiante y sus exposiciones.
   - Implementar métodos para calcular el promedio de las notas de las exposiciones del alumno.

2. **Gestión de Alumnos:**
   - Desarrollar una clase `GestorDeAlumnos` que permita agregar alumnos y seleccionar un expositor al azar.
   - Implementar lógica para que un alumno no sea seleccionado nuevamente hasta que todos hayan sido seleccionados al menos una vez.

3. **Interfaz de Usuario:**
   - Implementar una clase principal `GestionExpositores` que permita interactuar con el usuario a través de la línea de comandos.
   - La interfaz debe permitir: agregar alumnos, seleccionar un expositor, asignar una nota al último expositor, y visualizar la lista de alumnos con sus respectivas notas y promedios.

4. **Persistencia de Datos:**
   - Implementar la funcionalidad para guardar y cargar la lista de alumnos y sus respectivas notas y exposiciones utilizando `InputStream` y `OutputStream`.

---

#### **Entregables:**
- Código fuente de las clases `Alumno`, `GestorDeAlumnos`, y `GestionExpositores`.
- Un breve informe documentando cualquier desafío o problema encontrado durante el desarrollo y cómo se resolvió.

---
