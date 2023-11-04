SELECT id_curso, AVG(calificacion) as promedio_calificacion
FROM calificaciones
GROUP BY id_curso
HAVING promedio_calificacion > 5;

SELECT id_curso, AVG(calificacion) as promedio_calificacion
FROM calificaciones
GROUP BY id_curso;

SELECT id_curso, COUNT(*) AS TotalEstudiantes
FROM matriculas
GROUP BY id_curso;

SELECT id_curso, MAX(calificacion) AS CalificaicionMaxima
FROM calificaciones
GROUP BY id_curso;

SELECT id_curso, MIN(calificacion) AS CalificaicionMinima
FROM calificaciones
GROUP BY id_curso;


SELECT
    cursos.nombre AS NombreCurso,
    AVG(calificaciones.calificacion) AS PromedioNotas
FROM
    cursos
JOIN
    calificaciones ON cursos.id = calificaciones.id_curso
GROUP BY
    cursos.id
ORDER BY
    PromedioNotas ASC
LIMIT 5;


SELECT
    cursos.nombre AS NombreCurso,
    AVG(calificaciones.calificacion) AS PromedioNotas
FROM
    cursos
JOIN
    calificaciones ON cursos.id = calificaciones.id_curso
GROUP BY
    cursos.id
HAVING
    PromedioNotas <= 5
ORDER BY
    PromedioNotas ASC;

SELECT
    estudiantes.nombre AS NombreEstudiante,
    estudiantes.apellido AS ApellidoEstudiante,
    cursos.nombre AS NombreCurso,
    profesores.nombre AS NombreProfesor,
    profesores.apellido AS ApellidoProfesor,
    MAX(matriculas.fecha_matricula) AS UltimaMatricula,
    AVG(calificaciones.calificacion) AS PromedioCalificaciones
FROM
    estudiantes
JOIN
    matriculas ON estudiantes.id = matriculas.id_estudiante
JOIN
    cursos ON matriculas.id_curso = cursos.id
JOIN
    profesores ON cursos.id_profesor = profesores.id
LEFT JOIN
    calificaciones ON estudiantes.id = calificaciones.id_estudiante AND cursos.id = calificaciones.id_curso
GROUP BY
    estudiantes.id, cursos.id, profesores.id;


SELECT
    CONCAT(e.nombre, ' ', e.apellido) AS 'Nombre del estudiante',
    cu.nombre AS Curso,
    CONCAT(p.nombre, ' ', p.apellido) AS 'Nombre del profesor',
    MAX(m.fecha_matricula) AS 'Ultima inscripcion',
    AVG(c.calificacion) AS 'Promedio de notas'
FROM
    estudiantes e
JOIN
    matriculas m ON e.id = m.id_estudiante
JOIN
    cursos cu ON m.id_curso = cu.id
JOIN
    profesores p ON cu.id_profesor = p.id
LEFT JOIN
    calificaciones c ON e.id = c.id_estudiante AND cu.id = c.id_curso
GROUP BY
    e.id, cu.id, p.id;






-- almacenar toda la actividad, sentencias y resultados en un archivo
tee c:\\mysql\out_11_01
-- Logging to file 'c:\\mysql\out_11_01'

SHOW DATABASES;

USE academia;
Database changed
SHOW TABLES;

SELECT * FROM cursos;

SELECT id_curso, MIN(calificacion) AS CalificaicionMinima
FROM calificaciones
GROUP BY id_curso;

SELECT
estudiantes.id,
estudiantes.nombre,
estudiantes.apellido,
AVG(calificaciones.calificacion) AS promedio_notas

FROM estudiantes
JOIN
calificaciones ON estudiantes.id = calificaciones.id_estudiante
GROUP BY
estudiantes.id, estudiantes.nombre, estudiantes.apellido;

SELECT
estudiantes.nombre,
estudiantes.apellido,
cursos.nombre AS materia,
calificaciones.calificacion

FROM
    estudiantes
JOIN
    calificaciones ON estudiantes.id = calificaciones.id_estudiante
JOIN
    cursos ON calificaciones.id_curso = cursos.id
WHERE
    calificaciones.calificacion < 5;

SELECT
    cursos.nombre AS NombreCurso,
    AVG(calificaciones.calificacion) AS PromedioNotas
FROM
    cursos
JOIN
    calificaciones ON cursos.id = calificaciones.id_curso
GROUP BY
    cursos.id
ORDER BY
    PromedioNotas ASC
LIMIT 5;

SELECT
    cursos.nombre AS NombreCurso,
    AVG(calificaciones.calificacion) AS PromedioNotas
FROM
    cursos
JOIN
    calificaciones ON cursos.id = calificaciones.id_curso
GROUP BY
    cursos.id
HAVING
    PromedioNotas <= 5;

SELECT
    cursos.nombre AS NombreCurso,
    AVG(calificaciones.calificacion) AS PromedioNotas
FROM
    cursos
JOIN
    calificaciones ON cursos.id = calificaciones.id_curso
GROUP BY
    cursos.id
HAVING
    PromedioNotas <= 5
ORDER BY
    PromedioNotas ASC;

SELECT
    estudiantes.nombre AS NombreEstudiante,
    estudiantes.apellido AS ApellidoEstudiante,
    cursos.nombre AS NombreCurso,
    profesores.nombre AS NombreProfesor,
    profesores.apellido AS ApellidoProfesor,
    MAX(matriculas.fecha_matricula) AS UltimaMatricula,
    AVG(calificaciones.calificacion) AS PromedioCalificaciones
FROM
    estudiantes
JOIN
    matriculas ON estudiantes.id = matriculas.id_estudiante
JOIN
    cursos ON matriculas.id_curso = cursos.id
JOIN
    profesores ON cursos.id_profesor = profesores.id
LEFT JOIN
    calificaciones ON estudiantes.id = calificaciones.id_estudiante AND cursos.id = calificaciones.id_curso
GROUP BY
    estudiantes.id, cursos.id, profesores.id;

SELECT
    CONCAT(e.nombre, ' ', e.apellido) AS 'Nombre del estudiante',
    cu.nombre AS Curso,
    CONCAT(p.nombre, ' ', p.apellido) AS 'Nombre del profesor',
    MAX(m.fecha_matricula) AS 'Ultima inscripcion',
    AVG(c.calificacion) AS 'Promedio de notas'
FROM
    estudiantes e
JOIN
    matriculas m ON e.id = m.id_estudiante
JOIN
    cursos cu ON m.id_curso = cu.id
JOIN
    profesores p ON cu.id_profesor = p.id
LEFT JOIN
    calificaciones c ON e.id = c.id_estudiante AND cu.id = c.id_curso
GROUP BY
    e.id, cu.id, p.id;

SELECT * FROM cursos;

SELECT nombre FROM cursos;

SELECT nombre FROM estudiantes;

SELECT nombre FROM estudiantes

GROUP BY nombre;

SELECT nombre, COUNT(*) AS Cantidad
FROM estudiantes
GROUP BY nombre;

SELECT * FROM estudiantes;

DESC estudiantes;

DESC calificaciones;

SHOW CREATE TABLE calificaciones;

CREATE DATABASE hotel;

USE hotel;
Database changed

CREATE TABLE clientes (
id_cliente INT AUTO_INCREMENT PRIMARY KEY,
nombre_completo VARCHAR(255) NOT NULL,
numero_telefono VARCHAR(15) UNIQUE NOT NULL
);

CREATE TABLE reservas (
id_reserva INT AUTO_INCREMENT PRIMARY KEY,
id_cliente INT,
fecha_reserva DATE NOT NULL,
numero_invitados INT CHECK(numero_invitados <=8),
FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);

ALTER TABLE reservas
ADD CONSTRAINT fk_cliente
FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
ON DELETE CASCADE
ON UPDATE CASCADE;
