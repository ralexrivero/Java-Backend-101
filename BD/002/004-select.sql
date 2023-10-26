-- SELECT * para elegir todos los campos
-- FROM clase_developers indica en que tabla se hace la consulta
-- ; indica que se finaliza la consulta y esta lista para ejecutarse

-- todos los registros de la tabla
SELECT * FROM clase_developers;
-- filtro por fecha mayor que
SELECT * FROM clase_developers WHERE fecha_registro > '2023-10-05';
-- ORDER BY para ordenar el resultado ASC (ascendente) DESC (descendente)
SELECT * FROM clase_developers ORDER BY apellido ASC;
SELECT * FROM clase_developers ORDER BY apellido DESC;
SELECT * FROM clase_developers ORDER BY fecha_registro DESC;
-- seleccionar que campos mostrar
SELECT nombre, apellido FROM clase_developers ORDER BY nombre DESC;