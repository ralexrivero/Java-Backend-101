-- DELETE FROM nombre_tabla
-- WHERE condicion;

-- borra varios registros
DELETE FROM clase_developers
WHERE nombre = 'Carlos';

-- confirmo que se borraron los registros
SELECT * FROM clase_developers WHERE nombre = 'Carlos';

-- borra un registro
SELECT * FROM clase_developers WHERE id = 176;
DELETE FROM clase_developers
WHERE id = 176;


-- buscar los nombres que se repiten mas de 5 veces
SELECT nombre, COUNT(*) as total
FROM clase_developers
GROUP BY nombre
HAVING total > 5;

SELECT * FROM clase_developers
WHERE nombre = 'Maria';

-- borrar registros limitados, solo se borran 5 registros
DELETE FROM clase_developers
WHERE nombre = 'Maria'
LIMIT 5;

SELECT * FROM clase_developers
WHERE nombre = 'Maria';

SELECT * FROM clase_developers
LIMIT 5;

