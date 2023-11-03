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
